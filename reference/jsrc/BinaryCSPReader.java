import java.io.* ;
import java.util.* ;


/**
 * A reader tailored for binary extensional CSPs.
 * It is created from a FileReader and a StreamTokenizer
 */
public final class BinaryCSPReader {
  private FileReader inFR ;
  private StreamTokenizer in ;

  /**
   * Main (for testing)
   */
  public static void main(String[] args) {
    if (args.length < 4) {
      System.out.println("Usage: java BinaryCSPReader <file.csp> <search-type> <variable-selection-type> <value-selection-type> (optional) 'all-solutions'") ;
      return ;
    }

    BinaryCSPReader reader = new BinaryCSPReader() ;
    BinaryCSP.PruneType pruneType;
    BinaryCSP.ValType valType;
    BinaryCSP.VarType varType;

    if(args[1].equals("FC")){
      pruneType = BinaryCSP.PruneType.FC;
    } else if(args[1].equals("AC3")){
      pruneType = BinaryCSP.PruneType.AC3;
    } else if(args[1].equals("AC3_1")){
      pruneType = BinaryCSP.PruneType.AC3_1;
    }

    else {
      System.out.println("Valid search types are 'FC', 'AC3', 'AC3_1'") ;
      return ;
    }

    if(args[2].equals("ASC")){
      varType = BinaryCSP.VarType.ASC;
    } else if(args[2].equals("SMALL_DOM")){
      varType = BinaryCSP.VarType.SMALL_DOM;
    }
    else {
      System.out.println("Valid var search types are 'ASC', 'SMALL_DOM'") ;
      return ;
    }

    if(args[3].equals("ASC")){
      valType = BinaryCSP.ValType.ASC;
    } else if(args[3].equals("MIN_CONFLICTS")){
      valType = BinaryCSP.ValType.MIN_CONFLICTS;
    } else if(args[3].equals("MIN_CONFLICTS_FORCE_FC")){
      valType = BinaryCSP.ValType.MIN_CONFLICTS_FORCE_FC;
    }
    else {
      System.out.println("Valid val search types are 'ASC', 'MIN_CONFLICTS', 'MIN_CONFLICTS_FORCE_FC") ;
      return ;
    }
    

    Boolean allSolutions = false;
    if(args.length == 5 && args[4].equals("all-solutions")){
      allSolutions = true;
    }
    BinaryCSP instance = reader.readBinaryCSP(args[0], pruneType, varType, valType, allSolutions);
	  // System.out.println(instance);
    new BinaryCSPSolver(instance);
  }

  /**
   * File format:
   * <no. vars>
   * NB vars indexed from 0
   * We assume that the domain of all vars is specified in terms of bounds
   * <lb>, <ub> (one per var)
   * Then the list of constraints
   * c(<varno>, <varno>)
   * binary tuples
   * <domain val>, <domain val>
   */
  public BinaryCSP readBinaryCSP(String fn, BinaryCSP.PruneType pruneType, BinaryCSP.VarType varType, BinaryCSP.ValType valType, Boolean allSolutions) {
    try {
      inFR = new FileReader(fn) ;
      in = new StreamTokenizer(inFR) ;
      in.ordinaryChar('(') ;
      in.ordinaryChar(')') ;
      in.nextToken() ;                                         // n
      int n = (int)in.nval ;
      int[][] domainBounds = new int[n][2] ;
      for (int i = 0; i < n; i++) {
	      in.nextToken() ;                                  // ith ub
	      domainBounds[i][0] = (int)in.nval ;
		    in.nextToken() ;                                   // ','
		    in.nextToken() ;
	      domainBounds[i][1] = (int)in.nval ;
      }
      ArrayList<BinaryConstraint> constraints = readBinaryConstraints() ;
      ArrayList<BinaryArcConstraint> arcConstraints = new ArrayList<>();
      // creates a pair of binaryArcConstraints for each constraint
      // pointing at the same underlying constraint to reduce the amount of storage required
      for (BinaryConstraint constraint : constraints) {
          arcConstraints.add(new BinaryArcConstraint(false, constraint));
          arcConstraints.add(new BinaryArcConstraint(true, constraint));
      }

      BinaryCSP csp = new BinaryCSP(domainBounds, arcConstraints, pruneType, varType, valType, allSolutions);

      
      // TESTING:
      // System.out.println(csp) ;
      inFR.close() ;
      return csp ;
    }
    catch (FileNotFoundException e) {System.out.println(e);}
    catch (IOException e) {System.out.println(e);}
    return null ;
  }

  /**
   *
   */
  private ArrayList<BinaryConstraint> readBinaryConstraints() {
    ArrayList<BinaryConstraint> constraints = new ArrayList<BinaryConstraint>() ;
	
    try {
      in.nextToken() ;                                  //'c' or EOF
      while(in.ttype != StreamTokenizer.TT_EOF) {
	      // scope
	      in.nextToken() ;                                       //'('
		    in.nextToken() ;                                       //var
	      int var1 = (int)in.nval ;
		    in.nextToken() ;                                       //','
		    in.nextToken() ;                                       //var
        int var2 = (int)in.nval ;
		    in.nextToken() ;                                       //')'

        //tuples
		    ArrayList<BinaryTuple> tuples = new ArrayList<BinaryTuple>() ;
        in.nextToken() ;              //1st allowed val of 1st tuple
        while (!"c".equals(in.sval) && (in.ttype != StreamTokenizer.TT_EOF)) {
          int val1 = (int)in.nval ;
	        in.nextToken() ;                                   //','
	        in.nextToken() ;                               //2nd val
		      int val2 = (int)in.nval ;
		      tuples.add(new BinaryTuple(val1, val2)) ;
		      in.nextToken() ;      //1stallowed val of next tuple/c/EOF
		    }
        BinaryConstraint c = new BinaryConstraint(var1, var2, tuples) ;
        constraints.add(c) ;
      }
	  
      return constraints ;
    }
    catch (IOException e) {System.out.println(e);}
    return null ;  
  }
}

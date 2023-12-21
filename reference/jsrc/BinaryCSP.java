import java.util.* ;
import java.util.stream.IntStream;
import java.util.stream.Collectors;


public final class BinaryCSP {
  private int[][] domainBounds ;
  private ArrayList<BinaryArcConstraint> constraints ;
  private HashMap<Integer, ArrayList<BinaryArcConstraint>> reliantConstraints = new HashMap<Integer, ArrayList<BinaryArcConstraint>>();
  private OptionalInt[] varAssignments; // keeps track of what values have been assigned
  private ArrayList<List<Integer>> varDomains = new ArrayList<>(); // keep track of the available domain space for each variable
  private HashMap<BinaryArcConstraint, HashMap<Integer, Integer>> lastValid = new HashMap<BinaryArcConstraint, HashMap<Integer, Integer>>();
  private long numNodesSearched = 0l;
  private long numArcRevisions = 0l;
  private long startTime;

  public enum PruneType {
    FC,
    AC3,
    AC3_1
  }

  public enum VarType {
    ASC,
    SMALL_DOM,
  }
  
  public enum ValType {
    ASC,
    MIN_CONFLICTS,
    MIN_CONFLICTS_FORCE_FC,
    
  }
  public final PruneType pruneType;
  public final VarType varType;
  public final ValType valType;
  public final Boolean allSolutions;
  public BinaryCSP(int[][] db, ArrayList<BinaryArcConstraint> c, BinaryCSP.PruneType pruneType, BinaryCSP.VarType varType, BinaryCSP.ValType valType, Boolean allSolutions) {
    domainBounds = db ;
    constraints = c ;
    varAssignments = new OptionalInt[db.length];
    this.pruneType = pruneType;
    this.varType = varType;
    this.valType = valType;
    this.allSolutions = allSolutions;
    
    // assign a list for the domains of each var
    for (int i = 0; i < domainBounds.length; i ++) {
      // https://stackoverflow.com/questions/16711147/populating-a-list-with-a-contiguous-range-of-integers
      // List<Integer> range = IntStream.range(domainBounds[i][0], domainBounds[i][1] + 1).boxed().collect(Collectors.toList());
      // System.out.println(domainBounds.length);
      
      // add an arraylist for each var
      reliantConstraints.put(i, new ArrayList<BinaryArcConstraint>());

      ArrayList<Integer> range = new ArrayList<Integer>();
      for(int j = domainBounds[i][0]; j <= domainBounds[i][1]; j ++){
        
        range.add(j);
      }
      
      varDomains.add(range);
      // potentially slower than using null as the assignments, but safer
      // especially as iterating through anyways
      varAssignments[i] = OptionalInt.empty();
    }

    // do work early so that we have constant time lookup to the lists of reliant constraints
    // basically sorts constraints by the variable they are reliant on 
    for (BinaryArcConstraint binaryArcConstraint : c) {
      reliantConstraints.get(binaryArcConstraint.getSecondVar()).add(binaryArcConstraint);
    }

  }
  


  public String toString() {
    StringBuffer result = new StringBuffer() ;
    result.append("CSP:\n") ;
    for (int i = 0; i < domainBounds.length; i++)
      result.append("Var "+i+": "+domainBounds[i][0]+" .. "+domainBounds[i][1]+"\n") ;
    for (BinaryArcConstraint bc : constraints)
      result.append(bc.getConstraint()+"\n") ;
    return result.toString() ;
  }
  
  public int getNoVariables() {
    return domainBounds.length ;
  }
  
  public int getLB(int varIndex) {
    return domainBounds[varIndex][0] ;
  }
  
  public int getUB(int varIndex) {
    return domainBounds[varIndex][1] ;
  }
  
  public ArrayList<BinaryArcConstraint> getConstraints() {
    return constraints ;
  }

  // public void setConstraints(ArrayList<BinaryArcConstraint> constraints) {
  //   this.constraints = constraints;
  // }



  public ArrayList<List<Integer>> getVarDomains() {
    return varDomains;
  }



  public void setVarDomains(ArrayList<List<Integer>> varDomains) {
    this.varDomains = varDomains;
  }



  public OptionalInt getVarAssignment(int var) {
    return varAssignments[var];
  }

  public List<Integer> getVarDomain(int var) {
    return varDomains.get(var);
  }

  // removes a value from the domain of the var
  public void deleteDomValue(int var, int val){
    // using Integer.valueof to ensure that we remove by value and not by index
 
    List<Integer> innerList = varDomains.get(var);
 
    innerList.remove(Integer.valueOf(val));
    varDomains.set(var, innerList);


    // if(varDomains.get(var).size() == initialLength){
    //   for(int i = 0; i < getNoVariables(); i ++){
    //       BinaryCSPSolver.printDomain(getVarDomain(i));
    //   }
      
    //   System.exit(1);
    // }
    
    

  }

  public void setVarDomain(int var, List<Integer> varDomain) {
    this.varDomains.set(var, varDomain);
  }

  // allows the assignment of a variable
  public void assign(int var, int val){
    varAssignments[var] = OptionalInt.of(val);
    
  }
  public void unassign(int var){
    varAssignments[var] = OptionalInt.empty();
  }


  public void incrementNodesSearched(){
    numNodesSearched += 1;
  }

  public void incrementArcRevisions(){
    numArcRevisions += 1;
  }

  public long getNodesSearched(){
    return numNodesSearched;
  }

  public long getArcRevisions(){
    return numArcRevisions;
  }

  public void instantiateConstraintMap(BinaryArcConstraint constraint){
    this.lastValid.put(constraint, new HashMap<Integer, Integer>());
  }
  public HashMap<BinaryArcConstraint, HashMap<Integer, Integer>> getLastValid() {
    return lastValid;
  }
  
  public void setLastValid(HashMap<BinaryArcConstraint, HashMap<Integer, Integer>> lastValid){
    this.lastValid = lastValid;
  }

   public int getLastValidValuePos(BinaryArcConstraint constraint, int domPos){
    return lastValid.get(constraint).get(domPos);
  }
  public void setLastValidValue(BinaryArcConstraint constraint, int domPos, int val) {
    this.lastValid.get(constraint).put(domPos, val); 
  }

  public void setStartTime(){
    this.startTime = System.currentTimeMillis();
  }

  public long getStartTime(){
    return this.startTime;
  }

  public OptionalInt[] getVarAssignments(){
    return varAssignments;
  }

  public ArrayList<BinaryArcConstraint> getReliantConstraints(int checkVar) {
    return reliantConstraints.get(checkVar);
  }

  public void setReliantConstraints(HashMap<Integer, ArrayList<BinaryArcConstraint>> reliantConstraints) {
    this.reliantConstraints = reliantConstraints;
  }

}

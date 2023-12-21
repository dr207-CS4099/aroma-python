import java.util.* ;

public final class BinaryConstraint {
  private int firstVar, secondVar ;
  private ArrayList<BinaryTuple> tuples ;
  
  public BinaryConstraint(int fv, int sv, ArrayList<BinaryTuple> t) {
    firstVar = fv ;
    secondVar = sv ;
    tuples = t ;
  }

  // creates a deep copy of the passed in constraint
  // this is not actually used TODO
  public BinaryConstraint(BinaryConstraint constraint){
    this.firstVar = constraint.getFirstVar();
    this.secondVar = constraint.getSecondVar();
    this.tuples = new ArrayList<BinaryTuple>();
    for (BinaryTuple binaryTuple : constraint.getTuples()) {
      tuples.add(new BinaryTuple(binaryTuple.getVal1(), binaryTuple.getVal2()));
    }
  }



  public String toString() {
    StringBuffer result = new StringBuffer() ;
    result.append("c("+firstVar+", "+secondVar+")\n") ;
    for (BinaryTuple bt : tuples)
      result.append(bt+"\n") ;
    return result.toString() ;
  }


  public int getFirstVar() {
    return firstVar;
  }
  public void setFirstVar(int firstVar) {
    this.firstVar = firstVar;
  }
  public int getSecondVar() {
    return secondVar;
  }
  public void setSecondVar(int secondVar) {
    this.secondVar = secondVar;
  }
  public ArrayList<BinaryTuple> getTuples() {
    return tuples;
  }
  public void setTuples(ArrayList<BinaryTuple> tuples) {
    this.tuples = tuples;
  }


  // SUGGESTION: You will want to add methods here to reason about the constraint


  // take two values and check if they are in a tuple for this constraint
  // we take a boolean to flag if the check should be inverted (to allow for bidirectionality)
  public Boolean cCheck(int val1, int val2, Boolean isInverted){
    int v1,v2;

    if(!isInverted){
      v1 = val1;
      v2 = val2;
    } else {
      v1 = val2;
      v2 = val1;
    }
    for (BinaryTuple tuple : tuples) {
      
      if(tuple.matches(v1, v2)){
        return true;
      }
    }

    return false;
  }
}

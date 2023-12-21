
// allows for directional constraints by storing if values should be read inverted or not
public class BinaryArcConstraint {
    private final Boolean isInverted;
    private BinaryConstraint constraint;

    BinaryArcConstraint(Boolean isInverted, BinaryConstraint constraint){
        this.isInverted = isInverted;
        this.constraint = constraint;
    }

    // return first and second value, after dealing with inversion here to make the solution clearer
    public int getFirstVar(){
        if(isInverted){
            return constraint.getSecondVar();
        } else {
            return constraint.getFirstVar();
        }
    }

     public int getSecondVar(){
        if(isInverted){
            return constraint.getFirstVar();
        } else {
            return constraint.getSecondVar();
        }
    }

    public Boolean getIsInverted() {
        return isInverted;
    }

    public BinaryConstraint getConstraint() {
        return constraint;
    }

    public void setConstraint(BinaryConstraint constraint) {
        this.constraint = constraint;
    }

    
}

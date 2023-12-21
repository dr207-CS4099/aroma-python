import java.util.ArrayList;
import java.util.HashMap;

public class RevertData {
    private int changed;
    // hashmap as we will not always have all of them, so we need to be able to retain the var that it is for
    private HashMap<Integer, ArrayList<Integer>> changedDomains = new HashMap<Integer, ArrayList<Integer>>();
    private HashMap<BinaryArcConstraint, HashMap<Integer, Integer>> changedLastValid = new HashMap<BinaryArcConstraint, HashMap<Integer, Integer>>();



    // basically everytime there is a change, if the var domain is not being saved, save it before deleting values

    RevertData(){

    }

    public int getChanged() {
        return changed;
    }



    public void setChanged(int changed) {
        this.changed = changed;
    }

    public void incrementChanged(){
        this.changed ++;
    }

    public HashMap<Integer, ArrayList<Integer>> getChangedDomains() {
        return changedDomains;
    }



    public void setChangedDomains(HashMap<Integer, ArrayList<Integer>> changedDomains) {
        this.changedDomains = changedDomains;
    }



    public HashMap<BinaryArcConstraint, HashMap<Integer, Integer>> getChangedLastValid() {
        return this.changedLastValid;
    }



    public void setChangedLastValid(HashMap<BinaryArcConstraint, HashMap<Integer, Integer>> changedLastValid) {
        this.changedLastValid = changedLastValid;
    }

    public HashMap<Integer, Integer> getLastValidInnerMap(BinaryArcConstraint constraint){
        return this.changedLastValid.get(constraint);
    }
}

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.IntStream;



import java.util.stream.Collectors;

public class BinaryCSPSolver {
    private BinaryCSP instance;
    private ArrayList<ArrayList<Integer>> allSolutions = new ArrayList<ArrayList<Integer>>(); 
    BinaryCSPSolver(BinaryCSP instance){
        
        this.instance = instance;

        List<Integer> varList = IntStream.range(0, instance.getNoVariables()).boxed().collect(Collectors.toList());
        instance.setStartTime();
        int result = 0;
        // only create arc consistency if running ac3 algorithm
        if(!(instance.pruneType == BinaryCSP.PruneType.FC)){
            result = createArcConsistency(instance.getConstraints(), varList).getChanged();
        }
        if(result >= 0){

            search2Way(varList);
            long stopTime = System.currentTimeMillis();

            if(instance.allSolutions){
                
                
               
                for(ArrayList<Integer> sol : allSolutions){
                    System.out.println("/////////////////////////////////////");
                    // for(int i = 0; i < sol.size(); i ++){
                    //     System.out.println("Var: " + i + " Val: " + sol.get(i));
                    
                    // }
                    // VisualChecker.drawChess(sol);
                }
                
                System.out.println("Total time " + (stopTime - instance.getStartTime()) + "ms");
                System.out.println("Nodes searched: " + instance.getNodesSearched());
                System.out.println("Arc Revisions: " + instance.getArcRevisions());
                System.out.println("No. Solutions: " + allSolutions.size());

            } else {
                // if we reach this point, we are on single solution search and have not found any as otherwise we would have terminated early
                System.out.println("Total time " + (stopTime - instance.getStartTime()) + "ms");
                System.out.println("Nodes searched: " + instance.getNodesSearched());
                System.out.println("Arc Revisions: " + instance.getArcRevisions());
                System.out.println("No solutions");
            }


            
        }


        else {System.out.println("not consistent");}

    } // will take some state but currently unsure on implementation

    


    private int selectVarByDomain(List<Integer> varList){
        // for now just return in order, later use smallest domain
        // TODO set this with a flag
        // return varList.get(0);
        
        // smallest domain first
        // ties are broken by using < therefore if equal first value (lower index has precedence)
        // TODO why is this not really doing anything?
        int smallestDomain = instance.getVarDomain(varList.get(0)).size();
        int smallestVar = varList.get(0);

        for (int var = 1; var < varList.size(); var ++) {
            int checkIfSmaller = instance.getVarDomain(varList.get(var)).size();
            if(checkIfSmaller < smallestDomain){
                smallestDomain = checkIfSmaller;
                smallestVar = varList.get(var);
            }
        }


        return smallestVar;


    }

    private int selectVal(int var){
        // for now just return the lowest value, should do ssosoomething else later
        return instance.getVarDomain(var).get(0);
    }

    private int selectValByConflicts(int var, List<Integer> varList){
        List<Integer> varDomain = instance.getVarDomain(var);
        int currentSize = 0;
        for (Integer varCheck : varList) {
            currentSize += instance.getVarDomain(varCheck).size();
                    
        } 
        int minConflicts = -1;
        int minConflictsVal = varDomain.get(0);
        
        // get all of the unassigned variables
        // check which domains are still possible after assignment
        // take those out?

        // basically for each value, run the appropriate check forward check / MAC
        // then see how many values are left
        // then revert to the current settings
        for (int i = 0; i < varDomain.size(); i ++) {
            int val = varDomain.get(i);
            instance.assign(var, val);
            // used to revert back if we have to
            // if we are not using AC3_1, this will return itself, causing minimal slowdown as constant time assignment by reference
            // HashMap<BinaryArcConstraint, HashMap<Integer, Integer>> revertLastValid = deepCopy2DIntMap(instance.getLastValid());
            // ArrayList<List<Integer>> revertVarDoms = deepCopy2DIntList(instance.getVarDomains());
            RevertData revertData;
            if(instance.pruneType == BinaryCSP.PruneType.FC || instance.valType == BinaryCSP.ValType.MIN_CONFLICTS_FORCE_FC){
                revertData = forwardChecking(instance.getConstraints(), var, varList);
            } else {
                revertData = maintainArcConsistency(instance.getConstraints(), var, varList);
                // revertData = forwardChecking(instance.getConstraints(), var, varList);
            }
            // no errors
            if(revertData.getChanged() >= 0 ){
                int remainingOptions = 0;
                for (Integer varCheck : varList) {
                    remainingOptions += instance.getVarDomain(varCheck).size();
                    
                } 
                if(remainingOptions > minConflicts){
                    minConflicts = remainingOptions;
                    minConflictsVal = val;
                }
            }
            // instance.setVarDomains(revertVarDoms);
            // instance.setLastValid(revertLastValid);

            for(Map.Entry<Integer, ArrayList<Integer>> entry: revertData.getChangedDomains().entrySet()){
                instance.setVarDomain(entry.getKey(), entry.getValue());
            }

            if(instance.pruneType == BinaryCSP.PruneType.AC3_1){
                for(Map.Entry<BinaryArcConstraint, HashMap<Integer, Integer>> entry: revertData.getChangedLastValid().entrySet()){
                    for(Map.Entry<Integer, Integer> innerEntry : entry.getValue().entrySet()){
                        instance.setLastValidValue(entry.getKey(), innerEntry.getKey(), innerEntry.getValue());
                    }
                }
            }
            


            
        }
        
        return minConflictsVal;
    
    }
    
    
    /**
     * 
     * @param depth current depth and therefore how many variables have been assigned (not true in this model)
     * @param variableNo as we asign 2 way, we only look at one value of the domain in each instance, and recur with incremented variableNo
     */
    private void search2Way(List<Integer> varList){
        
        Boolean consistent = true;

        
        // split tree
        int var;
        if(instance.varType == BinaryCSP.VarType.ASC){
            var = varList.get(0);
        } else {
            var = selectVarByDomain(varList);
        }
        int val;
        if(instance.valType == BinaryCSP.ValType.ASC){
            val = selectVal(var); 

        } else {
            val = selectValByConflicts(var, varList);
        }
        
        searchLeft(varList, var, val);
      
        
        searchRight(varList, var, val);




    }
    

    private void searchLeft(List<Integer> varList, int var, int val){
        instance.incrementNodesSearched();
        // System.out.println("LHS");
        // TODO should be checking for being solved here
        instance.assign(var, val);
        // if every variable has been assigned
        // System.out.println("varList is: " + varList);

        // 1 as varList will contain the final variable (var) at this point
        if(varList.size() == 1){
            if(!instance.allSolutions){
                System.out.println("Total time " + (System.currentTimeMillis() - instance.getStartTime()) + "ms");
                System.out.println("Nodes searched: " + instance.getNodesSearched());
                System.out.println("Arc Revisions: " + instance.getArcRevisions());
                // for(int i = 0; i < instance.getNoVariables(); i ++){
                //     System.out.println("Var: " + i + " Val: " + instance.getVarAssignment(i).getAsInt());
                    
                // }
                
                // running these will allow for visual checking
                // (the chess checker will also logically check it)
                // note that these are for testing, and can crash the solution if the wrong problem instance
                // is given to it. as for example we cannot check a sudoku with say 30 variables
                // VisualChecker.drawChess(instance);
                // VisualChecker.drawSudoku(instance);
                // VisualChecker.drawLangsfords(instance);
                
                System.exit(0);
            }
            // store solution then force backtrack so that we will keep checking all solutions
            else {
                ArrayList<Integer> sol = new ArrayList<Integer>();
                for(int i = 0; i < instance.getNoVariables(); i ++){
                    sol.add(instance.getVarAssignment(i).getAsInt());
                    
                }
                allSolutions.add(sol);
                instance.unassign(var);
                return;
            }
            
            
        }
        //print solution and exit

        
        // used to revert back if we have to
        // ArrayList<List<Integer>> revertVarDoms = deepCopy2DIntList(instance.getVarDomains());
        
        // if we are not using AC3_1, this will return itself, causing minimal slowdown as constant time assignment by reference
        // HashMap<BinaryArcConstraint, HashMap<Integer, Integer>> revertLastValid = deepCopy2DIntMap(instance.getLastValid());
        
        

        // if still maintaining arc consistency, then we can continue into the tree
        // looks like it is adding additional work, but I suspect the compiler can handle this pretty well since the pruneType is final
        RevertData revertData;
        if(instance.pruneType == BinaryCSP.PruneType.FC){
            revertData = forwardChecking(instance.getConstraints(), var, varList);
        } else {
            revertData = maintainArcConsistency(instance.getConstraints(), var, varList);
        }

        // no errors
        if (revertData.getChanged() >= 0){
            
            // allows us to revert to the original varList as required
            ArrayList<Integer> tempList = deepCopyIntList(varList);
            // variable has been assigned so we no longer need to worry about it.
            tempList.remove(Integer.valueOf(var));
            search2Way(tempList);

            
            
        }
        // remove pruning and unasign
        // unasign
        instance.unassign(var);
        
        // instance.setVarDomains(revertVarDoms);
        //revert the domains
        for(Map.Entry<Integer, ArrayList<Integer>> entry: revertData.getChangedDomains().entrySet()){
            instance.setVarDomain(entry.getKey(), entry.getValue());
        }

        if(instance.pruneType == BinaryCSP.PruneType.AC3_1){
            for(Map.Entry<BinaryArcConstraint, HashMap<Integer, Integer>> entry: revertData.getChangedLastValid().entrySet()){
                for(Map.Entry<Integer, Integer> innerEntry : entry.getValue().entrySet()){
                    instance.setLastValidValue(entry.getKey(), innerEntry.getKey(), innerEntry.getValue());
                }
            }
        }
        // constant time assignment by reference, so even if we are not using this it is not a significant issue
        // instance.setLastValid(revertLastValid);
        
        
        // might be faster to just use a stack of states?
    }

    private void searchRight(List<Integer> varList, int var, int val){
        instance.incrementNodesSearched();
        // System.out.println("RHS");
        // remove this value as an option from the domain
        // use list for domain options
        ArrayList<Integer> revertDomain = deepCopyIntList(instance.getVarDomain(var));
        
        // System.out.println(instance.getVarDomain(var).size());
        
        instance.deleteDomValue(var, val);
        // System.out.println(instance.getVarDomain(var).size());
        if(instance.getVarDomain(var).size() > 0){
            // used to revert back if we have to
            // only do these if we still have domain values as they are expensive
            //ArrayList<List<Integer>> revertVarDoms = deepCopy2DIntList(instance.getVarDomains());
            // HashMap<BinaryArcConstraint, HashMap<Integer, Integer>> revertLastValid = deepCopy2DIntMap(instance.getLastValid());
            // if still maintaining arc consistency, then we can continue into the tree
            RevertData revertData;
            if(instance.pruneType == BinaryCSP.PruneType.FC){
                revertData = forwardChecking(instance.getConstraints(), var, varList);
            } else {
                revertData = maintainArcConsistency(instance.getConstraints(), var, varList);
            }

            // no errors
            if (revertData.getChanged() >= 0){
                search2Way(varList);
            }



            // instance.setVarDomains(revertVarDoms);
            for(Map.Entry<Integer, ArrayList<Integer>> entry: revertData.getChangedDomains().entrySet()){
                instance.setVarDomain(entry.getKey(), entry.getValue());
            }

            if(instance.pruneType == BinaryCSP.PruneType.AC3_1){
                for(Map.Entry<BinaryArcConstraint, HashMap<Integer, Integer>> entry: revertData.getChangedLastValid().entrySet()){
                    for(Map.Entry<Integer, Integer> innerEntry : entry.getValue().entrySet()){
                        instance.setLastValidValue(entry.getKey(), innerEntry.getKey(), innerEntry.getValue());
                    }
                }
            }
            // instance.setLastValid(revertLastValid);

        }
        
        
        instance.setVarDomain(var, revertDomain);
        

        // add value back to list

        
    }

    /**
     * forward checking of the arcs directly relying on the altered var
     */
    private RevertData forwardChecking(List<BinaryArcConstraint> constraints, int var, List<Integer> varList){

        LinkedList<BinaryArcConstraint> constraintQueue = new LinkedList<BinaryArcConstraint>();
        RevertData revertData = new RevertData();
        int checkVal = 0;
        for (BinaryArcConstraint constraint : instance.getReliantConstraints(var)) {
            // adding all arcs that include this var
            
            // checking for arc consistency
            // only perform varList lookup if we have to as more expensive
            // do not need to check any constraints from pre assigned variables
            if(varList.contains(constraint.getFirstVar())){
                revertData = revise(revertData, constraint);
                if (revertData.getChanged() == -1){
                    return revertData;
                }
            }
        }

        // consistent after forward checking so return true
        return revertData;
    }



    private RevertData arcConsistency(LinkedList<BinaryArcConstraint> constraintQueue, List<BinaryArcConstraint> constraints, List<Integer> varList){
        HashSet<BinaryArcConstraint> constraintSet = new HashSet<BinaryArcConstraint>(constraintQueue);
        BinaryArcConstraint currentConstraint;
        RevertData revertData = new RevertData();
        while(!constraintQueue.isEmpty()){
            currentConstraint = constraintQueue.poll();
            constraintSet.remove(currentConstraint);
            revertData = revise(revertData, currentConstraint);
            if(revertData.getChanged() == -1){
                // no longer consistent and we can reject
                // System.out.println("not consistent");
                return revertData;
            } else if(revertData.getChanged() > 0){
                // domain updated so we must add to the queue

                int checkVar = currentConstraint.getFirstVar(); // var that we will add arcs for
                int excludeVar = currentConstraint.getSecondVar(); // var for which we do not need to add the arc as we have just checked the inverse

                // iterate through every constraint and add to queue if they have potentially been affected
                for (BinaryArcConstraint checkConstraint : instance.getReliantConstraints(checkVar)) {
                    
                    // checking for arc consistency
                    // only perform varList lookup if we have to as more expensive
                    // do not need to check any constraints from pre assigned variables
                    if((!(checkConstraint.getFirstVar() == excludeVar)) && !(constraintSet.contains(checkConstraint)) && varList.contains(checkConstraint.getFirstVar())){
                        constraintQueue.add(checkConstraint);
                        constraintSet.add(checkConstraint);
                    }

                }

            }
            // if result == 0 we do nothing
        }
        return revertData;

    }

    



    /**
     * function to return the list of all constraints involving a var that has has been altered
     */
    private RevertData maintainArcConsistency(List<BinaryArcConstraint> constraints, int var, List<Integer> varList){


        LinkedList<BinaryArcConstraint> constraintQueue = new LinkedList<BinaryArcConstraint>();
        int checkVal = 0;
        for (BinaryArcConstraint constraint : instance.getReliantConstraints(var)) {
            // adding all arcs that include this var
            

            // checking for arc consistency
            // do not need to check any constraints from pre assigned variables
            if(varList.contains(constraint.getFirstVar())){
                constraintQueue.add(constraint);
            }

        }
        
        return arcConsistency(constraintQueue, constraints, varList);
    }

    
    /**
     * called to create the initial global arc consistency
     */
    private RevertData createArcConsistency(List<BinaryArcConstraint> constraints, List<Integer> varList){

        LinkedList<BinaryArcConstraint> constraintQueue = new LinkedList<BinaryArcConstraint>();
        int var1 = 0;
        int var2 = 0;
        int val = 0;
        for (BinaryArcConstraint constraint : constraints) {
            // add all arcs from this constraint to the queue
            constraintQueue.add(constraint);


            // only called if using AC3_1
            if(instance.pruneType == BinaryCSP.PruneType.AC3_1){
                // first value in the domain is the smallest
                val = instance.getVarDomain(constraint.getSecondVar()).get(0) - 1;


                instance.instantiateConstraintMap(constraint);
                List<Integer> varDomain = instance.getVarDomain(constraint.getFirstVar());
            
                for(int i = 0; i < varDomain.size(); i ++){
                    instance.setLastValidValue(constraint, varDomain.get(i), val);
        
                }
            }
            
        }
        
        return arcConsistency(constraintQueue, constraints, varList);
    }

    private RevertData revise(RevertData revertData, BinaryArcConstraint constraint){

        instance.incrementArcRevisions();


        // probably going to take an arc constraint
        // System.out.println("constraint is " + arcConstraint.getConstraint() + "Inverted: " + arcConstraint.getIsInverted());
        revertData.setChanged(0);
        int var1 = constraint.getFirstVar();
        int var2 = constraint.getSecondVar();
        
        
        List<Integer> firstDom = new ArrayList<>();
        List<Integer> secondDom = new ArrayList<>();


        // first check if either of these have been assigned (as this is therefore the only valid domain)
        // could set the domain to be only the assigned variable at the time of assigning, but no real need to
        // and by not doing so means there is less work to be done to revert an assignment
        if(instance.getVarAssignment(var1).isPresent()){
            firstDom.add(instance.getVarAssignment(var1).getAsInt());
        } else {
            firstDom = instance.getVarDomain(var1);
        }

        if(instance.getVarAssignment(var2).isPresent()){
            secondDom.add(instance.getVarAssignment(var2).getAsInt());
        } else {
            secondDom = instance.getVarDomain(var2);
        }
        
        // iterate through backwards so that removing elements is safe
        for(int i = firstDom.size() - 1; i >= 0; i --){
            int d1 = firstDom.get(i);
            // System.out.println("d1 is " + d1);
            Boolean supported = false;



            // using AC3_1 efficiency improvements
            if(instance.pruneType == BinaryCSP.PruneType.AC3_1){
                int last = instance.getLastValidValuePos(constraint, d1);
            
                // successful value still exists so no further work to be done
                if(secondDom.contains(last)){
                    supported = true;
                }
                else {
                    int lastPos = 0;
                    // find the value closest (and > the last value we checked)
                    // should never 
                    for (int pos = 0; pos < secondDom.size(); pos ++) {
                        if(secondDom.get(pos) > last){
                            lastPos = pos;
                            
                            break;
                        }
                    }
                
                    // only check those after last
                    for (int j = lastPos; j < secondDom.size(); j ++) { 
                        int d2 = secondDom.get(j);
                        // System.out.println("d2 is " + d2);  
                        // checks if there is a constraint that satisfies these values
                        // again using flag to tell which way round to look at values
                        if(constraint.getConstraint().cCheck(d1, d2, constraint.getIsInverted())){
                            supported = true;
                            //set revertData last if it has not already been set
                            
                            if(!revertData.getChangedLastValid().containsKey(constraint)){
                                revertData.getChangedLastValid().put(constraint, new HashMap<Integer, Integer>());
                            }
                            HashMap<Integer, Integer> lastValidStore = revertData.getLastValidInnerMap(constraint);
                            if(!lastValidStore.containsKey(d1)){
                                lastValidStore.put(d1, last);
                            }
                            instance.setLastValidValue(constraint, d1, d2);
                            // stop looping once we know that d1 is supported
                            break;
                        }
                        
                    }
                }

            }
            // not using AC3_1 efficency improvements
            else {
                for (Integer d2 : secondDom) {  
                // System.out.println("d2 is " + d2);  
                // checks if there is a constraint that satisfies these values
                // again using flag to tell which way round to look at values
                    if(constraint.getConstraint().cCheck(d1, d2, constraint.getIsInverted())){
                        supported = true;
                        // stop looping once we know that d1 is supported
                        break;
                    }
                
                }
            }
            
            
            // if there is no valid value for var2 upon var1 == d1, then we remove d1 from the domain
            if(!supported){

                // only add the domain if it is not already being stored

                HashMap<Integer, ArrayList<Integer>> domainStore = revertData.getChangedDomains();
                if(!domainStore.containsKey(var1)){
                    domainStore.put(var1, deepCopyIntList(instance.getVarDomain(var1)));
                }
                instance.deleteDomValue(var1, d1);
                
                // atleast one value in the domain removed so we flag to add to queue
                revertData.incrementChanged();
                // changed ++;
            }
        }
        if(instance.getVarDomain(var1).size() == 0){
            // System.out.println("Empty domain");
            // ERROR maybe throw an exception? although I think that is slow?
            // tbh could count the number of changes, and use -1 for error
            // no real reason to count them but I suppose we might aswell
            revertData.setChanged(-1);
            return revertData;
            // return -1;
        } else {
            // if any value removed than changed > 0.
            
            return revertData;
        }
    }

    


    //helper functions to create deep copies for reverting back to

    private ArrayList<Integer> deepCopyIntList(List<Integer> intList){
        ArrayList<Integer> deepCopy = new ArrayList<Integer>();

        for (Integer val : intList) {
            deepCopy.add(val);
        }

        return deepCopy;
    }

    private ArrayList<List<Integer>> deepCopy2DIntList(ArrayList<List<Integer>> intNestedList){
        ArrayList<List<Integer>> deepCopy = new ArrayList<>();
        for (List<Integer> innerList : intNestedList) {
            deepCopy.add(deepCopyIntList(innerList));
        }

        return deepCopy;
    }
    
    private HashMap<Integer, Integer> deepCopyIntMap(HashMap<Integer, Integer> intMap){
        HashMap<Integer, Integer> deepCopy = new HashMap<Integer, Integer>();
        for(Map.Entry<Integer, Integer> entry : intMap.entrySet()){
            deepCopy.put(entry.getKey(), entry.getValue());
        }
        
        return deepCopy;
    }

    // create clone of the hashmap to revert to 
    private HashMap<BinaryArcConstraint, HashMap<Integer, Integer>> deepCopy2DIntMap(HashMap<BinaryArcConstraint, HashMap<Integer, Integer>> lastValid){
        if(instance.pruneType != BinaryCSP.PruneType.AC3_1){
            return lastValid;
        }
        HashMap<BinaryArcConstraint, HashMap<Integer, Integer>> deepCopy = new HashMap<BinaryArcConstraint, HashMap<Integer, Integer>>();
        for(Map.Entry<BinaryArcConstraint, HashMap<Integer, Integer>> entry: lastValid.entrySet()){
            deepCopy.put(entry.getKey(), deepCopyIntMap(entry.getValue()));
        }

        return deepCopy;
    }

    // quality of life printing out list of ints
    public static void printDomain(List<Integer> Domain){
        System.out.print("[ ");
        for (Integer integer : Domain) {
            System.out.print(integer + " ");
        }
        System.out.println("]");
    }
}   

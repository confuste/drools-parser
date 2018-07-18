package drools.rule;


import java.util.ArrayList;
import java.util.List;

/**
 * Represents the Left hand side (LHS) of a rule
 * It have a list of conditions
 */
public class LeftHandSide {

    private List<LhsCondition> lhsConditionList;

    public LeftHandSide(){
        this.lhsConditionList = new ArrayList<>();
    }

    public void addLhsCondition(LhsCondition lhsCondition){
        this.lhsConditionList.add(lhsCondition);
    }

    public List<LhsCondition> getLhsConditionList() {
        return lhsConditionList;
    }
}



package drools.rule;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 25/6/18.
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



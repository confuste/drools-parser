package drools.rule.lhs;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Represents the Left hand side (LHS) of a rule
 * It have a list of conditions
 */
public class LeftHandSide {


    private int idUnique;
    private List<LhsCondition> lhsConditionList;

    public LeftHandSide(){
        this.idUnique = 0;
        this.lhsConditionList = new ArrayList<>();
    }

    public void addLhsCondition(LhsCondition lhsCondition){
        this.lhsConditionList.add(lhsCondition);
    }

    public List<LhsCondition> getLhsConditionList() {
        return lhsConditionList;
    }

    public void setLhsConditionList(List<LhsCondition> lhsConditionList) {
        this.lhsConditionList = lhsConditionList;
    }

    public int getIdUnique() {
        return idUnique;
    }

    public void setIdUnique(int idUnique) {
        this.idUnique = idUnique;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LeftHandSide that = (LeftHandSide) o;

        return lhsConditionList != null ? (new HashSet<>(this.lhsConditionList).equals(new HashSet<>(that.lhsConditionList))) : that.lhsConditionList == null;
    }

}



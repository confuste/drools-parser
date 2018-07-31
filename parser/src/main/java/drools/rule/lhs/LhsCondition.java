package drools.rule.lhs;

import java.util.*;

/**
 * Represents a condition of a Rule Left Hand Side.
 * It has the id, the object type and the constraint list.
 */
public class LhsCondition implements Comparator<LhsCondition>{


    private String id;
    private String objectType;
    private List<String> constraintList;

    public LhsCondition(){
        this.constraintList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public List<String> getConstraintList() {
        return constraintList;
    }

    public void setConstraintList(List<String> constraintList) {
        this.constraintList = constraintList;
    }

    public void addConstraint(String constraint){
        this.constraintList.add(constraint);
    }


    @Override
    public int compare(LhsCondition o1, LhsCondition o2) {
        return o1.id.compareTo(o2.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LhsCondition that = (LhsCondition) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (objectType != null ? !objectType.equals(that.objectType) : that.objectType != null) return false;


        return constraintList != null ? (new HashSet<>(this.constraintList).equals(new HashSet<>(that.constraintList))) : that.constraintList == null;
    }


}

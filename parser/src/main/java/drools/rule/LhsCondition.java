package drools.rule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 25/6/18.
 */
public class LhsCondition {


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

}

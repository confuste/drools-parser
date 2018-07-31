package neo4jrepository.neo4jmodel;



import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by alex on 16/7/18.
 */
@NodeEntity(label="LHS")
public class Neo4jLeftHandSide {

    /*
    https://stackoverflow.com/questions/10930624/creating-json-objects-directly-from-model-classes-in-java
    */


    @Id
    private int idUnique;
    private String LhsCondition;

//    private String id;
//    private String objectType;
//    private String [] constraintArray;

    public Neo4jLeftHandSide(){

    }

    public int getIdUnique() {
        return idUnique;
    }

    public void setIdUnique(int idUnique) {
        this.idUnique = idUnique;
    }

    public String getLhsCondition() {
        return LhsCondition;
    }

    public void setLhsCondition(String lhsCondition) {
        LhsCondition = lhsCondition;
    }

    //    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getObjectType() {
//        return objectType;
//    }
//
//    public void setObjectType(String objectType) {
//        this.objectType = objectType;
//    }
//
//    public String[] getConstraintArray() {
//        return constraintArray;
//    }
//
//    public void setConstraintArray(String[] constraintArray) {
//        this.constraintArray = constraintArray;
//    }
//
//    public List<String> getConstraintArrayList(){
//        return new ArrayList<>(Arrays.asList(this.constraintArray));
//    }


}

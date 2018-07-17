package repository.neo4j;


import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by alex on 16/7/18.
 */
@NodeEntity(label="Attribute")
public class Neo4jAttribute {

    @Id
    private String attribute;


    public Neo4jAttribute(){

    }



    public Neo4jAttribute(String attribute) {
        this.attribute = attribute;
    }


    public String[] getKeyValue(){
        return this.attribute.split("=");
    }


    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}

package neo4jrepository.neo4jmodel;


import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Node Entity of a Attribute
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

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }


    /**
     * Split the String key=value in a Array with both Strings
     * @return String array
     */
    protected String[] getKeyValue(){
        return this.attribute.split("=");
    }



}

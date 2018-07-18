package neo4jrepository.neo4jmodel;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by alex on 16/7/18.
 */

@NodeEntity(label = "Metadata")
public class Neo4jMetadata {

    @Id
    private String metadata;


    public Neo4jMetadata(){

    }

    public Neo4jMetadata(String metadata) {
        this.metadata = metadata;
    }


    /**
     * Split the String key=value in a Array with both Strings
     * @return String array
     */

    protected String[] getKeyValue(){
        return this.metadata.split("=");
    }
}

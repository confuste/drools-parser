package repository.neo4j;

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


    public String[] getKeyValue(){
        return this.metadata.split("=");
    }
}

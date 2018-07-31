package neo4jrepository.neo4jmodel;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by alex on 16/7/18.
 */
@NodeEntity(label="RHS")
public class Neo4jConsequence {

    @Id
    private int idUnique;
    private String [] consequence;

    public Neo4jConsequence(){

    }

    public Neo4jConsequence(int id) {
        this.idUnique = id;
    }

    public int getIdUnique() {
        return idUnique;
    }

    public void setIdUnique(int idUnique) {
        this.idUnique = idUnique;
    }

    public String [] getConsequence() {
        return consequence;
    }

    public void setConsequence(String [] consequence) {
        this.consequence = consequence;
    }
}

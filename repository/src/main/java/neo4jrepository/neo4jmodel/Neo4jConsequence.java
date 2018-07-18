package neo4jrepository.neo4jmodel;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

/**
 * Created by alex on 16/7/18.
 */
public class Neo4jConsequence {

    @Id
    @GeneratedValue
    private Long id;
    private String consequence;

    public Neo4jConsequence(){

    }

    public Neo4jConsequence(String consequence) {
        this.consequence = consequence;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConsequence() {
        return consequence;
    }

    public void setConsequence(String consequence) {
        this.consequence = consequence;
    }
}

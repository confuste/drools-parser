package neo4jrepository.neo4jmodel;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Node Enttity of a Rule
 */
@NodeEntity(label="Rule")
public class Neo4jRule {

    @Id
    private String name;
    private String salience;
    private String namespace;
    private String metadata;
    private String attribute;


    @Relationship(type = "HAS_LHS", direction = Relationship.OUTGOING)
    private Neo4jLeftHandSide leftHandSide;
    //private Set<Neo4jLeftHandSide> leftHandSideHashSet = new HashSet<>();


    @Relationship(type = "HAS_RHS", direction = Relationship.OUTGOING)
    private Neo4jConsequence consequence;
    //private Set<Neo4jConsequence> consequenceSet = new HashSet<>();




    public Neo4jRule() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalience() {
        return salience;
    }

    public void setSalience(String salience) {
        this.salience = salience;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Neo4jConsequence getConsequence() {
        return consequence;
    }

    public void setConsequence(Neo4jConsequence consequence) {
        this.consequence = consequence;
    }

    public Neo4jLeftHandSide getLeftHandSide() {
        return leftHandSide;
    }

    public void setLeftHandSide(Neo4jLeftHandSide leftHandSide) {
        this.leftHandSide = leftHandSide;
    }

    //    /**
//     * Get an Attribute HashMap with keys and values through a HashSet
//     * @return Map of String and String
//     */
//    public Map<String, String> getKeyValueAttributeHashMap(){
//
//        Map<String, String> attributeHashMap = new HashMap<>();
//        String [] keyValue;
//        for (Neo4jConsequence neo4jAttribute : this.consequenceSet){
//            keyValue = neo4jAttribute.getKeyValue();
//            attributeHashMap.put(keyValue[0], keyValue[1]);
//        }
//
//        return attributeHashMap;
//    }
//
//    /**
//     * Get a Metadata HashMap with keys and values through an HashSet
//     * @return Map of String and String
//     */
//    public Map<String, String> getKeyValueMetadataHashMap() {
//
//        Map<String, String> metadataHashMap = new HashMap<>();
//        String[] keyValue;
//        for (Neo4jMetadata neo4jMetadata : this.metadata) {
//            keyValue = neo4jMetadata.getKeyValue();
//            metadataHashMap.put(keyValue[0], keyValue[1]);
//        }
//
//        return metadataHashMap;
//    }

}

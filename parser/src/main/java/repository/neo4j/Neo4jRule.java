package repository.neo4j;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by alex on 16/7/18.
 */
@NodeEntity(label="Rule")
public class Neo4jRule {

    @Id
    private String name;
    private String salience;
    private String namespace;
    private String consequence;
    private String leftHandSide;

    @Relationship(type = "HAS_ATTRIBUTE", direction =  Relationship.INCOMING)
    private Set<Neo4jAttribute> attributeSet = new HashSet<>();


    @Relationship(type = "HAS_METADATA", direction =  Relationship.INCOMING)
    private Set<Neo4jMetadata> metadata = new HashSet<>();



    //private Set<Neo4jLeftHandSide> leftHandSide = new HashSet<>();


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

    public Set<Neo4jAttribute> getAttributeSet() {
        return attributeSet;
    }

    public void setAttributeSet(Set<Neo4jAttribute> attributeSet) {
        this.attributeSet = attributeSet;
    }

    public Set<Neo4jMetadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(Set<Neo4jMetadata> metadata) {
        this.metadata = metadata;
    }

    public String getLeftHandSide() {
        return leftHandSide;
    }

    public void setLeftHandSide(String leftHandSide) {
        this.leftHandSide = leftHandSide;
    }

    public String getConsequence() {
        return consequence;
    }

    public void setConsequence(String consequence) {
        this.consequence = consequence;
    }

    public void addNeo4jAttribute(Neo4jAttribute neo4jAttribute){
        this.attributeSet.add(neo4jAttribute);
    }

    public Map<String, String> getKeyValueAttributeHashMap(){

        Map<String, String> attributeHashMap = new HashMap<>();
        String [] keyValue;
        for (Neo4jAttribute neo4jAttribute : this.attributeSet){
            keyValue = neo4jAttribute.getKeyValue();
            attributeHashMap.put(keyValue[0], keyValue[1]);
        }

        return attributeHashMap;
    }

    public Map<String, String> getKeyValueMetadataHashMap() {

        Map<String, String> metadataHashMap = new HashMap<>();
        String[] keyValue;
        for (Neo4jMetadata neo4jMetadata : this.metadata) {
            keyValue = neo4jMetadata.getKeyValue();
            metadataHashMap.put(keyValue[0], keyValue[1]);
        }

        return metadataHashMap;
    }

}

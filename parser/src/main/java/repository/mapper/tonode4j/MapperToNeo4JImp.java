package repository.mapper.tonode4j;

import com.google.gson.Gson;
import drools.rule.Attribute;
import drools.rule.DroolsRule;
import drools.rule.Metadata;
import repository.neo4j.Neo4jAttribute;
import repository.neo4j.Neo4jMetadata;
import repository.neo4j.Neo4jRule;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by alex on 17/7/18.
 */
public class MapperToNeo4JImp implements MapperToNeo4j {

    private Gson gson;

    public MapperToNeo4JImp(){
        this.gson = new Gson();
    }



    @Override
    public Neo4jRule droolsRuleToNeojRule(DroolsRule rule) {

        Neo4jRule neo4jRule = new Neo4jRule();

        neo4jRule.setName(rule.getName());
        neo4jRule.setSalience(rule.getSalience());
        neo4jRule.setNamespace(rule.getNamespace());
        neo4jRule.setAttributeSet(attributeDroolsToAttributeNeo4j(rule.getAttribute()));
        neo4jRule.setMetadata(metadataDroolsToMetadataNeo4j(rule.getMetadata()));
        neo4jRule.setConsequence(rule.getConsequence().getConsequence());
        neo4jRule.setLeftHandSide(gson.toJson(rule.getLeftHandSide()));


        return neo4jRule;
    }



    @Override
    public List<Neo4jRule> droolsRuleListToNeo4jRuleList(List<DroolsRule> ruleList) {

        List<Neo4jRule> neo4jRuleList = new ArrayList<>();

        for (DroolsRule droolsRule : ruleList){
            neo4jRuleList.add(droolsRuleToNeojRule(droolsRule));
        }

        return neo4jRuleList;
    }



    private Set<Neo4jAttribute> attributeDroolsToAttributeNeo4j(Attribute attribute){

        List<String> attributeKeyValueList = attribute.getKeyValueList();
        Set<Neo4jAttribute> attributeSet = new HashSet<>();

        for (String keyValue : attributeKeyValueList) {
            attributeSet.add(new Neo4jAttribute(keyValue));
        }

        return attributeSet;
    }

    private Set<Neo4jMetadata> metadataDroolsToMetadataNeo4j(Metadata metadata){

        List<String> metadataKeyValueList= metadata.getKeyValueList();
        Set<Neo4jMetadata> metadataSet = new HashSet<>();

        for (String keyValue : metadataKeyValueList) {
            metadataSet.add(new Neo4jMetadata(keyValue));
        }

        return metadataSet;
    }
}

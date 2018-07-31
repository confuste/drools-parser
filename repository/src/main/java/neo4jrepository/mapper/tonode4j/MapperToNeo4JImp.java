package neo4jrepository.mapper.tonode4j;

import com.google.gson.Gson;
import drools.rule.Attribute;
import drools.rule.DroolsRule;
import drools.rule.Metadata;
import drools.rule.lhs.LeftHandSide;
import drools.rule.rhs.Consequence;
import neo4jrepository.neo4jmodel.*;


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
        neo4jRule.setAttribute(gson.toJson(rule.getAttribute()));
        neo4jRule.setMetadata(gson.toJson(rule.getMetadata()));

        neo4jRule.setLeftHandSide(this.lhsDroolsToLhsNeo4j(rule.getLeftHandSide()));
        neo4jRule.setConsequence(this.consequenceDroolsToConsequenceNeo4j(rule.getConsequence()));


        return neo4jRule;
    }



    @Override
    public List<Neo4jRule> droolsRuleListToNeo4jRuleList(List<DroolsRule> ruleList) {

        List<Neo4jRule> neo4jRuleList = new ArrayList<>();

        for (DroolsRule droolsRule : ruleList){
            neo4jRuleList.add(this.droolsRuleToNeojRule(droolsRule));
        }



        return neo4jRuleList;
    }


    private Neo4jLeftHandSide lhsDroolsToLhsNeo4j(LeftHandSide leftHandSide){

        Neo4jLeftHandSide neo4jLeftHandSide = new Neo4jLeftHandSide();
        neo4jLeftHandSide.setIdUnique(leftHandSide.getIdUnique());
        neo4jLeftHandSide.setLhsCondition(gson.toJson(leftHandSide.getLhsConditionList()));

        return neo4jLeftHandSide;
    }


    private Neo4jConsequence consequenceDroolsToConsequenceNeo4j(Consequence consequence){

        Neo4jConsequence neo4jConsequence = new Neo4jConsequence();
        neo4jConsequence.setIdUnique(consequence.getIdUnique());

        List<String> consequenceList = consequence.getKeyValueList();
        String [] consequenceArray = consequenceList.toArray(new String[consequenceList.size()]);

        neo4jConsequence.setConsequence(consequenceArray);

        return neo4jConsequence;
    }


//    private Set<Neo4jMetadata> metadataDroolsToMetadataNeo4j(Metadata metadata){
//
//        List<String> metadataKeyValueList= metadata.getKeyValueList();
//        Set<Neo4jMetadata> metadataSet = new HashSet<>();
//
//        for (String keyValue : metadataKeyValueList) {
//            metadataSet.add(new Neo4jMetadata(keyValue));
//        }
//
//        return metadataSet;
//    }

}

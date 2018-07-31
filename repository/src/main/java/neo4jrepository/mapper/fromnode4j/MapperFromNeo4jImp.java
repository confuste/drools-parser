package neo4jrepository.mapper.fromnode4j;

import com.google.gson.Gson;
import drools.rule.*;
import drools.rule.lhs.LeftHandSide;
import drools.rule.rhs.Consequence;
import neo4jrepository.neo4jmodel.Neo4jRule;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 17/7/18.
 */
public class MapperFromNeo4jImp implements MapperFromNeo4j{

    private Gson gson;

    public MapperFromNeo4jImp(){
        gson = new Gson();
    }

    @Override
    public DroolsRule neo4jRuleToDroolsRule(Neo4jRule neo4jRule) {

        DroolsRule droolsRule = new DroolsRule();

        droolsRule.setName(neo4jRule.getName());
        droolsRule.setNamespace(neo4jRule.getNamespace());
        droolsRule.setSalience(neo4jRule.getSalience());

        Attribute attribute = new Attribute();
//        attribute.setAttributeMap(neo4jRule.getKeyValueAttributeHashMap());
        droolsRule.setAttribute(attribute);

        Metadata metadata = new Metadata();
//        metadata.setMetadataMap(neo4jRule.getKeyValueMetadataHashMap());
        droolsRule.setMetadata(metadata);

//        LeftHandSide lhs = gson.fromJson(neo4jRule.getLeftHandSide(), LeftHandSide.class);
//        droolsRule.setLeftHandSide(lhs);
//
//        droolsRule.setConsequence(new Consequence(neo4jRule.getConsequence()));

        return droolsRule;
    }

    @Override
    public List<DroolsRule> neo4jRuleListToDroolsRuleList(List<Neo4jRule> neo4jRuleList) {

        List<DroolsRule> droolsRuleList = new ArrayList<>();

        for(Neo4jRule neo4jRule : neo4jRuleList){
            droolsRuleList.add(neo4jRuleToDroolsRule(neo4jRule));
        }

        return droolsRuleList;
    }
}

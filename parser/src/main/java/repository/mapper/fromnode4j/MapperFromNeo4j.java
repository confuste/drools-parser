package repository.mapper.fromnode4j;

import drools.rule.DroolsRule;
import repository.neo4j.Neo4jRule;

import java.util.List;

/**
 * Created by alex on 17/7/18.
 */
public interface MapperFromNeo4j {

    DroolsRule neo4jRuleToDroolsRule(Neo4jRule rule);

    List<DroolsRule> neo4jRuleListToDroolsRuleList(List<Neo4jRule> neo4jRuleList);
}

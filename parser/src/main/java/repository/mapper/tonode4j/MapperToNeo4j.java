package repository.mapper.tonode4j;

import drools.rule.DroolsRule;
import repository.neo4j.Neo4jRule;

import java.util.List;

/**
 * Created by alex on 17/7/18.
 */
public interface MapperToNeo4j {

    Neo4jRule droolsRuleToNeojRule(DroolsRule rule);

    List<Neo4jRule> droolsRuleListToNeo4jRuleList(List<DroolsRule> ruleList);
}

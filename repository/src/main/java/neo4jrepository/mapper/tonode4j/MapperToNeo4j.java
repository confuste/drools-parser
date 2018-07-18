package neo4jrepository.mapper.tonode4j;

import drools.rule.DroolsRule;
import neo4jrepository.neo4jmodel.Neo4jRule;

import java.util.List;

/**
 * Mapper to Neo4j Model
 */
public interface MapperToNeo4j {

    /**
     * Convert a Drools Rule to a Neo4j Rule
     * @param rule DroolsRule
     * @return Neo4jRule
     */
    Neo4jRule droolsRuleToNeojRule(DroolsRule rule);

    /**
     * Convert a Drools Rule List to a Neo4j Rule List
     * @param ruleList DroolsRule List
     * @return Neo4jRule List
     */
    List<Neo4jRule> droolsRuleListToNeo4jRuleList(List<DroolsRule> ruleList);
}

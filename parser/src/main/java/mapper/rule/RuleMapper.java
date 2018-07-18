package mapper.rule;

import drools.rule.DroolsRule;
import org.drools.compiler.lang.descr.RuleDescr;

import java.util.List;

/**
 * Map a rule to our own DroolsRule Model
 */
public interface RuleMapper {

    /**
     * Map a Rule
     * @param ruleDescr The original Rule model
     * @return DroolsRule with the Mapped Rule
     */
    DroolsRule ruleDescrToRuleDrools(RuleDescr ruleDescr);

    /**
     * Map a list of  rules
     * @param ruleDescrList The original Rule model list
     * @return A DroolRule List with the mapped rules
     */
    List<DroolsRule> ruleDescrListToRuleDroolsList(List<RuleDescr> ruleDescrList);
}

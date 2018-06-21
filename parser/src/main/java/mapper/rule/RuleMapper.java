package mapper.rule;

import drools.rule.DroolsRule;
import org.drools.compiler.lang.descr.RuleDescr;

/**
 * Created by alex on 21/6/18.
 */
public interface RuleMapper {

    DroolsRule ruleDescrToRuleDrools(RuleDescr ruleDescr);
}

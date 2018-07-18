package drools;

import drools.rule.DroolsRule;
import mapper.rule.RuleMapper;
import mapper.rule.RuleMapperImp;
import org.drools.compiler.lang.descr.ImportDescr;
import org.drools.compiler.lang.descr.PackageDescr;
import org.drools.compiler.lang.descr.RuleDescr;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that receive a DroolsParser and
 * get the rules through PackageDescr Drools class
 */

public class DroolsDescription {

    private PackageDescr packageDescr;
    private RuleMapper ruleMapper;

    public DroolsDescription(DroolsParser droolsParser){
        this.packageDescr = droolsParser.getPackageDescr();
        this.ruleMapper = new RuleMapperImp();
    }


    /**
     * Get a String List of the imports
     * @return List of  String with the imports
     */
    public List<String> getImports(){
        List<ImportDescr> importDescrsList = packageDescr.getImports();
        List<String> importList = new ArrayList<>();

        for(ImportDescr concreteImport : importDescrsList){
            importList.add(concreteImport.toString());
        }

        return importList;
    }

    /**
     * Get a List of DroolsRule.
     * The rules from the parser are converted to the specific DroolsRule model.
     * @return List of DroolsRule
     */
    public List<DroolsRule> getRules(){
        List<RuleDescr> ruleDescrList = this.packageDescr.getRules();
        return this.ruleMapper.ruleDescrListToRuleDroolsList(ruleDescrList);
    }

}

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
 * Created by alex on 21/6/18.
 */
public class DroolsDescription {

    private PackageDescr packageDescr;
    private RuleMapper ruleMapper;

    public DroolsDescription(DroolsParser droolsParser){
        this.packageDescr = droolsParser.getPackageDescr();
        this.ruleMapper = new RuleMapperImp();
    }


    public List<String> getImports(){
        List<ImportDescr> importDescrsList = packageDescr.getImports();
        List<String> importList = new ArrayList<>();

        for(ImportDescr concreteImport : importDescrsList){
            importList.add(concreteImport.toString());
        }

        return importList;
    }

    public List<DroolsRule> getRules(){

        List<DroolsRule>  droolsRulesList = new ArrayList<>();


        List<RuleDescr> ruleDescrList = this.packageDescr.getRules();

        for (RuleDescr ruleDescr : ruleDescrList){
            droolsRulesList.add(this.ruleMapper.ruleDescrToRuleDrools(ruleDescr));
        }

        return droolsRulesList;
    }

}

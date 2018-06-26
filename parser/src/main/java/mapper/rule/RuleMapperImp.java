package mapper.rule;

import drools.rule.*;
import org.drools.compiler.lang.descr.*;

import java.util.*;

/**
 * Created by alex on 21/6/18.
 */
public class RuleMapperImp implements RuleMapper {


    @Override
    public DroolsRule ruleDescrToRuleDrools(RuleDescr ruleDescr) {

        DroolsRule droolsRule = new DroolsRule();
        droolsRule.setName(ruleDescr.getName());
        droolsRule.setSalience(ruleDescr.getSalience());
        droolsRule.setNamespace(ruleDescr.getNamespace());
        droolsRule.setAttribute(this.mapAttribute(ruleDescr));
        droolsRule.setMetadata(this.mapMetadata(ruleDescr));
        droolsRule.setLeftHandSide(this.mapLeftHandSide(ruleDescr.getLhs()));
        droolsRule.setConsequence(new Consequence(ruleDescr.getConsequence().toString()));

        return droolsRule;
    }

    private Attribute mapAttribute(RuleDescr ruleDescr){
        Attribute attribute = new Attribute();

        for (Map.Entry<String, AttributeDescr> entry : ruleDescr.getAttributes().entrySet()) {
            attribute.addAttribute(entry.getKey(), entry.getValue().getValueString());
        }
        return attribute;
    }

    private Metadata mapMetadata(RuleDescr ruleDescr){

        Metadata metadata = new Metadata();

        for(String key : ruleDescr.getAnnotationNames()){
            metadata.addMetadata(key, ruleDescr.getAnnotation(key).getSingleValueAsString());
        }

        return metadata;
    }

    private LeftHandSide mapLeftHandSide(AndDescr andDescr){
        List<BaseDescr> descrList = andDescr.getDescrs();

        LeftHandSide leftHandSide = new LeftHandSide();
        LhsCondition lhsCondition;
        PatternDescr patternDescr;

        List<BaseDescr> exprConstraintDescrList;

        for(BaseDescr baseDescr : descrList){
            patternDescr = (PatternDescr) baseDescr;
            lhsCondition = new LhsCondition();
            lhsCondition.setId(patternDescr.getIdentifier());
            lhsCondition.setObjectType(patternDescr.getObjectType());


            exprConstraintDescrList = Collections.unmodifiableList(patternDescr.getSlottedConstraints());
            for(BaseDescr exprConstraint : exprConstraintDescrList){
                lhsCondition.addConstraint(((ExprConstraintDescr)exprConstraint).getExpression());
            }

            leftHandSide.addLhsCondition(lhsCondition);
        }

        return leftHandSide;
    }

}

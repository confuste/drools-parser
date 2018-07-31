package mapper.rule;

import antlr4.RHSGrammarLexer;
import antlr4.RHSGrammarParser;
import drools.rule.*;
import drools.rule.lhs.LeftHandSide;
import drools.rule.lhs.LhsCondition;
import drools.rule.rhs.Consequence;
import org.drools.compiler.lang.descr.*;
import java.util.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

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
        droolsRule.setConsequence(this.mapConsequence(ruleDescr.getConsequence().toString()));

        return droolsRule;
    }

    @Override
    public List<DroolsRule> ruleDescrListToRuleDroolsList(List<RuleDescr> ruleDescrList) {

        List<DroolsRule> droolsRuleList = new ArrayList<>();
        for(RuleDescr ruleDescr : ruleDescrList){
            droolsRuleList.add(this.ruleDescrToRuleDrools(ruleDescr));
        }

        this.setLhsAndRhsId(droolsRuleList);

        return droolsRuleList;
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

    private Consequence mapConsequence(String consequence){
        RHSGrammarLexer lexer = new RHSGrammarLexer(CharStreams.fromString(consequence));
        CommonTokenStream token = new CommonTokenStream(lexer);
        RHSGrammarParser parser = new RHSGrammarParser(token);
        parser.init().getText();

        Consequence  consequenceObject = new Consequence();

        List<String> variableList = parser.getAllVariables();
        String [] variableArray;

        for(String variable : variableList){
            variableArray = variable.split("=");
            if(variableArray.length == 2){
                consequenceObject.addConsequence(variableArray[0], variableArray[1]);
            }
        }

        return consequenceObject;
    }


    private void setLhsAndRhsId(List<DroolsRule> droolsRuleList){

        LeftHandSide leftHandSide_i;
        Consequence consequence_i;

        LeftHandSide leftHandSide_j;
        Consequence consequence_j;


        int lastIdLhs = 0;
        int lastIdConsequence = 0;


        for (int i = 0; i < droolsRuleList.size(); i++) {

            leftHandSide_i = droolsRuleList.get(i).getLeftHandSide();
            consequence_i = droolsRuleList.get(i).getConsequence();

            if(leftHandSide_i.getIdUnique() == 0){
                leftHandSide_i.setIdUnique(++lastIdLhs);
            }

            if(consequence_i.getIdUnique() == 0 && !consequence_i.getConsequenceMap().isEmpty()){
                consequence_i.setIdUnique(++lastIdConsequence);
            }

            for(int j = i+1; j < droolsRuleList.size(); j++) {

                //System.out.println("["+i+", " +j+"] @ ");

                leftHandSide_j = droolsRuleList.get(j).getLeftHandSide();
                consequence_j = droolsRuleList.get(j).getConsequence();

                //System.out.println("isEqual LHS? " + leftHandSide_i.equals(leftHandSide_j));
                if(leftHandSide_j.getIdUnique() == 0 && leftHandSide_i.equals(leftHandSide_j)){
                    leftHandSide_j.setIdUnique(leftHandSide_i.getIdUnique());
                }

                //System.out.println("isEqual ? " + leftHandSide_i.equals(leftHandSide_j));
                if(consequence_j.getIdUnique() == 0 && consequence_i.equals(consequence_j)){
                    consequence_j.setIdUnique(consequence_i.getIdUnique());
                }
            }
        }
    }

}

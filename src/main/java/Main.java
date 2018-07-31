import drools.DroolsDescription;
import drools.DroolsParser;
import drools.LanguageLevel;
import drools.rule.*;
import drools.rule.lhs.LeftHandSide;
import drools.rule.lhs.LhsCondition;
import drools.rule.rhs.Consequence;
import neo4jrepository.mapper.tonode4j.MapperToNeo4JImp;
import neo4jrepository.neo4jmodel.Neo4jRule;
import org.drools.compiler.compiler.DroolsParserException;
import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import utils.FileUtils;

import java.io.IOException;
import java.util.List;

/**
 * Created by alex on 26/6/18.
 */
public class Main {

    public static void main(String[] args) {

        String rulesTxt = "";
        try {
            rulesTxt = FileUtils.readFile("the_drl_files/VAP.drl");
            //System.out.println(rulesTxt);
        } catch (IOException e) {
            e.printStackTrace();
        }



        try {
            DroolsParser droolsParser = new DroolsParser.Builder(rulesTxt)
                    .languageLevel(LanguageLevel.DRL6)
                    .build();


            DroolsDescription droolsDescription = new DroolsDescription(droolsParser);

            List<DroolsRule> ruleList = droolsDescription.getRules();

            printRules(ruleList);

            /*
            System.out.println("JSON serialized and deserialized test");
            String json = new Gson().toJson(ruleList.get(0).getLeftHandSide());
            System.out.println(json);
            LeftHandSide lhs = new Gson().fromJson(json, LeftHandSide.class);
            LhsCondition lhsCondition = lhs.getLhsConditionList().get(0);
            System.out.println("id: " + lhsCondition.getId() + ", objectType: " + lhsCondition.getObjectType()  + ", ConstraintList:" + lhsCondition.getConstraintList());
            */

//            List<Neo4jRule> neo4jRuleList = convertModelToNeo4jModel(ruleList);
//            initOGMneo4j(neo4jRuleList);

            System.out.println("----------------");



        } catch (DroolsParserException e) {
            e.printStackTrace();
        }



    }

    private static void printRules(List<DroolsRule> ruleList){
        System.out.println("ruleList size: " + ruleList.size());
        for(DroolsRule rule : ruleList){
            System.out.println("Rule name: " + rule.getName());
            System.out.println(rule.getNamespace());
            printAttributes(rule.getAttribute());
            printMetadata(rule.getMetadata());
            printLeftHandSide(rule.getLeftHandSide());
            printConsequence(rule.getConsequence());
            System.out.println();
        }

    }

    private static void printAttributes(Attribute attribute){
        System.out.println("- Atributos: " + attribute.getKeyValueList());
    }

    private static void printMetadata(Metadata metadata){
        System.out.println("- Metadatos: " + metadata.getKeyValueList());
    }

    private static void printLeftHandSide(LeftHandSide leftHandSide){
        List<LhsCondition> lhsConditionList = leftHandSide.getLhsConditionList();
        System.out.println("-- LHS idUnique: " + leftHandSide.getIdUnique());
        for(LhsCondition lhscond : lhsConditionList){
            System.out.println("-- LHS id: " + lhscond.getId() + ", ojbectType: " + lhscond.getObjectType() + ", Constraints:" + lhscond.getConstraintList());
        }
    }

    private static void printConsequence(Consequence consequence){
        System.out.println("-- Consequence idUnique: " + consequence.getIdUnique());
        System.out.println("-- Consequence: " + consequence.getKeyValueList());
    }




    private static List<Neo4jRule> convertModelToNeo4jModel(List<DroolsRule> droolsRuleList){
        MapperToNeo4JImp modelToNeo4JImp = new MapperToNeo4JImp();
        return modelToNeo4JImp.droolsRuleListToNeo4jRuleList(droolsRuleList);
    }

    private static void initOGMneo4j(List<Neo4jRule> neo4jRuleList){


        Configuration configuration = new Configuration.Builder()
                .uri(neo4jrepository.Configuration.NEO4J_URI)
                .build();

        SessionFactory sessionFactory = new SessionFactory(configuration, neo4jrepository.Configuration.NEO4J_MODEL_PACKAGE);
        Session session = sessionFactory.openSession();

        /*
        for(Neo4jRule neo4jRule : neo4jRuleList){
            session.save(neo4jRule);
        }
        */



        for (int i = 0; i < 3; i++) {
            session.beginTransaction();
            session.save(neo4jRuleList.get(i));
            session.getTransaction().commit();
        }




        /*
        session.beginTransaction();

        Collection<Neo4jRule> neo4jRuleRetrieveList = session.loadAll(Neo4jRule.class, 100); //Note -1 for deeply search

        for (Neo4jRule neo4jRule : neo4jRuleRetrieveList) {
            System.out.println(neo4jRule.getName());
        }

        session.getTransaction().commit();
*/


        sessionFactory.close();
    }



}

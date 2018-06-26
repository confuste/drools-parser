import drools.DroolsDescription;
import drools.DroolsParser;
import drools.LanguageLevel;
import drools.rule.DroolsRule;
import org.drools.compiler.compiler.DroolsParserException;

import java.util.List;

/**
 * Created by alex on 26/6/18.
 */
public class Main {

    public static void main(String[] args) {

        String drlVAP = "rule \"IsInvalidSputumCulture\"\n"
                + "@sourceDocument(John Hopkins Clinical Guidelines Infections)\n"
                + "@pageNumber(80)\n  @lineRange(1-3)\n" +
                "@ruleDate(2014-06-11)\n " +
                "@ruleDescription(\"Analyzes if sputum culture of patient is valid by checking if patient has been on atibiotics recently or failing therapy with et Suction\")\n" +
                "@ruleAuthor(Natalia Iglesias)\n  " +
                "@ruleVersion(1.0.0)" +
                "@clinicalAction(GenericAlert)\n  " +
                "@infectionType(VAP)\n  " +
                "@infectionAgent()\n  " +
                "@infectionAntibiotic()\n  " +
                "no-loop\n  " +
                "salience -100 \n  " +
                "agenda-group \"generic\"\n    " +
                "when\n        " +
                "$patient : Patient (onAntibiotics == true || etSuction == false )\n   " +
                "then\n       " +
                "System.out.println( \"Generic Alert: Sputum culture of patient \" + $patient.name +  \" possibly not valid\" );\n   " +
                "System.out.println( \"Audit Information: \"  + \" @clinicalAction \"+drools.getRule().getMetaData().get(\"clinicalAction\") );\n" +
                "end";

        try {
            DroolsParser droolsParser = new DroolsParser.Builder(drlVAP).languageLevel(LanguageLevel.DRL6).build();

            DroolsDescription droolsDescription = new DroolsDescription(droolsParser);

            List<DroolsRule> ruleList = droolsDescription.getRules();

            System.out.println("ruleList size: " + ruleList.size());

            for(DroolsRule rule : ruleList){
                
                System.out.println("Rule name: " + rule.getName());
            }

        } catch (DroolsParserException e) {
            e.printStackTrace();
        }
    }
}

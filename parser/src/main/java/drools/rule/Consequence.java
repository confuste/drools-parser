package drools.rule;


/**
 * Represents the consequence of a rule
 */
public class Consequence {

    private String consequence;

    public Consequence(String consequence) {
        this.consequence = consequence;
    }

    public String getConsequence() {
        return consequence;
    }

    public void setConsequence(String consequence) {
        this.consequence = consequence;
    }
}

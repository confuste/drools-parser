package drools.rule;

import drools.rule.lhs.LeftHandSide;
import drools.rule.rhs.Consequence;

/**
 * Represents a rule and its properties
 */
public class DroolsRule {


    private String name;
    private String salience;
    private String namespace;
    private Attribute attribute;
    private Metadata metadata;
    private LeftHandSide leftHandSide;
    private Consequence consequence;

    public DroolsRule(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public LeftHandSide getLeftHandSide() {
        return leftHandSide;
    }

    public void setLeftHandSide(LeftHandSide leftHandSide) {
        this.leftHandSide = leftHandSide;
    }

    public String getSalience() {
        return salience;
    }

    public void setSalience(String salience) {
        this.salience = salience;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Consequence getConsequence() {
        return consequence;
    }

    public void setConsequence(Consequence consequence) {
        this.consequence = consequence;
    }
}

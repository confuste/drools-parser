package drools.rule.rhs;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents the consequence of a rule
 */
public class Consequence {

    private int idUnique;

    private Map<String, String> consequenceMap;
//    private String consequence;

    public Consequence() {
        this.idUnique = 0;
        this.consequenceMap = new HashMap<>();
//        this.consequence = consequence;
    }

//    public String getConsequence() {
//        return consequence;
//    }
//
//    public void setConsequence(String consequence) {
//        this.consequence = consequence;
//    }


    public int getIdUnique() {
        return idUnique;
    }

    public void setIdUnique(int idUnique) {
        this.idUnique = idUnique;
    }

    public void addConsequence(String key, String value){
        this.consequenceMap.put(key, value);
    }

    public Map<String, String> getConsequenceMap() {
        return consequenceMap;
    }

    public void setConsequenceMap(Map<String, String> consequenceMap) {
        this.consequenceMap = consequenceMap;
    }

    public String getValue(String key){
        return this.consequenceMap.get(key);
    }

    public List<String> getKeyValueList(){

        List<String> consequenceArray = new ArrayList<>();

        for (Map.Entry<String, String> entry : this.consequenceMap.entrySet()) {
            consequenceArray.add(entry.getKey()+"="+entry.getValue());
        }

        return consequenceArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Consequence that = (Consequence) o;

        return consequenceMap != null ? consequenceMap.equals(that.consequenceMap) : that.consequenceMap == null;
    }

}

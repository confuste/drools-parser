package drools.rule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alex on 26/6/18.
 */

/**
 * Contains a List of attributes with the key and value of them
 */
public class Attribute {

    private Map<String, String> attributeMap;

    public Attribute(){
        this.attributeMap = new HashMap<>();
    }


    public void addAttribute(String key, String value){
        this.attributeMap.put(key, value);
    }


    public Map<String, String> getAttributeMap() {
        return attributeMap;
    }

    public void setAttributeMap(Map<String, String> attributeMap) {
        this.attributeMap = attributeMap;
    }


    /**
     * Get a value through a key
     * @param key String with the key
     * @return String with the value
     */
    public String getValue(String key){
        return this.attributeMap.get(key);
    }


    /**
     * Convert the Map with the key and value to an List where key and value are joined with an "=" symbol.
     * @return The List of String
     */
    public List<String> getKeyValueList(){

        List<String> attributeArray = new ArrayList<>();

        for (Map.Entry<String, String> entry : this.attributeMap.entrySet()) {
            attributeArray.add(entry.getKey()+"="+entry.getValue());
        }

        return attributeArray;
    }
}

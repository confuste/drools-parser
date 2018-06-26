package drools.rule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alex on 26/6/18.
 */
public class Attribute {

    Map<String, String> attributeMap;

    public Attribute(){
        this.attributeMap = new HashMap<>();
    }

    public void addAttribute(String key, String value){
        this.attributeMap.put(key, value);
    }

    public String getValue(String key){
        return this.attributeMap.get(key);
    }

    public List<String> getKeyValueList(){

        List<String> attributeArray = new ArrayList<>();

        for (Map.Entry<String, String> entry : this.attributeMap.entrySet()) {
            attributeArray.add(entry.getKey()+"="+entry.getValue());
        }

        return attributeArray;
    }
}

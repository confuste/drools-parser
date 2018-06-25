package drools.rule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alex on 25/6/18.
 */
public class Metadata {

    Map<String, String> metadataMap;

    public Metadata(){
        this.metadataMap = new HashMap<>();
    }

    public void addMetadata(String key, String value){
        this.metadataMap.put(key, value);
    }

    public String getValue(String key){
        return this.metadataMap.get(key);
    }

    public List<String> getKeyValueList(){

        List<String> metadataArray = new ArrayList<>();

        for (Map.Entry<String, String> entry : this.metadataMap.entrySet()) {
            metadataArray.add(entry.getKey()+"="+entry.getValue());
        }

        return metadataArray;
    }
}

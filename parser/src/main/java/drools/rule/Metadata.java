package drools.rule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents the rule Metadata.
 */
public class Metadata {

    private Map<String, String> metadataMap;

    public Metadata(){
        this.metadataMap = new HashMap<>();
    }

    public void addMetadata(String key, String value){
        this.metadataMap.put(key, value);
    }

    public Map<String, String> getMetadataMap() {
        return metadataMap;
    }

    public void setMetadataMap(Map<String, String> metadataMap) {
        this.metadataMap = metadataMap;
    }


    /**
     * Get a value through a key
     * @param key String with the key
     * @return String with the value
     */
    public String getValue(String key){
        return this.metadataMap.get(key);
    }


    /**
     * Convert the Map with the key and value to an List where key and value are joined with an "=" symbol.
     * @return The List of String
     */
    public List<String> getKeyValueList(){

        List<String> metadataArray = new ArrayList<>();

        for (Map.Entry<String, String> entry : this.metadataMap.entrySet()) {
            metadataArray.add(entry.getKey()+"="+entry.getValue());
        }

        return metadataArray;
    }


}

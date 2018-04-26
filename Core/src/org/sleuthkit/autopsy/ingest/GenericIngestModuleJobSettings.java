/*
 * Autopsy Forensic Browser
 *
 * Copyright 2014-2018 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.ingest;
import java.util.HashMap;
import java.util.Map;


/**
 * Generic Ingest Job settings class  
 */
public class GenericIngestModuleJobSettings implements IngestModuleIngestJobSettings {
    private static final long serialVersionUID = 1L;
    
    @Override
    public long getVersionNumber(){
        return serialVersionUID;
    }
    
    private final Map<String, String> settings;
    
    public GenericIngestModuleJobSettings(){
        this.settings = new HashMap<>();
        
    }
    
    /**
     * Return the string value for passed key parameter from the settings HashMap
     * When the key does not exist null will be returned.
     * @param key The key for setting to be fetched
     * @return The value for the key passed as parameter
     */
    public String getSettings(String key){
        return settings.get(key);
    }
    
    /**
     * Adds the passed key value pair to the settings HashMap
     * @param key The key to be added to the settings
     * @param value The value to be added for the key
     */
    public void setSettings(String key ,String value){
        settings.put(key, value);
    }
    
    /**
     * removes the passed key parameter from the settings HashMap
     * @param key The key to be removed from settings
     */
    public void removeSettings(String key){
        settings.remove(key);
    }
    
}

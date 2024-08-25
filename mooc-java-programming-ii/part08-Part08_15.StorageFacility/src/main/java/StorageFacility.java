
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class StorageFacility {
    HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }
        
    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents (String storageUnit){
        return storage.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        storage.get(storageUnit).remove(item);
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> result = new ArrayList<>();
        
        for (String unit : storage.keySet()){
            if(storage.get(unit).size()>0){
                result.add(unit);
            }
        }
        return result;
    }
    
}

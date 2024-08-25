
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
public class VehicleRegistry {
    private HashMap registry = new HashMap<LicensePlate, String>();

    public VehicleRegistry() {
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(licensePlate.getLiNumber().isBlank()){
            registry.put(licensePlate, owner);
            return true;
        }
        return false;        
    }
    
    public String get(LicensePlate licensePlate){
        if (registry.get(licensePlate)!=null){
            return registry.get(licensePlate).toString();
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(!registry.containsKey(licensePlate)){
            return false;
        }
        
        registry.remove(licensePlate);
        return true;
    }
    
}

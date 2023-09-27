/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Jayesh Chindarkar
 */
public class VitalSignsHistory {
    
    ArrayList<VitalSigns> history= null;
    
    public VitalSignsHistory(){
    
        this.history = new ArrayList<VitalSigns>();
        
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns addNewVitals(){
    
        VitalSigns vitalSigns = new VitalSigns();
        history.add(vitalSigns);
        return vitalSigns;
    }
    
    public void deleteVitals(VitalSigns vs){    
        history.remove(vs);
    }
}

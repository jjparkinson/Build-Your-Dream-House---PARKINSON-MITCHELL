/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.edu.cit260.buildYourDreamHouse.control;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Renee
 */
public class Appraiser implements Serializable {

    //class instance variables
    private String interiorInspection;
    private String exteriorInspection;
    private String overallImprovement;

    public Appraiser() {
    }
    
    public String getInteriorInspection() {
        return interiorInspection;
    }

    public void setInteriorInspection(String interiorInspection) {
        this.interiorInspection = interiorInspection;
    }

    public String getExteriorInspection() {
        return exteriorInspection;
    }

    public void setExteriorInspection(String exteriorInspection) {
        this.exteriorInspection = exteriorInspection;
    }

    public String getOverallImprovement() {
        return overallImprovement;
    }

    public void setOverallImprovement(String overallImprovement) {
        this.overallImprovement = overallImprovement;
    }

    @Override
    public String toString() {
        return "Appraiser{" + "interiorInspection=" + interiorInspection + ", exteriorInspection=" + exteriorInspection + ", overallImprovement=" + overallImprovement + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.interiorInspection);
        hash = 67 * hash + Objects.hashCode(this.exteriorInspection);
        hash = 67 * hash + Objects.hashCode(this.overallImprovement);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Appraiser other = (Appraiser) obj;
        if (!Objects.equals(this.interiorInspection, other.interiorInspection)) {
            return false;
        }
        if (!Objects.equals(this.exteriorInspection, other.exteriorInspection)) {
            return false;
        }
        return Objects.equals(this.overallImprovement, other.overallImprovement);
    }
    
    

}

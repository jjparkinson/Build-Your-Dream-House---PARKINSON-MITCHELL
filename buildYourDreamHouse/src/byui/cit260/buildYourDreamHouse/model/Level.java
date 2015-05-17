/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamHouse.model;

import java.io.Serializable;



/**
 *
 * @author Renee
 */
public class Level implements Serializable {

    //class instance variables
    private double addroom;
    private double level;

    public double getaddRoom() {
        return addroom;
    }

    public void setaddRoom(double addroom) {
        this.addroom = addroom;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public Level() {
    }

    @Override
    public String toString() {
        return "Levels{" + "addroom=" + addroom + ", level=" + level + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.addroom) ^ (Double.doubleToLongBits(this.addroom) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.level) ^ (Double.doubleToLongBits(this.level) >>> 32));
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
        final Level other = (Level) obj;
        if (Double.doubleToLongBits(this.addroom) != Double.doubleToLongBits(other.addroom)) {
            return false;
        }
        return Double.doubleToLongBits(this.level) == Double.doubleToLongBits(other.level);
    }    

    public void setAddRoom(String kitchen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

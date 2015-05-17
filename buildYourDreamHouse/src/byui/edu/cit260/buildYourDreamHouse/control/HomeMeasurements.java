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
public class HomeMeasurements implements Serializable {

    //class instance variables
    private String description;
    private double width;
    private double length;
    private double height;
    private double sqFtOfRoom;
    private double maxCapacity;

    public HomeMeasurements() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSqFtOfRoom() {
        return sqFtOfRoom;
    }

    public void setSqFtOfRoom(double sqFtOfRoom) {
        this.sqFtOfRoom = sqFtOfRoom;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "HomeMeasurements{" + "description=" + description + ", width=" + width + ", length=" + length + ", height=" + height + ", sqFtOfRoom=" + sqFtOfRoom + ", maxCapacity=" + maxCapacity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.length) ^ (Double.doubleToLongBits(this.length) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.sqFtOfRoom) ^ (Double.doubleToLongBits(this.sqFtOfRoom) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.maxCapacity) ^ (Double.doubleToLongBits(this.maxCapacity) >>> 32));
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
        final HomeMeasurements other = (HomeMeasurements) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(this.length) != Double.doubleToLongBits(other.length)) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sqFtOfRoom) != Double.doubleToLongBits(other.sqFtOfRoom)) {
            return false;
        }
        return Double.doubleToLongBits(this.maxCapacity) == Double.doubleToLongBits(other.maxCapacity);
    }

    public void setSqFtOfRoom(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

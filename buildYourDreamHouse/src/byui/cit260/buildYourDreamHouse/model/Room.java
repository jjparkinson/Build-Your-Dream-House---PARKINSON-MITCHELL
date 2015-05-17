/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamHouse.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Renee
 */
public class Room implements Serializable {
    private static Object roomOne;

    //classes instance variables
    private String name;
    private double design;
    private double furniture;
    private double window;
    private double door;
    private double floor;
    private double wall;
    private double size;

    public Room() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDesign() {
        return design;
    }

    public void setDesign(double design) {
        this.design = design;
    }

    public double getFurniture() {
        return furniture;
    }

    public void setFurniture(double furniture) {
        this.furniture = furniture;
    }

    public double getWindow() {
        return window;
    }

    public void setWindow(double window) {
        this.window = window;
    }

    public double getDoor() {
        return door;
    }

    public void setDoor(double door) {
        this.door = door;
    }

    public double getFloor() {
        return floor;
    }

    public void setFloors(double floor) {
        this.floor = floor;
    }

    public double getWall() {
        return wall;
    }

    public void setWall(double wall) {
        this.wall = wall;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "room{" + "name=" + name + ", design=" + design + ", furniture=" + furniture + ", window=" + window + ", door=" + door + ", floor=" + floor + ", wall=" + wall + ", size=" + size + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.design) ^ (Double.doubleToLongBits(this.design) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.furniture) ^ (Double.doubleToLongBits(this.furniture) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.window) ^ (Double.doubleToLongBits(this.window) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.door) ^ (Double.doubleToLongBits(this.door) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.floor) ^ (Double.doubleToLongBits(this.floor) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.wall) ^ (Double.doubleToLongBits(this.wall) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.size) ^ (Double.doubleToLongBits(this.size) >>> 32));
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
        final Room other = (Room) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.design) != Double.doubleToLongBits(other.design)) {
            return false;
        }
        if (Double.doubleToLongBits(this.furniture) != Double.doubleToLongBits(other.furniture)) {
            return false;
        }
        if (Double.doubleToLongBits(this.window) != Double.doubleToLongBits(other.window)) {
            return false;
        }
        if (Double.doubleToLongBits(this.door) != Double.doubleToLongBits(other.door)) {
            return false;
        }
        if (Double.doubleToLongBits(this.floor) != Double.doubleToLongBits(other.floor)) {
            return false;
        }
        if (Double.doubleToLongBits(other.wall) != Double.doubleToLongBits(this.wall)) {
            return false;
        }
        return Double.doubleToLongBits(this.size) == Double.doubleToLongBits(other.size);
    }

    public void setFloor(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Double toDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                      
}

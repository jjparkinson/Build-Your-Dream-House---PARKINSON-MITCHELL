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
public class Home implements Serializable {
    
    //class instance variables
    private String name;
    private double location;
    private double size;
    private double room;
    private double level;
    private double furniture;
    private double layout;

    public Home() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLocation() {
        return location;
    }

    public void setLocation(double location) {
        this.location = location;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getRooms() {
        return room;
    }

    public void setRooms(double rooms) {
        this.room = rooms;
    }

    public double getLevels() {
        return level;
    }

    public void setLevels(double levels) {
        this.level = levels;
    }

    public double getFurniture() {
        return furniture;
    }

    public void setFurniture(double furniture) {
        this.furniture = furniture;
    }

    public double getLayout() {
        return layout;
    }

    public void setLayout(double layout) {
        this.layout = layout;
    }

    @Override
    public String toString() {
        String levels;
        return "Home{" + "name=" + name + ", location=" + location + ", size=" + size + ", room=" + room + ", level=" + level + ", furniture=" + furniture + ", layout=" + layout + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.location) ^ (Double.doubleToLongBits(this.location) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.size) ^ (Double.doubleToLongBits(this.size) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.room) ^ (Double.doubleToLongBits(this.room) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.level) ^ (Double.doubleToLongBits(this.level) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.furniture) ^ (Double.doubleToLongBits(this.furniture) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.layout) ^ (Double.doubleToLongBits(this.layout) >>> 32));
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
        final Home other = (Home) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.location) != Double.doubleToLongBits(other.location)) {
            return false;
        }
        if (Double.doubleToLongBits(this.size) != Double.doubleToLongBits(other.size)) {
            return false;
        }
        if (Double.doubleToLongBits(this.room) != Double.doubleToLongBits(other.room)) {
            return false;
        }
        if (Double.doubleToLongBits(this.level) != Double.doubleToLongBits(other.level)) {
            return false;
        }
        if (Double.doubleToLongBits(this.furniture) != Double.doubleToLongBits(other.furniture)) {
            return false;
        }
        return Double.doubleToLongBits(this.layout) == Double.doubleToLongBits(other.layout);
    }    
    
}

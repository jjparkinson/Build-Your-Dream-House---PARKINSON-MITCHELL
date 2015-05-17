/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamHouse.view;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Renee
 */
public class Layout implements Serializable {

    //class instance variables
    private double Space;
    private double oneLevel;
    private double twolevels;
    private double threelevels;
    private String urban;
    private String rural;
    private String surburb;
    private String bungalowStyle;
    private String colonialStyle;
    private String victorianStyle;

    public Layout() {
    }

    public double getSpace() {
        return Space;
    }

    public void setSpace(double Space) {
        this.Space = Space;
    }

    public double getOneLevel() {
        return oneLevel;
    }

    public void setOneLevel(double oneLevel) {
        this.oneLevel = oneLevel;
    }

    public double getTwolevels() {
        return twolevels;
    }

    public void setTwolevels(double twolevels) {
        this.twolevels = twolevels;
    }

    public double getThreelevels() {
        return threelevels;
    }

    public void setThreelevels(double threelevels) {
        this.threelevels = threelevels;
    }

    public String getUrban() {
        return urban;
    }

    public void setUrban(String urban) {
        this.urban = urban;
    }

    public String getRural() {
        return rural;
    }

    public void setRural(String rural) {
        this.rural = rural;
    }

    public String getSurburb() {
        return surburb;
    }

    public void setSurburb(String surburb) {
        this.surburb = surburb;
    }

    public String getBungalowStyle() {
        return bungalowStyle;
    }

    public void setBungalowStyle(String bungalowStyle) {
        this.bungalowStyle = bungalowStyle;
    }

    public String getColonialStyle() {
        return colonialStyle;
    }

    public void setColonialStyle(String colonialStyle) {
        this.colonialStyle = colonialStyle;
    }

    public String getVictorianStyle() {
        return victorianStyle;
    }

    public void setVictorianStyle(String victorianStyle) {
        this.victorianStyle = victorianStyle;
    }

    @Override
    public String toString() {
        return "Layout{" + "Space=" + Space + ", oneLevel=" + oneLevel + ", twolevels=" + twolevels + ", threelevels=" + threelevels + ", urban=" + urban + ", rural=" + rural + ", surburb=" + surburb + ", bungalowStyle=" + bungalowStyle + ", colonialStyle=" + colonialStyle + ", victorianStyle=" + victorianStyle + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.Space) ^ (Double.doubleToLongBits(this.Space) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.oneLevel) ^ (Double.doubleToLongBits(this.oneLevel) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.twolevels) ^ (Double.doubleToLongBits(this.twolevels) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.threelevels) ^ (Double.doubleToLongBits(this.threelevels) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.urban);
        hash = 37 * hash + Objects.hashCode(this.rural);
        hash = 37 * hash + Objects.hashCode(this.surburb);
        hash = 37 * hash + Objects.hashCode(this.bungalowStyle);
        hash = 37 * hash + Objects.hashCode(this.colonialStyle);
        hash = 37 * hash + Objects.hashCode(this.victorianStyle);
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
        final Layout other = (Layout) obj;
        if (Double.doubleToLongBits(this.Space) != Double.doubleToLongBits(other.Space)) {
            return false;
        }
        if (Double.doubleToLongBits(this.oneLevel) != Double.doubleToLongBits(other.oneLevel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.twolevels) != Double.doubleToLongBits(other.twolevels)) {
            return false;
        }
        if (Double.doubleToLongBits(this.threelevels) != Double.doubleToLongBits(other.threelevels)) {
            return false;
        }
        if (!Objects.equals(this.urban, other.urban)) {
            return false;
        }
        if (!Objects.equals(this.rural, other.rural)) {
            return false;
        }
        if (!Objects.equals(this.surburb, other.surburb)) {
            return false;
        }
        if (!Objects.equals(this.bungalowStyle, other.bungalowStyle)) {
            return false;
        }
        if (!Objects.equals(this.colonialStyle, other.colonialStyle)) {
            return false;
        }
        return Objects.equals(this.victorianStyle, other.victorianStyle);
    }

    public void setSpace(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}



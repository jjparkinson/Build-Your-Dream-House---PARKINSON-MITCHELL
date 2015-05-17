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
public class Inventory implements Serializable {

    //class instance variables
    private String homeMaterialReserve;
    private double windows;
    private double door;
    private double sink;
    private double bathtub;
    private double toilet;
    private double cabintry;
    private double woodFloorsSqFt;
    private double tilesLbs;
    private double counterTops;
    private double lightFixtures;
    private double carpetSqFt;
    private double paintGal;
    private double nails;
    private double screws;
    private double hammer;
    private double electricDrill;
    private String FurnitureFurnishingsReserve;
    private double livingRoomFurniture;
    private double diningRoomFurniture;
    private double bedRoomFurniture;
    private double kitchenAppliances;
    private double washerAndDryer;
    private double officeFurniture;
    private double patioFurniture;
    private String LandscapeSupplyReserve;
    private double shrubbery;
    private double trees;
    private double flowerVariety;
    private double bagsOfFertilizer;
    private double bagsOfGrassSeeds;
    private double sprinklersystem;

    public Inventory() {
    }
    
    public String getHomeMaterialReserve() {
        return homeMaterialReserve;
    }

    public void setHomeMaterialReserve(String homeMaterialReserve) {
        this.homeMaterialReserve = homeMaterialReserve;
    }

    public double getWindows() {
        return windows;
    }

    public void setWindows(double windows) {
        this.windows = windows;
    }

    public double getDoor() {
        return door;
    }

    public void setDoor(double door) {
        this.door = door;
    }

    public double getSink() {
        return sink;
    }

    public void setSink(double sink) {
        this.sink = sink;
    }

    public double getBathtub() {
        return bathtub;
    }

    public void setBathtub(double bathtub) {
        this.bathtub = bathtub;
    }

    public double getToilet() {
        return toilet;
    }

    public void setToilet(double toilet) {
        this.toilet = toilet;
    }

    public double getCabintry() {
        return cabintry;
    }

    public void setCabintry(double cabintry) {
        this.cabintry = cabintry;
    }

    public double getWoodFloorsSqFt() {
        return woodFloorsSqFt;
    }

    public void setWoodFloorsSqFt(double woodFloorsSqFt) {
        this.woodFloorsSqFt = woodFloorsSqFt;
    }

    public double getTiles() {
        return tilesLbs;
    }

    public void setTiles(double tiles) {
        this.tilesLbs = tiles;
    }

    public double getCounterTops() {
        return counterTops;
    }

    public void setCounterTops(double counterTops) {
        this.counterTops = counterTops;
    }

    public double getLightFixtures() {
        return lightFixtures;
    }

    public void setLightFixtures(double lightFixtures) {
        this.lightFixtures = lightFixtures;
    }

    public double getCarpetSqFt() {
        return carpetSqFt;
    }

    public void setCarpetSqFt(double carpetSqFt) {
        this.carpetSqFt = carpetSqFt;
    }

    public double getPaintGal() {
        return paintGal;
    }

    public void setPaint(double paint) {
        this.paintGal = paint;
    }

    public double getNails() {
        return nails;
    }

    public void setNails(double nails) {
        this.nails = nails;
    }

    public double getScrews() {
        return screws;
    }

    public void setScrews(double screws) {
        this.screws = screws;
    }

    public double getHammer() {
        return hammer;
    }

    public void setHammer(double hammer) {
        this.hammer = hammer;
    }

    public double getElectricDrill() {
        return electricDrill;
    }

    public void setElectricDrill(double electricDrill) {
        this.electricDrill = electricDrill;
    }

    public String getFurnitureFurnishingsReserve() {
        return FurnitureFurnishingsReserve;
    }

    public void setFurnitureFurnishingsReserve(String FurnitureFurnishingsReserve) {
        this.FurnitureFurnishingsReserve = FurnitureFurnishingsReserve;
    }

    public double getLivingRoomFurniture() {
        return livingRoomFurniture;
    }

    public void setLivingRoomFurniture(double livingRoomFurniture) {
        this.livingRoomFurniture = livingRoomFurniture;
    }

    public double getDiningRoomFurniture() {
        return diningRoomFurniture;
    }

    public void setDiningRoomFurniture(double diningRoomFurniture) {
        this.diningRoomFurniture = diningRoomFurniture;
    }

    public double getBedRoomFurniture() {
        return bedRoomFurniture;
    }

    public void setBedRoomFurniture(double bedRoomFurniture) {
        this.bedRoomFurniture = bedRoomFurniture;
    }

    public double getKitchenAppliances() {
        return kitchenAppliances;
    }

    public void setKitchenAppliances(double kitchenAppliances) {
        this.kitchenAppliances = kitchenAppliances;
    }

    public double getWasherAndDryer() {
        return washerAndDryer;
    }

    public void setWasherAndDryer(double washerAndDryer) {
        this.washerAndDryer = washerAndDryer;
    }

    public double getOfficeFurniture() {
        return officeFurniture;
    }

    public void setOfficeFurniture(double officeFurniture) {
        this.officeFurniture = officeFurniture;
    }

    public double getPatioFurniture() {
        return patioFurniture;
    }

    public void setPatioFurniture(double patioFurniture) {
        this.patioFurniture = patioFurniture;
    }

    public String getLandscapeSupplyReserve() {
        return LandscapeSupplyReserve;
    }

    public void setLandscapeSupplyReserve(String LandscapeSupplyReserve) {
        this.LandscapeSupplyReserve = LandscapeSupplyReserve;
    }

    public double getShrubbery() {
        return shrubbery;
    }

    public void setShrubbery(double shrubbery) {
        this.shrubbery = shrubbery;
    }

    public double getTrees() {
        return trees;
    }

    public void setTrees(double trees) {
        this.trees = trees;
    }

    public double getFlowerVariety() {
        return flowerVariety;
    }

    public void setFlowerVariety(double flowerVariety) {
        this.flowerVariety = flowerVariety;
    }

    public double getBagsOfFertilizer() {
        return bagsOfFertilizer;
    }

    public void setBagsOfFertilizer(double bagsOfFertilizer) {
        this.bagsOfFertilizer = bagsOfFertilizer;
    }

    public double getBagsOfGrassSeeds() {
        return bagsOfGrassSeeds;
    }

    public void setBagsOfGrassSeeds(double bagsOfGrassSeeds) {
        this.bagsOfGrassSeeds = bagsOfGrassSeeds;
    }

    public double getSprinklersystem() {
        return sprinklersystem;
    }

    public void setSprinklersystem(double sprinklersystem) {
        this.sprinklersystem = sprinklersystem;
    }

    @Override
    public String toString() {
        return "Inventory{" + "homeMaterialReserve=" + homeMaterialReserve + ", windows=" + windows + ", door=" + door + ", sink=" + sink + ", bathtub=" + bathtub + ", toilet=" + toilet + ", cabintry=" + cabintry + ", woodFloorsSqFt=" + woodFloorsSqFt + ", tilesLbs=" + tilesLbs + ", counterTops=" + counterTops + ", lightFixtures=" + lightFixtures + ", carpetSqFt=" + carpetSqFt + ", paintGal=" + paintGal + ", nails=" + nails + ", screws=" + screws + ", hammer=" + hammer + ", electricDrill=" + electricDrill + ", FurnitureFurnishingsReserve=" + FurnitureFurnishingsReserve + ", livingRoomFurniture=" + livingRoomFurniture + ", diningRoomFurniture=" + diningRoomFurniture + ", bedRoomFurniture=" + bedRoomFurniture + ", kitchenAppliances=" + kitchenAppliances + ", washerAndDryer=" + washerAndDryer + ", officeFurniture=" + officeFurniture + ", patioFurniture=" + patioFurniture + ", LandscapeSupplyReserve=" + LandscapeSupplyReserve + ", shrubbery=" + shrubbery + ", trees=" + trees + ", flowerVariety=" + flowerVariety + ", bagsOfFertilizer=" + bagsOfFertilizer + ", bagsOFGrassSeeds=" + bagsOfGrassSeeds + ", sprinklersystem=" + sprinklersystem + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.homeMaterialReserve);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.windows) ^ (Double.doubleToLongBits(this.windows) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.door) ^ (Double.doubleToLongBits(this.door) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.sink) ^ (Double.doubleToLongBits(this.sink) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.bathtub) ^ (Double.doubleToLongBits(this.bathtub) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.toilet) ^ (Double.doubleToLongBits(this.toilet) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.cabintry) ^ (Double.doubleToLongBits(this.cabintry) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.woodFloorsSqFt) ^ (Double.doubleToLongBits(this.woodFloorsSqFt) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.tilesLbs) ^ (Double.doubleToLongBits(this.tilesLbs) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.counterTops) ^ (Double.doubleToLongBits(this.counterTops) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.lightFixtures) ^ (Double.doubleToLongBits(this.lightFixtures) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.carpetSqFt) ^ (Double.doubleToLongBits(this.carpetSqFt) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.paintGal) ^ (Double.doubleToLongBits(this.paintGal) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.nails) ^ (Double.doubleToLongBits(this.nails) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.screws) ^ (Double.doubleToLongBits(this.screws) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.hammer) ^ (Double.doubleToLongBits(this.hammer) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.electricDrill) ^ (Double.doubleToLongBits(this.electricDrill) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.FurnitureFurnishingsReserve);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.livingRoomFurniture) ^ (Double.doubleToLongBits(this.livingRoomFurniture) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.diningRoomFurniture) ^ (Double.doubleToLongBits(this.diningRoomFurniture) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.bedRoomFurniture) ^ (Double.doubleToLongBits(this.bedRoomFurniture) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.kitchenAppliances) ^ (Double.doubleToLongBits(this.kitchenAppliances) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.washerAndDryer) ^ (Double.doubleToLongBits(this.washerAndDryer) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.officeFurniture) ^ (Double.doubleToLongBits(this.officeFurniture) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.patioFurniture) ^ (Double.doubleToLongBits(this.patioFurniture) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.LandscapeSupplyReserve);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.shrubbery) ^ (Double.doubleToLongBits(this.shrubbery) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.trees) ^ (Double.doubleToLongBits(this.trees) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.flowerVariety) ^ (Double.doubleToLongBits(this.flowerVariety) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.bagsOfFertilizer) ^ (Double.doubleToLongBits(this.bagsOfFertilizer) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.bagsOfGrassSeeds) ^ (Double.doubleToLongBits(this.bagsOfGrassSeeds) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.sprinklersystem) ^ (Double.doubleToLongBits(this.sprinklersystem) >>> 32));
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.homeMaterialReserve, other.homeMaterialReserve)) {
            return false;
        }
        if (Double.doubleToLongBits(this.windows) != Double.doubleToLongBits(other.windows)) {
            return false;
        }
        if (Double.doubleToLongBits(this.door) != Double.doubleToLongBits(other.door)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sink) != Double.doubleToLongBits(other.sink)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bathtub) != Double.doubleToLongBits(other.bathtub)) {
            return false;
        }
        if (Double.doubleToLongBits(this.toilet) != Double.doubleToLongBits(other.toilet)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cabintry) != Double.doubleToLongBits(other.cabintry)) {
            return false;
        }
        if (Double.doubleToLongBits(this.woodFloorsSqFt) != Double.doubleToLongBits(other.woodFloorsSqFt)) {
            return false;
        }
        if (Double.doubleToLongBits(this.tilesLbs) != Double.doubleToLongBits(other.tilesLbs)) {
            return false;
        }
        if (Double.doubleToLongBits(this.counterTops) != Double.doubleToLongBits(other.counterTops)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lightFixtures) != Double.doubleToLongBits(other.lightFixtures)) {
            return false;
        }
        if (Double.doubleToLongBits(this.carpetSqFt) != Double.doubleToLongBits(other.carpetSqFt)) {
            return false;
        }
        if (Double.doubleToLongBits(this.paintGal) != Double.doubleToLongBits(other.paintGal)) {
            return false;
        }
        if (Double.doubleToLongBits(this.nails) != Double.doubleToLongBits(other.nails)) {
            return false;
        }
        if (Double.doubleToLongBits(this.screws) != Double.doubleToLongBits(other.screws)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hammer) != Double.doubleToLongBits(other.hammer)) {
            return false;
        }
        if (Double.doubleToLongBits(this.electricDrill) != Double.doubleToLongBits(other.electricDrill)) {
            return false;
        }
        if (!Objects.equals(this.FurnitureFurnishingsReserve, other.FurnitureFurnishingsReserve)) {
            return false;
        }
        if (Double.doubleToLongBits(this.livingRoomFurniture) != Double.doubleToLongBits(other.livingRoomFurniture)) {
            return false;
        }
        if (Double.doubleToLongBits(this.diningRoomFurniture) != Double.doubleToLongBits(other.diningRoomFurniture)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bedRoomFurniture) != Double.doubleToLongBits(other.bedRoomFurniture)) {
            return false;
        }
        if (Double.doubleToLongBits(this.kitchenAppliances) != Double.doubleToLongBits(other.kitchenAppliances)) {
            return false;
        }
        if (Double.doubleToLongBits(this.washerAndDryer) != Double.doubleToLongBits(other.washerAndDryer)) {
            return false;
        }
        if (Double.doubleToLongBits(this.officeFurniture) != Double.doubleToLongBits(other.officeFurniture)) {
            return false;
        }
        if (Double.doubleToLongBits(this.patioFurniture) != Double.doubleToLongBits(other.patioFurniture)) {
            return false;
        }
        if (!Objects.equals(this.LandscapeSupplyReserve, other.LandscapeSupplyReserve)) {
            return false;
        }
        if (Double.doubleToLongBits(this.shrubbery) != Double.doubleToLongBits(other.shrubbery)) {
            return false;
        }
        if (Double.doubleToLongBits(this.trees) != Double.doubleToLongBits(other.trees)) {
            return false;
        }
        if (Double.doubleToLongBits(this.flowerVariety) == Double.doubleToLongBits(other.flowerVariety)) {
        } else {
            return false;
        }
        if (Double.doubleToLongBits(this.bagsOfFertilizer) != Double.doubleToLongBits(other.bagsOfFertilizer)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bagsOfGrassSeeds) == Double.doubleToLongBits(other.bagsOfGrassSeeds)) {
        } else {
            return false;
        }
        return Double.doubleToLongBits(this.sprinklersystem) == Double.doubleToLongBits(other.sprinklersystem);
    }

    public void setsink(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setbathtub(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setWoodFloorsSqFt(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTileLbs(long l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCapetSqFt(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPaintGal(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSprinkersystem(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setBedroomFurniture(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}



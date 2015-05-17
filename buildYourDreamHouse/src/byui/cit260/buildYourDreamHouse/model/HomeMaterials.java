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
public class HomeMaterials implements Serializable {

    //class instance variables
    private String buyHomeSupplies;
    private String buyFurnitureFurnishings;
    private String buyLandscapeSupplies;
    private String grabFixtures;
    private String moveFixtures;
    private String grabFurniture;
    private String moveFurniture;
    private String grabShrubbery;
    private String moveShrubbery;
    private String toolsNeeded;

    public HomeMaterials() {
    }

    public String getBuyHomeSupplies() {
        return buyHomeSupplies;
    }

    public void setBuyHomeSupplies(String buyHomeSupplies) {
        this.buyHomeSupplies = buyHomeSupplies;
    }

    public String getBuyFurnitureFurnishings() {
        return buyFurnitureFurnishings;
    }

    public void setBuyFurnitureFurnishings(String buyFurnitureFurnishings) {
        this.buyFurnitureFurnishings = buyFurnitureFurnishings;
    }

    public String getBuyLandscapeSupplies() {
        return buyLandscapeSupplies;
    }

    public void setBuyLandscapeSupplies(String buyLandscapeSupplies) {
        this.buyLandscapeSupplies = buyLandscapeSupplies;
    }

    public String getGrabFixtures() {
        return grabFixtures;
    }

    public void setGrabFixtures(String grabFixtures) {
        this.grabFixtures = grabFixtures;
    }

    public String getMoveFixtures() {
        return moveFixtures;
    }

    public void setMoveFixtures(String moveFixtures) {
        this.moveFixtures = moveFixtures;
    }

    public String getGrabFurniture() {
        return grabFurniture;
    }

    public void setGrabFurniture(String grabFurniture) {
        this.grabFurniture = grabFurniture;
    }

    public String getMoveFurniture() {
        return moveFurniture;
    }

    public void setMoveFurniture(String moveFurniture) {
        this.moveFurniture = moveFurniture;
    }

    public String getGrabShrubbery() {
        return grabShrubbery;
    }

    public void setGrabShrubbery(String grabShrubbery) {
        this.grabShrubbery = grabShrubbery;
    }

    public String getMoveShrubbery() {
        return moveShrubbery;
    }

    public void setMoveShrubbery(String moveShrubbery) {
        this.moveShrubbery = moveShrubbery;
    }

    public String getToolsNeeded() {
        return toolsNeeded;
    }

    public void setToolsNeeded(String toolsNeeded) {
        this.toolsNeeded = toolsNeeded;
    }

    @Override
    public String toString() {
        return "HomeMaterials{" + "buyHomeSupplies=" + buyHomeSupplies + ", buyFurnitureFurnishings=" + buyFurnitureFurnishings + ", buyLandscapeSupplies=" + buyLandscapeSupplies + ", grabFixtures=" + grabFixtures + ", moveFixtures=" + moveFixtures + ", grabFurniture=" + grabFurniture + ", moveFurniture=" + moveFurniture + ", grabShrubbery=" + grabShrubbery + ", moveShrubbery=" + moveShrubbery + ", toolsNeeded=" + toolsNeeded + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.buyHomeSupplies);
        hash = 29 * hash + Objects.hashCode(this.buyFurnitureFurnishings);
        hash = 29 * hash + Objects.hashCode(this.buyLandscapeSupplies);
        hash = 29 * hash + Objects.hashCode(this.grabFixtures);
        hash = 29 * hash + Objects.hashCode(this.moveFixtures);
        hash = 29 * hash + Objects.hashCode(this.grabFurniture);
        hash = 29 * hash + Objects.hashCode(this.moveFurniture);
        hash = 29 * hash + Objects.hashCode(this.grabShrubbery);
        hash = 29 * hash + Objects.hashCode(this.moveShrubbery);
        hash = 29 * hash + Objects.hashCode(this.toolsNeeded);
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
        final HomeMaterials other = (HomeMaterials) obj;
        if (!Objects.equals(this.buyHomeSupplies, other.buyHomeSupplies)) {
            return false;
        }
        if (!Objects.equals(this.buyFurnitureFurnishings, other.buyFurnitureFurnishings)) {
            return false;
        }
        if (!Objects.equals(this.buyLandscapeSupplies, other.buyLandscapeSupplies)) {
            return false;
        }
        if (!Objects.equals(this.grabFixtures, other.grabFixtures)) {
            return false;
        }
        if (!Objects.equals(this.moveFixtures, other.moveFixtures)) {
            return false;
        }
        if (!Objects.equals(this.grabFurniture, other.grabFurniture)) {
            return false;
        }
        if (!Objects.equals(this.moveFurniture, other.moveFurniture)) {
            return false;
        }
        if (!Objects.equals(this.grabShrubbery, other.grabShrubbery)) {
            return false;
        }
        if (!Objects.equals(this.moveShrubbery, other.moveShrubbery)) {
            return false;
        }
        return Objects.equals(this.toolsNeeded, other.toolsNeeded);
    }    

    public void setBuyLanscapeSupplies(String seedlingsfertilizerand_rose_bush) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

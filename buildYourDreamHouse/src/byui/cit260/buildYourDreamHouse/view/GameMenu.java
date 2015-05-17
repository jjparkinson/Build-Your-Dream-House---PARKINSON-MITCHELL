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
public class GameMenu implements Serializable {

    //class instancevariables
    private String storyBackground;
    private String chooseAHouse;
    private String chooseAFamily;
    private String chooseALocation;
    private String selectTools;
    private String playGame;
    private String pauseGame;   
    private String statusCompletion;
    private double score;
    private String saveGame;
    private String exitGame;

    public GameMenu() {
    }
    
    public String getStoryBackground() {
        return storyBackground;
    }

    public void setStoryBackground(String storyBackground) {
        this.storyBackground = storyBackground;
    }

    public String getChooseAHouse() {
        return chooseAHouse;
    }

    public void setChooseAHouse(String chooseAHouse) {
        this.chooseAHouse = chooseAHouse;
    }

    public String getChooseAFamily() {
        return chooseAFamily;
    }

    public void setChooseAFamily(String chooseAFamily) {
        this.chooseAFamily = chooseAFamily;
    }

    public String getChooseALocation() {
        return chooseALocation;
    }

    public void setChooseALocation(String chooseALocation) {
        this.chooseALocation = chooseALocation;
    }

    public String getSelectTools() {
        return selectTools;
    }

    public void setSelectTools(String selectTools) {
        this.selectTools = selectTools;
    }

    public String getPlayGame() {
        return playGame;
    }

    public void setPlayGame(String playGame) {
        this.playGame = playGame;
    }

    public String getPauseGame() {
        return pauseGame;
    }

    public void setPauseGame(String pauseGame) {
        this.pauseGame = pauseGame;
    }

    public String getStatusCompletion() {
        return statusCompletion;
    }

    public void setStatusCompletion(String statusCompletion) {
        this.statusCompletion = statusCompletion;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getSaveGame() {
        return saveGame;
    }

    public void setSaveGame(String saveGame) {
        this.saveGame = saveGame;
    }

    public String getExitGame() {
        return exitGame;
    }

    public void setExitGame(String exitGame) {
        this.exitGame = exitGame;
    }

    @Override
    public String toString() {
        return "GameMenu{" + "storyBackground=" + storyBackground + ", chooseAHouse=" + chooseAHouse + ", chooseAFamily=" + chooseAFamily + ", chooseALocation=" + chooseALocation + ", selectTools=" + selectTools + ", playGame=" + playGame + ", pauseGame=" + pauseGame + ", statusCompletion=" + statusCompletion + ", score=" + score + ", saveGame=" + saveGame + ", exitGame=" + exitGame + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.storyBackground);
        hash = 79 * hash + Objects.hashCode(this.chooseAHouse);
        hash = 79 * hash + Objects.hashCode(this.chooseAFamily);
        hash = 79 * hash + Objects.hashCode(this.chooseALocation);
        hash = 79 * hash + Objects.hashCode(this.selectTools);
        hash = 79 * hash + Objects.hashCode(this.playGame);
        hash = 79 * hash + Objects.hashCode(this.pauseGame);
        hash = 79 * hash + Objects.hashCode(this.statusCompletion);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.score) ^ (Double.doubleToLongBits(this.score) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.saveGame);
        hash = 79 * hash + Objects.hashCode(this.exitGame);
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
        final GameMenu other = (GameMenu) obj;
        if (!Objects.equals(this.storyBackground, other.storyBackground)) {
            return false;
        }
        if (!Objects.equals(this.chooseAHouse, other.chooseAHouse)) {
            return false;
        }
        if (!Objects.equals(this.chooseAFamily, other.chooseAFamily)) {
            return false;
        }
        if (!Objects.equals(this.chooseALocation, other.chooseALocation)) {
            return false;
        }
        if (!Objects.equals(this.selectTools, other.selectTools)) {
            return false;
        }
        if (!Objects.equals(this.playGame, other.playGame)) {
            return false;
        }
        if (!Objects.equals(this.pauseGame, other.pauseGame)) {
            return false;
        }
        if (!Objects.equals(this.statusCompletion, other.statusCompletion)) {
            return false;
        }
        if (Double.doubleToLongBits(this.score) != Double.doubleToLongBits(other.score)) {
            return false;
        }
        if (!Objects.equals(this.saveGame, other.saveGame)) {
            return false;
        }
        return Objects.equals(this.exitGame, other.exitGame);
    }     

    public void setScore(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

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
public class HelpMenu implements Serializable {

    //class instance variables;
    private String howToPlayGame;
    private String levelShortCuts;
    private String toolIndex;

    public HelpMenu() {
    }
    
    public String getHowToPlayGame() {
        return howToPlayGame;
    }

    public void setHowToPlayGame(String howToPlayGame) {
        this.howToPlayGame = howToPlayGame;
    }

    public String getLevelShortCuts() {
        return levelShortCuts;
    }

    public void setLevelShortCuts(String levelShortCuts) {
        this.levelShortCuts = levelShortCuts;
    }

    public String getToolIndex() {
        return toolIndex;
    }

    public void setToolIndex(String toolIndex) {
        this.toolIndex = toolIndex;
    }

    @Override
    public String toString() {
        return "HelpMenu{" + "howToPlayGame=" + howToPlayGame + ", levelShortCuts=" + levelShortCuts + ", toolIndex=" + toolIndex + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.howToPlayGame);
        hash = 59 * hash + Objects.hashCode(this.levelShortCuts);
        hash = 59 * hash + Objects.hashCode(this.toolIndex);
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
        final HelpMenu other = (HelpMenu) obj;
        if (!Objects.equals(this.howToPlayGame, other.howToPlayGame)) {
            return false;
        }
        if (!Objects.equals(this.levelShortCuts, other.levelShortCuts)) {
            return false;
        }
        return Objects.equals(this.toolIndex, other.toolIndex);
    }    

}

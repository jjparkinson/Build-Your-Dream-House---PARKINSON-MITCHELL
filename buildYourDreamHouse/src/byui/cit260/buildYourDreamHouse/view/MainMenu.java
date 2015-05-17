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
public class MainMenu implements Serializable {
    
    //class instance variables
    private String homeButton;
    private String newGame;
    private String help;
    private String aboutThisGame;
    private String keyboardShortCuts;
    private String index;

    public MainMenu() {
    }
    
    public String getHomeButton() {
        return homeButton;
    }

    public void setHomeButton(String homeButton) {
        this.homeButton = homeButton;
    }

    public String getNewGame() {
        return newGame;
    }

    public void setNewGame(String newGame) {
        this.newGame = newGame;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getAboutThisGame() {
        return aboutThisGame;
    }

    public void setAboutThisGame(String aboutThisGame) {
        this.aboutThisGame = aboutThisGame;
    }

    public String getKeyboardShortCuts() {
        return keyboardShortCuts;
    }

    public void setKeyboardShortCuts(String keyboardShortCuts) {
        this.keyboardShortCuts = keyboardShortCuts;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "MainMenu{" + "homeButton=" + homeButton + ", newGame=" + newGame + ", help=" + help + ", aboutThisGame=" + aboutThisGame + ", keyboardShortCuts=" + keyboardShortCuts + ", index=" + index + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.homeButton);
        hash = 41 * hash + Objects.hashCode(this.newGame);
        hash = 41 * hash + Objects.hashCode(this.help);
        hash = 41 * hash + Objects.hashCode(this.aboutThisGame);
        hash = 41 * hash + Objects.hashCode(this.index);
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
        final MainMenu other = (MainMenu) obj;
        if (!Objects.equals(this.homeButton, other.homeButton)) {
            return false;
        }
        if (!Objects.equals(this.newGame, other.newGame)) {
            return false;
        }
        if (!Objects.equals(this.help, other.help)) {
            return false;
        }
        if (!Objects.equals(this.aboutThisGame, other.aboutThisGame)) {
            return false;
        }
        if (!Objects.equals(this.keyboardShortCuts, other.keyboardShortCuts)) {
            return false;
        }
        return Objects.equals(this.index, other.index);
    }     
            
}

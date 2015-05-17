/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamHouse.view;

import java.io.Serializable;

/**
 *
 * @author Renee
 */
public class ViewHomeStatus implements Serializable {

    //class instance variables
    private char completionStatusOfHome;
    private char completionStatusOfLandscape;
    private char checkBalanceAmount;
    private float checkDueDate ;

    public ViewHomeStatus() {
    }
    
    public char getCompletionStatusOfHome() {
        return completionStatusOfHome;
    }

    public void setCompletionStatusOfHome(char completionStatusOfHome) {
        this.completionStatusOfHome = completionStatusOfHome;
    }

    public char getCompletionStatusOfLandscape() {
        return completionStatusOfLandscape;
    }

    public void setCompletionStatusOfLandscape(char completionStatusOfLandscape) {
        this.completionStatusOfLandscape = completionStatusOfLandscape;
    }

    public char getCheckBalanceAmount() {
        return checkBalanceAmount;
    }

    public void setCheckBalanceAmount(char checkBalanceAmount) {
        this.checkBalanceAmount = checkBalanceAmount;
    }

    public float getCheckDueDate() {
        return checkDueDate;
    }

    public void setCheckDueDate(float checkDueDate) {
        this.checkDueDate = checkDueDate;
        
    }

    @Override
    public String toString() {
        return "ViewHomeStatus{" + "completionStatusOfHome=" + completionStatusOfHome + ", completionStatusOfLandscape=" + completionStatusOfLandscape + ", checkBalanceAmount=" + checkBalanceAmount + ", checkDueDate=" + checkDueDate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.completionStatusOfHome;
        hash = 83 * hash + this.completionStatusOfLandscape;
        hash = 83 * hash + this.checkBalanceAmount;
        hash = 83 * hash + Float.floatToIntBits(this.checkDueDate);
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
        final ViewHomeStatus other = (ViewHomeStatus) obj;
        if (this.completionStatusOfHome != other.completionStatusOfHome) {
            return false;
        }
        if (this.completionStatusOfLandscape != other.completionStatusOfLandscape) {
            return false;
        }
        if (this.checkBalanceAmount != other.checkBalanceAmount) {
            return false;
        }
        return Float.floatToIntBits(this.checkDueDate) == Float.floatToIntBits(other.checkDueDate);
    }

    public Float toFloat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void SetBalanceAmount(int i, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void SetDeadLineDate(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void SetCompletionStatusOfLandscape(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void SetCompletionStatusOfHome(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
  }

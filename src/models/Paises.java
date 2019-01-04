/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author jvega
 */
public enum Paises {
    
    COLOMBIA(254),
    PERU(128),
    ECUADOR(128),
    VENEZUELA(128),
    PANAMA(128),
    URUGUAY(128),
    PARAGUAY(128);
    
    private int levelCode;

    Paises(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(int levelCode) {
        this.levelCode = levelCode;
    }
    
    
    
    
}

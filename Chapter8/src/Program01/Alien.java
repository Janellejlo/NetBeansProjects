/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program01;

/**
 *
 * @author janellejlo
 */
public abstract class Alien {
	
    protected int damageType,health;
    protected String name;
	
    Alien(int type, String name, int damg){
        this.health=type;
        this.name=name;
        this.damageType=damg;
    }
    
    public abstract int getDamage();
}
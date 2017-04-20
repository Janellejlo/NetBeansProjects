/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program03;

/**
 *
 * @author janellejlo
 */

public abstract class Alien{
      
    // FIELDS
    public int health;  
    public String name;

    // 2-ARG CONSTRUCTOR
    public Alien(int health, String name){ 
        this.health = health;
        this.name = name; 
    } 

    // SETTERS
    public void setHealth(int h){
        health = h;
    }
      
    public void setName(String n){
        name = n;
    }

    // GETTERS
    public int getHealth(){
        return health;
    }
      
    public String getName(){
        return name;
    }

    // TO GET DAMAGE INFLICTED BY ALIEN
    public abstract int getDamage();
}

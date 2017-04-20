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
public class OgreAlien extends Alien{

    // INSTANCE VARIABLE
    private final int OGRE_DAMAGE = 6;

    // 2-ARG COSNTRUCTOR
    public OgreAlien(int health, String name){
        super(health, name);
    }

    // TO GET DAMAGE INFLICTED BY ALIEN
    public int getDamage(){
        return OGRE_DAMAGE;
    }
}
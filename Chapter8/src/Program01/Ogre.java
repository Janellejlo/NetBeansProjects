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
public class Ogre extends Alien{
    
    Ogre(int type, String name) {
        super(type, name, 100);
    }
    
    public int getDamage(){
        return this.damageType;
    }
}
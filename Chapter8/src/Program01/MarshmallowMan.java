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
public class MarshmallowMan extends Alien{
    
    MarshmallowMan(int type, String name){
        super(type, name, 200);
    }
    
    public int getDamage(){
        return this.damageType;
    }
}
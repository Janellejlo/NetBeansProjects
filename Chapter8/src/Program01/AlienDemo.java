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
public class AlienDemo {
    
    public static void main(String[] args){
	
        AlienPack ap=new AlienPack(3);
        
            ap.addAlien(new Ogre(10,"Mark"),0);
            ap.addAlien(new Snake(10,"Peter"),1);
            ap.addAlien(new MarshmallowMan(10,"John"),2);
        
            System.out.println("Total damages="+ap.calculateDamage());
    }
}
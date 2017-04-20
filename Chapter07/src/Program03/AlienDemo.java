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
public class AlienDemo{ 
    
    public static void main(String[] args){ 
        
        // Creating alien objects
        Alien brutus = new SnakeAlien(100,"brutus");
        Alien slimy = new OgreAlien(100,"slimy"); 
        Alien puffy = new MarshmallowAlien(100,"puffy"); 
 
        // Creating an alien pack (array)
        AlienPack pack = new AlienPack(3);
        pack.addAlien(brutus, 0); 
        pack.addAlien(slimy, 1); 
        pack.addAlien(puffy, 2); 
 
        // Display total pack damage 
        System.out.println("Total pack damage = " +  pack.calculateDamage()); 
    } 
} 
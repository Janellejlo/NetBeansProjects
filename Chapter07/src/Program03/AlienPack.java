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
public class AlienPack{
   
    // FIELD 
    private Alien[] aliens; 

    // CONSTRUCTOR
    public AlienPack(int numAliens){ 
        
        // Create an array to hold number of aliens in pack
        aliens = new Alien[numAliens];
    } 
  
    // SETTER: ADDING ALIENS TO THE PACK
    public void addAlien(Alien newAlien, int index){ 
        
        // Filling the array with aliens
        aliens[index] = newAlien;
    } 

    // GETTER
    public Alien[] getAliens(){ 
        return aliens; 
    } 

    // TO CALCULATE DAMAGE INFLICTED BY ALIEN PACK
    public int calculateDamage(){ 
        int damage = 0; 
        
        // Call getDamage() from each alien to
        for (int i=0; i<aliens.length; i++)
            
            // calculate total damage
            damage += aliens[i].getDamage();
        
        return damage; 
  } 
}
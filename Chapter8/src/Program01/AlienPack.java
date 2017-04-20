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
public class AlienPack{

    private Alien[] a;
    
    public AlienPack(int countAliens){
        a=new Alien[countAliens];
    }

    public void addAlien(Alien newAlien, int index){
        a[index]=newAlien;
    }

    public Alien[] getAliens(){
        return a;
    }

    public int calculateDamage(){
        int d=0;
        
        for(int i=0;i<a.length;i++)
            d+=a[i].getDamage();
            return d;
    }
}
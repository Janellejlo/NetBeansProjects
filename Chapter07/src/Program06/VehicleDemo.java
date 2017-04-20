/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program06;

/**
 *
 * @author janellejlo
 */
public class VehicleDemo{
    public static void main(String args[]){

        Person owner1 = new Person("Nathan Roy");
        Person owner2 = new Person("Peter England");
    
        Vehicle aCar = new Vehicle("Honda", 5, owner2);
        
        Truck aTruck = new Truck();
            
            aTruck.setmf("Skoda");
            aTruck.setcd(100);
            aTruck.setown(owner1);
            aTruck.setload(150.50);
            aTruck.setcapacity(3200);
        
        System.out.println("Truck Details: ");
        System.out.println(aTruck.getmf());
        System.out.println(aTruck.getcd());
        System.out.println(aTruck.getown());
        System.out.println(aTruck.getload());
        System.out.println(aTruck.getcapacity());
        System.out.println();
        System.out.println("Details of Vehicle 1: ");
        System.out.println(aCar);
        System.out.println("Details of Vehicle 2: ");
        System.out.println(aTruck);
	}
}

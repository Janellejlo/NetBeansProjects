/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program04;

/**
 *
 * @author janellejlo
 */
public class AdministratorDemo{
	
    public static void main(String[] args){
        
        Administrator admin1 = new Administrator();
	Administrator admin2 = new Administrator();
		
	admin1.readData();
	admin2.readData();
		
	System.out.println("Administrator 1:");
	System.out.println(admin1);
		
	System.out.println("\nAdministrator 2:");
	System.out.println(admin2);
    }
}
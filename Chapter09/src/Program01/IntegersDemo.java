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
import java.util.Scanner;

public class IntegersDemo {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
            
        Integers in;
            
        System.out.println("Enter the number of integers to be averaged");
        int val=keyboard.nextInt();
		
        in = new Integers(val);
		
        boolean error = false;
		
        for(int i =0; i<val; i++) {
            while(!error) {
                try{
                    System.out.println("Enter the value");
                    in.setValue(keyboard.nextInt(),i);
                    error = true;
                } catch (Exception e){
                    System.out.println("Only positive numbers");
                }
            }
        }
    }
}
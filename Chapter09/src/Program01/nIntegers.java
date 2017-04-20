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
import java.util.InputMismatchException; // Exception Control Loops

//Main Class
public class nIntegers {
    
        //Main Method
        public static void main(String args[]) {
            
            //Declaring the variables
            double total = 0, N, userInput;
            
            //Scanner class object
            Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Enter how many numbers(N) to calculate average:");
            userInput = input.nextDouble();
                
                // The number of N for average
                if (userInput > 0){
                    N = userInput;
                    break;
                } 
                else
                    System.out.println("N must be positive.");
        }
        
        
        for (int i = 0; i < N; i++) {
            while (true) {
                
                // Enter the numbers for the average.
                System.out.print("Enter number:");
                
                // Try to exceute 
                try {
                    /**If nextDouble throws an exception, 
                          try will block end the boolean variable*/
                    userInput = input.nextDouble();
                    
                    //Total of N that is inputed by user
                    total += userInput;
                    break;
                }
                
                /** Handles exceptions, if it is not a number
                        the invalid input will display error message*/
                catch (InputMismatchException e) {
                    input.nextLine();
                    System.out.println("Input must be a number. Try again");
                } 
            }
        }
        // Calculate Average from the total of N
        System.out.println("Average: "+ total / N);
    }
}
// Use only whole numbers 
//try-catch for alphabets
//limit numbers for the average
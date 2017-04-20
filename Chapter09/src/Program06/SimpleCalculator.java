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
import java.util.*;
public class SimpleCalculator{
	
    // performOperation method
    public static double performOperation(double value, String activity) throws UnknownOperatorException {
        
        //Get the first character of the String action 
        String arthOpter = activity.substring(0, 1);
        
        //When the operator is invalid, UnknownOperatorException is thrown.
        // The valid operators are +, -, *, /, = defining as  R or r
        if(!arthOpter.equals("+") && !arthOpter.equals("-")
             && !arthOpter.equals("*") && !arthOpter.equals("/")
            && !arthOpter.equals("R") && !arthOpter.equals("r"))
            throw new UnknownOperatorException(arthOpter);
        
        //If the operator is equals to R or r then no calculation is performed.
        if(arthOpter.equals("R") || arthOpter.equals("r"))
            return value;

        //Get all the characters exclude the first character of the String action
        double number = Double.parseDouble(activity.substring(1,activity.length()));
        
        System.out.print("result " + arthOpter + " " + number + " = ");

        /**Depending on the operator, it will calculate with the proper
        operation and obtain the total, and display the result.*/
        switch (arthOpter) {
            case "+":
                return value += number;
            case "-":
                return value -= number;
            case "*":
                return value *= number;
            default:
                return value /= number;
        }
    }// end performOperation method
	
// Main Method
public static void main(String args[]){

    // object for Scanner class
    @SuppressWarnings("resource") //Suppress compiler's warnings
    Scanner input = new Scanner(System.in);
    String decision = "y";
    System.out.println("Calculator is on.");

    //Check whether the first character of the string decision is y or Y
    while(decision.charAt(0) == 'y'|| decision.charAt(0) == 'Y'){
        
        // All the calculations should begin result of 0
        int count=0;
        double result = 0.0;
        String arthOpter = "";
        System.out.println("result = " + result);
        
        // Check whether the string operator is r or R
        while(!arthOpter.equals("R") && !arthOpter.equals("r")){
            arthOpter = input.nextLine();
            
            // try to execute function performOperation
            try {
                result = performOperation(result, arthOpter);
                count++;
                
                if(!arthOpter.equals("R") && !arthOpter.equals("r")) {
                    
                    if(count==1){
                        System.out.println(result);
                        System.out.println("New result = "+ result);
                    }
                    else {
                        System.out.println(result);
                        System.out.println("Updated result = " + result);
                    }
                }
            }
            
            // If the operator is invalid, it catch-block displaying error message
            catch(UnknownOperatorException e){
                System.out.println(e.getMessage());
                System.out.println("Reenter, your last line.");
            }
	}
        
        // Displays results
        System.out.println("Final result = " + result);
        
        // Ask user if they want to restart calculator
        System.out.println("Again? (y/n)");
        decision = input.nextLine();
        
        }
        System.out.println("End of Program.");
    }// End of Main Method
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program03;

/**
 *
 * @author janellejlo
 * 
 * Program that reads in the average monthly rainfall for
 * a city for each month of the year and read the actual
 * monthly rainfall for each of the previous 12 months.
 */
import java.util.*;

public class MonthlyRainfall {
    
    private static String monthString (int monthNumber){
        
        /**
         * The method: switch-case statement in order to 
         * check which month name, to return as a string
         */
        switch(monthNumber){
            case 1:
                return "January";
           
            case 2:
                return "February";
            
            case 3:
                return "March";
            
            case 4:
                return "April";
            
            case 5:
                return "May";
            
            case 6:
                return "June";
            
            case 7:
                return "July";
            
            case 8:
                return "August";
            
            case 9:
                return "September";
            
            case 10:
                return "October";
            
            case 11:
                return "November";
            
            case 12:
                return "December";
                
            default:
                /**
                 * if no proper month name is found based on the
                 * given month number, then the method will produce
                 * an error.
                */
                System.out.println("Fatal Error");
                System.exit(0);
                return "Error";
        }
    }
    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        
        double[] actualRain = new double[12];
        double[] averageRain = new double[12];
        
        /**
         * Prompting user to enter the average rainfall data
         * for each month. 
         * For-loop: to input an amount for each month.
         */
        System.out.println("Enter the average rainfall"+" for each month:");
        
        for(int r = 1; r <= 12; r++){
            System.out.print(monthString(r) + ":");
            averageRain[r - 1] = scan.nextDouble();
        }
        
        /**
         * Checks for which current month it is based on
         * the user's input.
         */
        System.out.println();
        System.out.print("What is the current month?" + "(Enter month number):");
            
            int currentMonth = scan.nextInt();
            System.out.println("Enter the actual rainfall"+ "for the past 12 months:");
        
        /**
         * for-loop: starts at current month that user inputs
         *      and ends at the last month, December.
         */
        for(int r = currentMonth; r <= 12; r++){
            System.out.print(monthString(r) + ":");
            actualRain[r - 1] = scan.nextDouble();
        }
        
        /**
         * For-loop: Starts at the beginning of the year and
         *      ends at the month, the user specified as the 
         *      current month.
         */
        for(int r = 1; r < currentMonth; r++){
            System.out.print(monthString(r)+":");
            actualRain[r - 1] = scan.nextDouble();
        }
        
        /**
         * Printing out a formatted table containing the average
         * and actual rainfall that occurs for each month.
         */
        System.out.println("Month\t\tAverage\t\t"+" Actual\t\tDifference");
        System.out.println("------\t\t-------\t\t"+"-------\t\t---------");
        
        /**
         * Print out the data for each month
         */
        for(int r = 1; r <= 12; r++){
            System.out.print(monthString(r)+"\t");
            
            if(r != 2 && r != 9 && r != 11 && r != 12)
                System.out.print("\t");
                System.out.print(" " + averageRain[r - 1]+ "\t\t");
                System.out.print(" " + actualRain[r - 1]+ "\t\t");
                
                /**
                 * Print the differences
                 */
                System.out.print(" " + (averageRain[r - 1] - actualRain[r - 1]));
                System.out.println();
        }
       
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program05;

/**
 *
 * @author janellejlo
 */
import java.util.*;
public class DateConversion{
    
    // maximumDay method: Maximum days in the M(month)
    public static int maximumDay(int monthNumber){
        
        switch(monthNumber){
            
            //February = 28 days
            case 2:
                return 28;
            
            // April, Jun, September, and November = 30 days 
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
                
            // Other Months = 31 days
            default:
                return 31;
        }
    } // end of maximumDay method
    
    // Read Month number input from user
    public static int readMonthNumber() throws MonthException{
        
        Scanner input = new Scanner(System.in);
        int month;
        System.out.println("Enter month number:");
        
        // Check input.
        // Input must be between 1 and 12
        try{
            month = input.nextInt();
            
            if(month <= 0 || month > 12)
                throw new MonthException();
        }
        
        // Displys invalid month, from MonthException
        catch(InputMismatchException e){
            throw new MonthException();
        }
        return month;
    } // end of month input
    
    // Read day number input from user
    public static int readDayNumber(int month) throws DayException{
        
        Scanner input = new Scanner(System.in);
        int day; 
        System.out.println("Enter day number:");
        
        /** If user input day number that exceeds the maximumDay 
                in a month, in the specific month that was inputted,
                then throws DayException

          * February is a special case, it cannot be checked without
                the year due to leap years (Ignore February dates)*/
        try{
            day = input.nextInt();
            if(month != 2 && (day <= 0 || day > maximumDay(month)))
                throw new DayException();
        }

        catch(InputMismatchException e){
            throw new DayException();
        }
        return day;
    } // End of Day Number

    // Read year number input from user    
    public static int readYearNumber() throws YearException{
        Scanner input = new Scanner(System.in);
        int year;
        
        System.out.println("Enter year number:");
        
        /** Check year number is within boundaries, between the
                year 1000 and year 3500
            If it is not in boundary, throws YearException*/
        try{
            year = input.nextInt();
            
            if(year <= 1000 || year > 3500)
                throw new YearException();
        }
        
        catch(InputMismatchException e){
            throw new YearException();
        }
        return year;
    } // End year number
   
    
    /** Special Case: February
                Set parameter for day and year*/    
    public static int checkFebruary(int day, int year) throws DayException{
        
        // maximumDay is 28 days, If it is leap year, it is 29 days
        int maxDay = maximumDay(2);

        if(year % 4 == 0)
            maxDay++;
        
        // Check if day is within boundary, if not throw DayException 
        if(day <= 0 || day > maxDay){
            throw new DayException();
        } else
            return day;
    } // End Special Case: February
    
    //Method for converting Month number to Month String.
    public static String monthString(int monthNumber){
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
                System.out.println("Fatal Error");
                System.exit(0);
                return "Error";
        }
    } // End of conversion
     
    //Main Method
    public static void main(String args[]) {
        
            // Declaring variables
            int month = 1, day = 1, year = 1000;
            
            // Check Month value input from user is valid
            boolean gotMonth = false;

            while(!gotMonth){
                try {
                    month = readMonthNumber();
                    gotMonth = true;
                } 

                catch (MonthException e) {
                    System.out.println(e.getMessage());
                }
        }
            
        // Check Day value input from user is valid
        boolean gotDay = false;

        while(!gotDay){
            try {
                day = readDayNumber(month);
                gotDay = true;
        } 
            catch (DayException e) {
                System.out.println(e.getMessage());
            }

        }
        
        // Check Year value input from user is valid
        boolean gotYear = false;

        while(!gotYear){
            try {
                year = readYearNumber();
                gotYear = true;
            } 
            catch (YearException e) {
                System.out.println(e.getMessage());
            }
        }
        
        // Check February value input from user is valid
        if(month == 2) {
            // use boolean variable to loop is input is a bad value
            boolean okFebruaryDate = false;

            while(!okFebruaryDate){
                System.out.println("Checking February date...");
                
                // try to execute method for February
                try{
                    day = checkFebruary(day, year);
                    okFebruaryDate = true;
                }
                
                /**If it is not a leap year, day then it asks user to input
                 another day in the same month and same year that was inputted*/
                catch(DayException e) {
                    System.out.println(e.getMessage());

                    try {
                        day = readDayNumber(month);
                    } 

                    catch (DayException e1) {
                    }
                }
            } // End of February check
        }
        
        // Display results
        System.out.println("The date is " + monthString(month) + " " + day +", " + year);
    
    } // End of Main Method
}

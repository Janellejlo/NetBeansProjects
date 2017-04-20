/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program11;

/**
 *
 * @author janellejlo
 * 
 * Program: To assign passengers seats in the airplane
 *              & display availability of seats
 */
import java.util.*;

public class Airplane {
    
    public static boolean isFilled(char[][] plane){
        /**isFilled using a double for-loop
         *      to access each seat inside the plane
         */
        for (char[] plane1 : plane) {
            for (int j = 0; j < plane.length; j++) {
                if (plane1[j] != 'X') {
                    return false; //If the seat is not occupied (without an X, in the element)
                    // then method will return false,
                }
                // then method will return false,
            }
        }
        return true;//or else it will return true, finishing the loop.
    }
    
    //getRowNumber() to get the row number from the string
    public static int getRowNumber(String seatNumber){
        
        //1st character of String is the character representing a number
        char rowChar =seatNumber.charAt(0);
        
        /**It is converted into its number value by subtracting 48 from it
         * Must obtain index of array,
         * return the value of the row number subtracted by 1*/
        return(int)rowChar - 48 - 1;
    }
    
    //getColNumber to get the column number from string
    public static int getColNumber(String seatNumber){

        //String is the character representing a alphabet from A-D
        char colChar =seatNumber.charAt(1);
        
        //Using switch-case to check which number return
        //Index of column must return, so subtract each of the
        //  column numbers by 1.
        switch (colChar) {
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
            default:
                return -1;
        }
    }
    
    public static void printPlane(char[][]plane){
        
        //for-loop to access each element in the array & prints out
        //length of array plane[0] is the number of columns in the array
        for(int i = 0; i < plane.length; i++){
            //prints out row number
            System.out.print((i + 1) + " ");
            
            for(int j = 0; j < plane[0].length; j++){
                System.out.print(plane[i][j] + " ");
                //print extra space
                if(j == 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    //Main Method
    public static void main(String[] args) {
        
        //Create array of char values to represent the plane and its seats
        
        char[][] plane ={
            {'A', 'B', 'C', 'D'},
            {'A', 'B', 'C', 'D'},
            {'A', 'B', 'C', 'D'},
            {'A', 'B', 'C', 'D'},
            {'A', 'B', 'C', 'D'},
            {'A', 'B', 'C', 'D'},
            {'A', 'B', 'C', 'D'},
        };
        
        //To allow user to make decision
        Scanner scan = new Scanner(System.in);
        String decision ="y";
        
        /**Loop ends if user wants to quit, if the user inputs
                other character other than "y"*/
        while(decision.equals("y") && !isFilled(plane)){
            printPlane(plane);
            System.out.print("Enter a plane seat ti fill: ");
            
            boolean okSeat = false;
            while(okSeat == false){
                String seat = scan.nextLine();
                int r = getRowNumber(seat);
                int c = getColNumber(seat);
                
                //If seat is taken
                if(plane[r][c] == 'X')
                    System.out.print("Sorry, the seat is occupied. Choose a different seat.");
                else{
                    plane[r][c] ='X';
                    okSeat =true;
                }
            }
            
            System.out.print("Do you want to continue filling seat? (y/n)");
            decision = scan.nextLine();
        }
        
        System.out.println("Plane seating chart:");
        printPlane(plane);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program02;

/**
 *
 * @author janellejlo
 */
import java.util.*;
import java.io.*;

public class SearchNumbers {
    
    @SuppressWarnings("null")
    public static void main(String args[]){

        int maxNum,minNum;
        int nextSearch;
        Scanner inputFile = null;
        
        try{
            inputFile = new Scanner(new FileInputStream("src/Program02/numbersFile.txt"));
        }
        
        catch(FileNotFoundException e) {
            System.out.println("Sorry, this file could not not be found.");
        }
        
        maxNum = inputFile.nextInt();
        minNum = maxNum;
        
        while(inputFile.hasNextInt()) {	
            nextSearch= inputFile.nextInt();
            
            if(minNum > nextSearch)
                minNum = nextSearch;

            if(maxNum < nextSearch)
                maxNum = nextSearch;
        }

        System.out.println("Smallest number in the file: " + minNum);
        System.out.println("Largest number in the file: " + maxNum);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program05;

/**
 *
 * @author janellejlo
 * 
 * Program: Create a static method & return the
 *      standard deviation of an array of double values.
 * 
 * Method: Takes parameters of an array of double values
 *       & an int value representing the size of the array.
 */
public class NumberSD/*StandardDeviation*/ {
    
    public static double standardDev(double[] array, int size){
        double average = 0;
        
        /**
         * index for the array.
         * Array size n ranges from 0 to n-1
         */
        for(int index = 0; index <size; index++){
            average += array[index];
        }
        
        average /= size;
        double stdDev =0;
        
        for(int index2 = 0; index2 < size; index2++){
            stdDev +=(array[index2]- average)* (array[index2] - average);
        }
        stdDev = Math.sqrt(stdDev/size);
        return stdDev;
    }
    
    public static void main(String args[]){
        double[] anArray = new double[10];
        
        anArray[0] = 1.4;
        anArray[1] = 1.7;
        anArray[2] = 2.1;
        anArray[3] = 3.1;
        anArray[4] = 1.5;
        anArray[5] = 1.6;
        
        /**
         * Create variable to store size of array
         *    in the array should be the no of elements
         * Using array & size to call standard deviation
         */
        int size = 6;
        System.out.println(standardDev(anArray, size));
    }
    
}
 
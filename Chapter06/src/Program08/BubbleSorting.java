/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program08;

/**
 *
 * @author janellejlo
 * 
 * Program: Creates a class BubbleSort
 *              Similar to SelectionSort
 */

//Implementing sort method within the class bubbleSort
public class BubbleSorting {
    
    //Sort method takes in an array of int values.
    public void sort(int[] array){
        
        //BubbleSort algorithm (1st for-loop)
        for(int outer = array.length -1; outer > 0; outer--){
            
            //To start at beginning of array & begins to swap elements
            //(2nd for-loop)
            for(int inner = 0; inner < outer; inner++){
                if(array[inner]>array[inner + 1]){
                    int temp = array[inner];
                    array[inner] = array[inner +1];
                    array[inner +1] = temp;
                }
            }
            
        }
    }
    
}


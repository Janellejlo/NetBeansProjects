/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program08;

/**
 *
 * @author janellejlo
 */
public class BubbleSortDemo {
    
    public static void main(String[] args) {
        
        //array with random int with unsorted elements
        int[]arr = {3,7,4,8,9,1,3};
        
        //print out the unsorted array
        System.out.println("Unsorted array:");
        
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "");
            System.out.println();
            
            //BubbleSort called to sort
            BubbleSorting sorter = new BubbleSorting();
            sorter.sort(arr);
            
            //print out the sorted array
            System.out.println("Sorted with bubble sort:");
            
        for(int i =0; i < arr.length; i++)
            System.out.print(arr[i] + "");
        
    }
}

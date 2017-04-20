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
public class Integers {
	
    int array[];
	
    public Integers(int size) {
        array=new int[size];
    }
	
    public void setValue(int value, int index) throws Exception {
        if(value<0) {
            throw new Exception("No negative values");
        }	
        array[index]=value;
    }
    
    public int getAvg() {
        int average = 0;
		
        for(int i : array) {
            average+=i;
        }
		
        average=average/array.length;
		
        return average;
    }	
}
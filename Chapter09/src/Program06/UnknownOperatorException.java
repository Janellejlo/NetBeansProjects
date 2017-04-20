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

// Make an Exception type
public class UnknownOperatorException extends Exception{
	
    // definition of UnknownOperatorException constructor
    public UnknownOperatorException(String operator){
        
        // Invoke constructor of it's parent class
        super(operator + " is an unknown operation.");
    } 
}
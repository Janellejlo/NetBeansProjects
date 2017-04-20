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
public class MonthException extends Exception{
    
    // Constructors
    public MonthException(){
        super("Invalid month.");
    }
    
    // Constructors with parameters
    public MonthException(String message){
        super(message);
    }
}
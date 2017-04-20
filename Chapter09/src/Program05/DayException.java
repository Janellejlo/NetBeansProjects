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

public class DayException extends Exception {
    
    // Constructors
    public DayException(){
        super("Invalid day.");
    }
    
    // Constructors with parameters
    public DayException(String message){
        super(message);
    }
}
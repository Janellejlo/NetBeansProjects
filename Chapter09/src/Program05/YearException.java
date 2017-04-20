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
public class YearException extends Exception{
    
    // Constructors
    public YearException(){
        super("Invalid year.");
    }
    
    // Constructors with parameters
    public YearException(String message){
        super(message);
    }
}
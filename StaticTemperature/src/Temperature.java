/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janellejlo
 */
public class Temperature {
    
    //Fahrenheit
    public static double getF (double tem) {
        tem = ((9*tem)/5)+ 32;
        return tem;
    }
            
    //Celcius
    public static double getC (double tem) {
        tem = (5*(tem-32))/9;
        return tem;
    }
}

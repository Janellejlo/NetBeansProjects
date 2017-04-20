/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author janellejlo
 */
import java.text.DecimalFormat;


public class StaticTemp {
    public static void main(String[] args) {
        double C = 29;
        double F = 20;
        DecimalFormat round = new DecimalFormat("0.00");
        
        System.out.println("\n Temperature: ");
        System.out.println(F + " Fahrenheit");
        System.out.println(round.format(Temperature.getC(C)) + " Celcius");
        
           System.out.println("\n Temperature: ");
        System.out.println(C + " Celcius");
        System.out.println(round.format(Temperature.getC(C)) + " Fahrenheit");
        
    }
}

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SportDiving {
    public ArrayList<Double> scores = new ArrayList<Double>();
    
    public double difficulty; //difficultly level
    
    public double getSportDiving(){
        //Sort list, throw largest + smallest scores
        Collections.sort(this.scores);
        this.scores.remove(0); //remove lowest scores
        this.scores.remove(this.scores.size()-1); //remove highest scores
        
        //find the sum of scores
        double sum = 0;
        for(int e = 0; e <this.scores.size(); e++){
            sum += this.scores.get(e);
        }
        
        sum *= difficulty;
        return sum* 0.6;
    }
    
    public static void main(String[] args) {
        
        Scanner keyboard =new Scanner (System.in);
            //To create an object for SportDiving class
            //To input score
        SportDiving dive = new SportDiving();
        double input;
        
        for (int e = 1; e < 8; e++){
            System.out.println("Judge Score " + e + ", please enter your score:");
            input =keyboard.nextDouble();
            
            if (input < 0 || input >10){
                System.out.println("Score invalid. Existing.");
                return;
            }
            else{
                dive.scores.add(input);
                System.out.println("Score Recorded. \n");
            }
        }
        
        System.out.println("Enter the dive's degree of " + "difficulty:");
        System.out.println("Difficulty range from 1.2 being the lowest and 3.8 being the highest.");
        input =keyboard.nextDouble();
        
        if (input < 1.2 || input > 3.8){
            System.out.println("Degree of difficulty invalid.");
            return;
        }
        else{
            dive.difficulty = input;
            System.out.println("Difficulty recorded. \n");
            System.out.println(dive.difficulty);
        }
        System.out.println("\nThe dive's score is:\n");
        System.out.println(dive.getSportDiving());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program04;

/**
 *
 * @author janellejlo
 */
import java.util.*;
import java.io.*;   

public class StandardDev {
    
    static BufferedReader br;
    public static void main(String[] args) throws IOException {

// creating scanner object
    Scanner scanner = new Scanner(System.in);

// reading the file path
    System.out.println("Enter the full file path");
    String input = scanner.nextLine();
    File file = new File(input);
    br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
    String line = " ";
    double avg=0;
    int n=0;
    
    while( (line = br.readLine())!= null ) {

     // converting string to double
        double value = Double.parseDouble(line);
        
     // calculating average
            avg+=value;
            n++;
    }
    
    avg = avg/n;
    System.out.println("The average is "+avg);
    br.close();
    br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

//String line = "";
    double variance=0;
    while( (line = br.readLine())!= null ) {
       double value = Double.parseDouble(line);
       variance += Math.pow((value-avg),2);
    }

    variance = variance/n;
    double deviation=Math.sqrt(variance);
    System.out.println("Standard Deviation is "+deviation);
   }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author janellejlo
 */
public class PrimeNumber {
 
    public static void main(String[] args) {
        
        int n,i=2,j=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum range you want ");
        
        try{
           n=sc.nextInt();
           if(n>0)
           {
               System.out.println("Prime Numbers are : ");
               prime(n);
               System.out.println("");
           }
           else
           {
               System.out.println("Please enter only positive integer ");
           }  
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Please enter only integer ");
        }     
    }
    
    //Function to print prime numbers.........
    
    static void prime(int a)
    {
        int i=2,j=2;
        
        while(a>i)
        {
            //Checking wheather number is prime no. or not.......
            while(true)
            {
                if(i%2==0)
                {
                    break;
                }
 
                if(i%j==0)
                {
                    break;
                }
                else
                {
                    j++;
 
                }
 
            }
                if(j==i)
                       {
                          System.out.print(" "+ i);
                          j=2;
                       }
            i++;
        }
    }   
}
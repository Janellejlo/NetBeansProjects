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

public class DrawShapes
{
  
    //Main().
    public static void main(String[] args)
    {
       
        //Declare a variable for number of iterations.
        int mySize=100;

        //Create an array of Figures
        Figure[] myFig=new Figure[mySize];

        //For loop to iterate.
        for (int idx = 0; idx < myFig.length; idx++)
        {

            //For drawing figures randomly.
            int myRandom=(int)(Math.random()*3+1);
           
            //Switch case.
            switch (myRandom)
            {
               
                //Case 1: Rectangle.
                case 1:
               
                    //Create an object for rectangle with random in the range 0-255.
                    myFig[idx]=new Rectangle("r"+((idx+1)), (int)(Math.random()*255),
                    (int)(Math.random()*255),(int)(Math.random()*255), (int)(Math.random()*255));  
                
                //End of Rectangle case.
                break;
               
                //Case 2: Hexagon.
                case 2:
                    //Create an object for hexagon with random in the range 0-255.
                    myFig[idx]=new Hexagon("h"+((idx+1)),(int)(Math.random()*255),
                    (int)(Math.random()*255),(int)(Math.random()*255), (int)(Math.random()*255));
               
                //End of Hexagon case.
                break;
               
                //Case 3: Circle.
                case 3:
               
                    //Create an object for circle with random in the range 0-255.
                    myFig[idx]=new Circle("c"+((idx+1)), (int)(Math.random()*255),
                    (int)(Math.random()*255),(int)(Math.random()*255));
               
                //End of Circle case.
                break;
            }
        }
       
        //Print the figures.
        for (int inc = 0; inc < myFig.length; inc++)
        {
           
            //Function call to center().
            myFig[inc].center();
           
            //Function call to erase().
            myFig[inc].erase();
           
            //Print the figure using toString().
            System.out.println(myFig[inc].toString());           
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiarray;

/**
 *
 * @author janellejlo
 */
public class MultiArray
{   
    public static void main(String args[])
    {
        
		/* initializing three-dimensional arrays */
        int threeD[][][] = new int[3][4][5];
        int i, j, k;
        
        for(i=0; i<3; i++)
        {
            for(j=0; j<4; j++)
            {
                for(k=0; k<5; k++)
                {
                    threeD[i][j][k] = i * j * k;
                }
            }
        }
        
		/* displaying three-dimensional arrays */
        for(i=0; i<3; i++)
        {
            for(j=0; j<4; j++)
            {
                for(k=0; k<5; k++)
                {
                    System.out.print(threeD[i][j][k] + "   ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
}
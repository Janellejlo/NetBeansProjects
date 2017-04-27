/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.game;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author janellejlo
 */
public class Average extends Game{
    private static Scanner inputfile;
    int lcount;

    public Average() {

        //open file to read
        try {
            System.out.println("Getting File");
            inputfile = new Scanner(new FileInputStream("AList.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        }

        //count lines
        lcount = 0;
        while (inputfile.hasNextLine()) {
            lcount++;
        }
        inputfile.close();
        //close file after reading the last line

        //reopen file to read again from the top
        try {
            System.out.println("Getting File");
            inputfile = new Scanner(new FileInputStream("AList.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        }

        //iterate over each line of file = fill array
        super.Wordlist = new String[lcount][2];
        for (int i = 0; i < lcount; i++) {
            super.Wordlist[i][0] = inputfile.next();
            super.Wordlist[i][1] = inputfile.nextLine();
        }
        inputfile.close();

    }//end of public Easy

}

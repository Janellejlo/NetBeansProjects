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
public class Easy extends Game {

    private static Scanner inputfile;
    int lcount;

    public Easy() {

        //open file to read
        try {
            //System.out.println("Getting File");
            inputfile = new Scanner(new FileInputStream("src/word/game/EList.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found. 1");
        }

        //count lines
        lcount = 0;
        String temp;
        while (inputfile.hasNextLine()) {
            temp = inputfile.nextLine();
            lcount++;
        }
        inputfile.close();
        //close file after reading the last line

        //reopen file to read again from the top
        try {
           // System.out.println("Getting File");
            inputfile = new Scanner(new FileInputStream("src/word/game/EList.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found. 2");
        }

        //iterate over each line of file = fill array
        super.Wordlist = new String[lcount][2];
        for (int i = 0; i < lcount; i++) {
            super.Wordlist[i][0] = inputfile.next();
            //System.out.println("added '" + Wordlist[i][0] + "' to Wordlist[" + i + "][0]");
            super.Wordlist[i][1] = inputfile.nextLine();
            //System.out.println("added '" + Wordlist[i][1] + "' to Wordlist[" + i + "][1]");
        }
        inputfile.close();

    }//end of public Easy

}

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
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class NamesDemo {
    
    private String[] nameBoys = new String[1000], nameGirls = new String[1000];
    private int[] numBoys = new int[1000], numGirls = new int[1000];
    private static final String BOY_PATH = "src/Program01/boynames.txt";
    private static final String GIRL_PATH = "src/Program01/girlnames.txt";

    public void readData(String fName) {
        
        String[] names = new String[1000];
        int[] total = new int[1000];
        
        try {
            String line = null;
            int countNum = 0;
            BufferedReader br = new BufferedReader(new FileReader(fName));
            
            while ((line = br.readLine()) != null) {
                
                String[] data = line.split(" ");
                names[countNum] = data[0].toLowerCase();
                total[countNum] = Integer.parseInt(data[1]);
                
                countNum++;
            }
            
            if (fName == BOY_PATH) {
               
                this.nameBoys = names;
                this.numBoys = total;
            
            } else {
               
                this.nameGirls = names;
                this.numGirls = total;
            
            }
            
            br.close();

        } catch (FileNotFoundException e) {
            
            System.out.println("File not found.");
            e.printStackTrace();
        
        } catch (IOException e) {
            
            System.out.println("An error contains in input file");
            e.printStackTrace();
        
        }
    }

    public void getNameData() {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a boy or girl name: ");
        String name = scn.next();
        name = name.toLowerCase();
        String displayName = name.substring(0, 1).toUpperCase() + name.substring(1);
        
        if (Arrays.asList(this.nameBoys).contains(name)) {
            
            int index = Arrays.asList(this.nameBoys).indexOf(name);
            int occurences = numBoys[index];
            System.out.println(displayName + " is ranked " + (index + 1) + " in popularity " + "among boys with " + occurences + " namings.");
        
        } else
            
            System.out.println(displayName + " is not ranked among the top 1000 boy names.");

            if (Arrays.asList(this.nameGirls).contains(name)) {
                
                int index = Arrays.asList(this.nameGirls).indexOf(name);
                int occurences = numGirls[index];
                System.out.println(displayName + " is ranked " + (index + 1) + " in popularity " + "among girls with " + occurences
					+ " namings.");
            } else
                System.out.println(displayName + " is not ranked among the top 1000 girl names.");
    }

    public static void main(String[] args){
	
        NamesDemo  nd= new NamesDemo();
        
        nd.readData(BOY_PATH);
        nd.readData(GIRL_PATH);
        nd.getNameData();
    }

}
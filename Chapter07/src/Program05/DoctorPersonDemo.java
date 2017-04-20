/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program05;

/**
 *
 * @author janellejlo
 */
public class DoctorPersonDemo {
    
    public static void main(String args[]) {
        System.out.println("Testing the Doctor Class \nCreating Doctor via default constructor ");
        Doctor d1 = new Doctor();

        System.out.println("Printing Doctor's Information.\n");
        d1.writeOutput();

        System.out.println();

        System.out.println("Changing default Doctor's name, specialty, and fee via mutators.");

        d1.setName("Tom Baker");
        d1.setSpecialty("Dentistry");
        d1.setFee(4.95);


        System.out.println("Printing Doctor's Information.\n");
        d1.writeOutput();


        System.out.println();

        System.out.println("Creating Doctor via parameterized constructor");
        Doctor d2 = new Doctor("Albert W. Wiley","Robotics",1987);

        System.out.println("Printing Doctor�s Information.\n");
        d2.writeOutput();

        System.out.println();

        System.out.println("Testing if the two doctors are equal.");
        System.out.println(d1.equals(d2));

        System.out.println("\nDone");

    }

}
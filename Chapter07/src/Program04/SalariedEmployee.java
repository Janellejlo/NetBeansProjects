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
public class SalariedEmployee extends Employee
{
    private double salary; //annual

    public SalariedEmployee( )
    {
        super( );
        salary = 0;
    }

    /**
     Precondition: Neither theName nor theDate are null; 
     theSalary is nonnegative.
    */
    public SalariedEmployee(String theName, Date theDate, double theSalary)
    {
         super(theName, theDate);
         if (theSalary >= 0)
             salary = theSalary;
         else
         {
             System.out.println("Fatal Error: Negative salary.");
             System.exit(0);
         }
    }

    public SalariedEmployee(SalariedEmployee originalObject )
    {
         super(originalObject);
         salary = originalObject.salary;
    }

    public double getSalary( )
    {
        return salary;
    }

    /**
     Returns the pay for the month.
    */
    public double getPay( )
    {
        return salary/12;
    }

    /**
     Precondition: newSalary is nonnegative.
    */
    public void setSalary(double newSalary)
    {
         if (newSalary >= 0)
             salary = newSalary;
         else
         {
             System.out.println("Fatal Error: Negative salary.");
             System.exit(0);
         }
    }

    public String toString( )
    {
        return (getName( ) + " " + getHireDate( ).toString( ) 
                                + "\n$" + salary + " per year");
    }

    public boolean equals(SalariedEmployee other)
    {
        return (getName( ).equals(other.getName( )) 
                && getHireDate( ).equals(other.getHireDate( ))
                && salary == other.salary);
    }
}
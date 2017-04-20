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
import java.util.Scanner;

public class Administrator extends SalariedEmployee{
	
    private String title;
    private String responsibility;
    private String supervisor;
	
    public Administrator(){
        super();
        this.title = "";
        this.responsibility = "";
        this.supervisor = "";
    }
		
    public Administrator(String name, Date date, double salary, 
			String title, String responsibility, String supervisor){
        super(name, date, salary);
        this.title = title;
        this.responsibility = responsibility;
        this.supervisor = supervisor;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
	this.title = title;
    }

    public String getResponsibility(){
        return responsibility;
    }

    public void setResponsibility(String responsibility){
	this.responsibility = responsibility;
    }

    public String getSupervisor(){
	return supervisor;
    }
    
    public void setSupervisor(String supervisor){
	this.supervisor = supervisor;
    }
	
    public void readData(){
        
        Scanner keyboard = new Scanner(System.in);
		
	System.out.print("Enter the name of administrator: ");
	String name = keyboard.nextLine();
		
	System.out.print("Enter the salary of administrator: ");
	double salary = Double.parseDouble(keyboard.nextLine());
		
	System.out.print("Enter valid month of hire date: ");
	int month = Integer.parseInt(keyboard.nextLine());
		
	System.out.print("Enter valid day of hire date: ");
	int day = Integer.parseInt(keyboard.nextLine());
		
	System.out.print("Enter valid year of hire date: ");
	int year = Integer.parseInt(keyboard.nextLine());
		
	setName(name);
	setSalary(salary);
	setHireDate(new Date(month, day, year));
				
	System.out.print("Enter title of administrator: ");		
	title = keyboard.nextLine();
		
	System.out.print("Enter responsibility of administrator: ");
	responsibility = keyboard.nextLine();
		
	System.out.print("Enter supervisor for administrator: ");
	supervisor = keyboard.nextLine();
	System.out.println();
    }
	
    public boolean equals(Administrator other){
	
        return super.equals(other) &&(title.equals(other.title) 
            && responsibility.equals(other.responsibility) 
            && supervisor.equals(other.supervisor)); 
    }
	
    public String toString(){
	return super.toString() + "\n" + title + ", "  
            + responsibility + ", supervised by " + supervisor;
    }	
}
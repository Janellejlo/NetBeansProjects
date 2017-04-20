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
public class Truck extends Vehicle{
	
    private double load;
    public int capacity;
    public Truck(){
		super();
		load = 0;
		capacity = 0;
    }
    
    public Truck(String m, int c, Person p, double loads, int capc){
        super(m, c, p);
        load = loads;
        capacity = capc;
    }	
		

    public Truck(Truck oth){
        super(oth);
        load = oth.load;
        capacity = oth.capacity;
    }
    
    public void setload(double newLoad){
        load = newLoad;
    }
    
    public void setcapacity(int newCaps){
        capacity = newCaps;
    }
    
    public double getload(){
        return load;
    }
    
    public int getcapacity(){
        return capacity;
    }

    public String toString(){
        return super.toString() + ", " + load + " lbs load, " + capacity + " tow";
    }

    public boolean equals(Truck oth){
        return super.equals(oth) && load == oth.load && capacity == oth.capacity;
    }
}

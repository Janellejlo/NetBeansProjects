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
public class Vehicle 
{
	private String mf;
	private int cd;
	private Person own;

	public Vehicle(){
		mf = "none";
		cd = 1;
		own = null;
	}

        public Vehicle(String themf, int numcd, Person theown){
		mf = themf;
		cd = numcd;
		own = new Person(theown);
	}
	
        public Vehicle(Vehicle other){
		mf = other.mf;
		cd = other.cd;
		own = new Person(other.own);
	}
	
        public void setmf(String newmf){
		mf = newmf;
	}
	
        public void setcd(int newNum){
		cd = newNum;
	}
	
        public void setown(Person newown){
		own = new Person(newown);
	}
	
        public String getmf(){
		return mf;
	}
	
        public int getcd(){
		return cd;
	}
	
        public Person getown(){
		return own;
	}
	
        public String toString(){
		return mf + ", " + cd + " cd, owned by " + own;
	}
	
        public boolean equals(Vehicle other){
		return mf.equals(other.mf) && cd == other.cd;
	}
}
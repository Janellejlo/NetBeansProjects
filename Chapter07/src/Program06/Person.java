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
public class Person {
	
    private String name;
    
    public Person(){
        name = "none";
    }

    public Person(String theName){
        name = theName;
    }

    public Person(Person theObject){
        name = theObject.name;
    }

    public String getName(){
        return name;
    }

    public void setName(String theName){
        name = theName;
    }

    public String toString(){
        return name;
    }

    public boolean equals(Object other){
	return name.equals(((Person)other).name);
    }
}
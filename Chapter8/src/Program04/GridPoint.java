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
/**
 * This is a base Class that i use to create the World Array I made the map an
 * array of GridPoints because you can change their toString so that the don't
 * return "null" messing up the formatting of the World
 * 
 */
public class GridPoint {

	protected String type;

	public GridPoint() {
		type = " ";
	}

	public boolean isEmpty() {
		if (type == " ")
			return true;
		return false;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return " " + type;
	}

}
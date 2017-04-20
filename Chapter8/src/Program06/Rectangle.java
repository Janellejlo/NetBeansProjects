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
public class Rectangle extends Figure {
  
    private int length, height;
    public Rectangle() {
        super(0,0,"Nameless");
        setLength(0);
        setHeight(0);
    }

    public Rectangle(String name, int a, int b, int l, int h) {
    super(a,b,name);
        setLength(l);
        setHeight(h);
    }

    public String toString() {
        return "In Rectangle Drawing " + getName() + " centered at (" + getX() +","+ getY() +")"
        + " width "+getLength()+" height "+getHeight();
    }


    public void erase() {
        System.out.println("In Rectangle erasing");
    }

    public void draw() {
        center();
        System.out.println(""+this);
        erase();
    }   


    public void setLength(int l) {length = l;}
    public void setHeight(int h) {height = h;}
    public int getLength() {return length;}
    public int getHeight() {return height;}
}
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
public class Circle extends Figure {

    private int radius;
    public Circle() {
        super(0,0,"Nameless");
        setRadius(0);
    }

    public Circle(String name, int a, int b, int r) {
        super(a,b,name);
        setRadius(r);
    }

    public String toString() {
        return "In Circle Drawing " + getName() + " centered at (" + getX() +","+ getY() +")"
        + " radius "+getRadius();
    }

    public void erase() {
        System.out.println("In Circle erasing");
    }

    public void draw() {
        center();
        System.out.println(""+this);
        erase();
    }

    public void setRadius(int r) {radius = r;}
    public int getRadius() {return radius;}

}


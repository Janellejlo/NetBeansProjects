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
public class FigureDemo {

    public static void main(String[] args) {
        Figure f1 = new Figure(7, 7);
        Figure t1 = new Triangle(5, 5, 5, 10);
        Figure r1 = new Rectangle(15, 15, 5, 10);

        System.out.println("Testing the draw() methods:");
        f1.draw();
        t1.draw();
        r1.draw();
        System.out.println();

        System.out.println("Testing the center() methods:");
        f1.center();
        t1.center();
        r1.center();
        System.out.println();

        System.out.println("Testing the erase() methods:");
        f1.erase();
        t1.erase();
        r1.erase();
    }

}

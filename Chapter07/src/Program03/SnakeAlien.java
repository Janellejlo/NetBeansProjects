/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program03;

/**
 *
 * @author janellejlo
 */
public class SnakeAlien extends Alien{

    // INSTANCE VARIABLE
    private final int SNAKE_DAMAGE = 10;       
  
    // 2-ARG COSNTRUCTOR
    public SnakeAlien(int health, String name){
        super(health, name);
    }

    // TO GET DAMAGE INFLICTED BY ALIEN
    public int getDamage(){
        return SNAKE_DAMAGE;
    }
}
<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatihanPraktikumnomer4;

/**
 *
 * @author ACER
 */
public class pacman {
    int y, x, width, height;
    void moveRight(){
        if (x<width) {
            x += 1;
        } else {
            System.out.println(" PacMan mencapai batas maksimum ");
        }
    }
    void moveLeft(){
        if (x>0) {
            x -= 1;
        } else {
            System.out.println(" PacMan mencapai batas maksimum ");
        }
    }
    void moveUp(){
        if (y>0) {
            y -= 1;
        } else {
            System.out.println(" PacMan mencapai batas maksimum ");
        }
    }
    void moveDown(){
        if (y<height) {
            y -= 1;
        } else {
            System.out.println(" PacMan mencapai batas maksimum ");
        }
    }
    void printPosition(){
        System.out.println("PacMan berada di koordinat : (" + x + ", " + y + ")");
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatihanPraktikumnomer4;

/**
 *
 * @author ACER
 */
public class pacman {
    int y, x, width, height;
    void moveRight(){
        if (x<width) {
            x += 1;
        } else {
            System.out.println(" PacMan mencapai batas maksimum ");
        }
    }
    void moveLeft(){
        if (x>0) {
            x -= 1;
        } else {
            System.out.println(" PacMan mencapai batas maksimum ");
        }
    }
    void moveUp(){
        if (y>0) {
            y -= 1;
        } else {
            System.out.println(" PacMan mencapai batas maksimum ");
        }
    }
    void moveDown(){
        if (y<height) {
            y -= 1;
        } else {
            System.out.println(" PacMan mencapai batas maksimum ");
        }
    }
    void printPosition(){
        System.out.println("PacMan berada di koordinat : (" + x + ", " + y + ")");
    }
}
>>>>>>> 869130b2f0b6cba33d4b81d78625482bb64c493d

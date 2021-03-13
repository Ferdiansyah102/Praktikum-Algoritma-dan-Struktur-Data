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
import java.util.Scanner;
public class pacmanmain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pacman satu = new pacman();
        System.out.println("Masukkan tinggi tempat  : ");
        satu.height = input.nextInt();
        System.out.println("Masukkan Lebar tempat   : ");
        satu.width = input.nextInt();
        System.out.println("Masukkan Koordinat x    : ");
        satu.x = input.nextInt();
        System.out.println("Masukkan Koordinat y    : ");
        satu.y = input.nextInt();
        satu.printPosition();
        System.out.println("");
        System.out.println("Ingin memindahkan PacMan ke    : ");
        for (boolean c = true; c = true;) {
            System.out.println("* (Atas : W) (Bawah : S) (kanan : D) (kiri : A) ");
            char m = input.next().charAt(0);
            if (m =='w' || m == 'W' ) {
                satu.moveUp();
            } else if (m=='s' || m == 'S' ) {
                satu.moveDown();
            } else if (m=='d' || m == 'D' ) {
                satu.moveRight();
            } else if (m=='a' || m == 'A' ) {
                satu.moveLeft();
            } else {
                System.out.println("Input yang anda masukkan tidak valid");
            }
            System.out.println("Ingin memindahkan lagi (Y/T): ");
            char a = input.next().charAt(0);
            if (a == 't' || a == 'T' ) {
                satu.printPosition();
                break;
            } else {
                
            }
        }
            
    }
}

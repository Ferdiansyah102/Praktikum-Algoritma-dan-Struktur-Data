/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jobsheet1;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ani = 4 * 4500;
        int budi = 15 * 4500;
        int budisetelahdiskon = budi * 5 / 100;
        int totalbudi = budi - budisetelahdiskon;
        int bina = 6 * 4500;
        int cita = 11 * 4500;
        int citadiskon = cita * 5 / 100;
        int totalcita = cita - citadiskon;

        int total = totalcita + ani + totalbudi + bina;

        System.out.println("+===============================================+");
        System.out.println("|                Smile Laundry                  |");
        System.out.println("+===============================================+");
        System.out.println("Biyaya Untuk Ani  = " + ani+"                       |");
        System.out.println("Biyaya Untuk Budi = " + totalbudi+"                       |");
        System.out.println("Biyaya Untuk Bina = " + bina+"                       |");
        System.out.println("Biyaya Untuk Cita = " + totalcita+"                       |");
        System.out.println("------------------------------------------------+ ");
        System.out.println("TOTAL : Rp." + total+",-");
    }
}

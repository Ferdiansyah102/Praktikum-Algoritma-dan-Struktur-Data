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
public class No2 {
    public static void main(String[] args) {

        int bulan = 0;
        int tabunganawal = 1000000;
        int tab;

        for (int i = 1; i < 99; i++) {

            if (tabunganawal <= 1500000) {
                tab = tabunganawal * 2 / 100;
                tabunganawal = tabunganawal + tab;
                bulan = i;

                System.out.println("| Bulan ke-" + i + "  || Saldo Saat ini  Rp." + tabunganawal + ",-    ||  Bunga Yang di Dapat =  Rp." + tab + ",-      |");
            }

        }
        System.out.println("\n\nPada Bulan Ke- " + bulan);

    }
}

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
public class No3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan = ");
        int angka = in.nextInt();
        for (int d = 2; d <= angka; d++) {
            if (d%2==0) {
                if (d % 4 == 0) {
                    continue;
                }
                  System.out.print(d + ",");
            }
          
        }
    }
}

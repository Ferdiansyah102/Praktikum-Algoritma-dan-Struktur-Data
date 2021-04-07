/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minggu5;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class mainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        System.out.println("================================================================");
        System.out.println("Program Menghitung Keuntungan Toatal (satuan Juta. Miasl 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int jml = sc.nextInt();
        for (int a = 0; a < jml; a++){
            System.out.print("Masukkan jumlah bulan : ");
            int elm = sc.nextInt();
            Sum sm = new Sum(elm);
        
        System.out.println("================================================================");
        for (int i = 0; i < sm.elemen; i++){
            System.out.print("Masukkan untung bulan ke- "+(i+1)+" = ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        
        System.out.println("================================================================");
        System.out.println("Algorintma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah "+sm.totalBF(sm.keuntungan));
        System.out.println("Algoritma Devide Conquer");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
        }
        
    }
}

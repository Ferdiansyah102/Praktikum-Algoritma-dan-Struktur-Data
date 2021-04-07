/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatihanPraktikum;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class mainNilaiAlgoritma {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jm = sc.nextInt();
        NilaiAlgoritma[] nas = new NilaiAlgoritma[jm];
        System.out.println("================================================================");
        
        for (int i = 0; i < nas.length; i++){
            System.out.println("Mahasiswa ke- "+(i+1));
            System.out.print("Masukkan Nama        : ");
            String a = sc.next();
            System.out.print("Masukkan Nilai Tugas : ");
            int b = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis  : ");
            int c = sc.nextInt();
            System.out.print("Masukkan Nilai UTS   : "); 
            int d = sc.nextInt();
            System.out.print("Masukkan Nilai UAS   : ");
            int e = sc.nextInt();
            nas[i] = new NilaiAlgoritma(a, b, c, d, e);
        }
        
        System.out.println("================================================================");
        double d = 0;
        double tn[] = new double[jm];
        for (int i = 0; i < nas.length; i++){
            System.out.println("Nilai Mahasiwa ke "+(i+1));
            System.out.println("Nama  : "+nas[i].namaMhs);
            System.out.println("Total : "+nas[i].hitungTotalNilai());
            tn[i] = nas[i].hitungTotalNilai();
            d = nas[i].rataNilai(tn);
        }
        System.out.println("================================================================");
        System.out.println("Rata - rata seluruh Mahasiswa : "+d);
        System.out.println("================================================================");
    }
}

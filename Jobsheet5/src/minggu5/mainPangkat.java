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
public class mainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
//        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
//        int elemen = sc.nextInt();
//        Pangkat[] png = new Pangkat[elemen];
        pangkat[] png = new pangkat[3];
        png[0] = new pangkat(5, 2);
        png[1] = new pangkat(12, 2);
        png[2] = new pangkat(9, 2);
        
        System.out.println("Pilih Metode\n1.Brute Force\n2.Devide Conquer");
        System.out.print("Masukkan pilihan : ");
        int p = sc.nextInt();
        if(p==1){
            System.out.println("=================================================");
            System.out.println("Hasil Pangkat dengan Brute Force ");
            for (int i = 0; i < 3; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }
        } else if(p==2){
            System.out.println("=================================================");
            System.out.println("Hasil Pangkat dengan Devide Conquer");
            for (int i = 0; i < 3; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
        } else {
            System.out.println("Pilihan Anda Salah");
        }
         
        
//        for (int i = 0; i < elemen; i++){
//            png[i] = new Pangkat();
//            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
//            png[i].nilai = sc.nextInt();
//            System.out.print("Masukkan nilai pemangkatan ke-"+(i+1)+" : ");
//            png[i].pangkat = sc.nextInt();
//        }
//        
//        System.out.println("=================================================");
//        System.out.println("Hasil Pangkat dengan Brute Force ");
//        for (int i = 0; i < elemen; i++){
//            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
//        }
//        
//        System.out.println("=================================================");
//        System.out.println("Hasil Pangkat dengan Devide Conquer");
//        for (int i = 0; i < elemen; i++){
//            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
//        }
    }
}

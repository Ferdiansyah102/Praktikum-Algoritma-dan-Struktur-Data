/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minggu5;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class mainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.print("Masukkan jumlah elemen yang akan dihitung : ");
        int elemen = sc.nextInt();
        Faktorial[] fk = new Faktorial[elemen];
        
        for (int i = 0; i < elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }
        
        long startBF = System.currentTimeMillis();
        System.out.println("=================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah "+fk[i].faktorialBF(fk[i].nilai));
        }
        long endBF = System.currentTimeMillis();
        long timeBF = endBF - startBF;
        System.out.println("Waktu eksekusi Brute Force "+timeBF);
        
        long startDC = System.currentTimeMillis();
        System.out.println("=================================================");
        System.out.println("Hasil Faktorial dengan Devide Conquer");
        for (int i = 0; i < elemen;i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah "+fk[i].faktorialDC(fk[i].nilai));
        }
        long endDC = System.currentTimeMillis();
        long timeDC = endDC - startDC;
        System.out.println("Waktu eksekusi Devide Conquer "+timeDC);
    }
}

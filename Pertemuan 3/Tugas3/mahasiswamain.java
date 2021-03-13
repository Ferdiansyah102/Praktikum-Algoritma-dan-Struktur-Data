/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas3;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class mahasiswamain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n =sc.nextInt();
        mahasiswa[] arraymhs = new mahasiswa[n];
        System.out.println("========Lengkapi Biodata========");
        for(int i = 0; i < n; i++){
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.print("Masukkan Nama : ");
            String nama = sc.next();
            System.out.print("Masukkan NIM  : ");
            String nomor_induk_mahasiswa = sc.next();
            System.out.print("Masukkan Jenis Kelamin   : ");
            char jenis_kelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK  : ");
            double indeks_prestasi_kumulatif = sc.nextDouble();
            arraymhs[i] = new mahasiswa(nama, nomor_induk_mahasiswa, jenis_kelamin, indeks_prestasi_kumulatif);
        }
        System.out.println("====================");
        System.out.println("========Data Mahasiswa========");
        for(int i=0;i<n;i++){
            System.out.println("Data Mahasiswa ke " + (i + 1));
            arraymhs[i].tampil();
        }
        System.out.println("====================");
        double total= 0;
        for (int i = 0; i<n; i++){
            total =+ arraymhs[i].indeks_prestasi_kumulatif;
        }
        System.out.println("IPK Rata-Rata Seluruh Mahasiswa :  " + arraymhs[0].rerata(total, n));
    }
}

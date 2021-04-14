/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package No1_2;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class mainmahasiswa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        pencarianMhs data = new pencarianMhs();
        int jumMhs = 5;
        
        System.out.println("============================");
        System.out.println("MASUKKAN DATA MAHASISSWA SECARA URUT dari NIM TERKECIL");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("============================");
            System.out.print("NIM \t  = ");
            int nim = s.nextInt();
            System.out.print("NAMA \t  = ");
            String nama = s1.nextLine();
            System.out.print("UMUR \t  = ");
            int umur = s.nextInt();
            System.out.print("IPK \t  = ");
            double ipk = s.nextDouble();
            
            mahasiswa m = new mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
            
            System.out.println("============================");
            System.out.println("DATA KESELURUHAN MAHASISWA  = ");
            data.tampil();
            System.out.println("============================");
            System.out.println("===PENCARIAN DATA===");
            System.out.println("============================");
            System.out.println("Masukkan Nim Mahasiswa yang dicari");
            System.out.print("NIM     : ");
            int cari = s.nextInt();
            System.out.println("MENGGUNAKAN SEQUANTIAL SEARCH Sequantial Search");
            int posisi = data.FindSeqSearch(cari);
            
            data.TampilPosisi(cari, posisi);
            data.TampilData(cari, posisi);
        }
}

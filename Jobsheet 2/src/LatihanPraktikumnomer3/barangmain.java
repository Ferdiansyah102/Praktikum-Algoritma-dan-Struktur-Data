/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatihanPraktikumnomer3;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class barangmain {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        barang satu = new barang();
        System.out.println("Masukkan Nama Barang    : " );
        satu.nama = input.nextLine();
        System.out.println("Masukkan Harga Barang   : " );
        satu.hargaSatuan = input.nextInt();
        System.out.println("Masukkan Jumlah Barang  : " );
        satu.jumlah = input.nextInt();
        System.out.println("Harga Total             : " + satu.hitungHargaTotal());
        System.out.println("Harga Bayar             : " + satu.hitungHargaBayar());
    }    
}

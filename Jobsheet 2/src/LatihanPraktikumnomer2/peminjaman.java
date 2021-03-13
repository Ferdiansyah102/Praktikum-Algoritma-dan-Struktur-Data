/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatihanPraktikumnomer2;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class peminjaman {
    int lama_sewa, harga=30000;
    String id, nama_member, nama_game;
    int totalBiaya(int l, int h) {
        return l * h;
    }
    
    void tampil() {
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println(" ID             : " + id);
        System.out.println(" Nama Member    : " + nama_member);
        System.out.println(" Nama Game      : " + nama_game);
        System.out.println(" Lama Sewa      : " + lama_sewa + " Hari");
        System.out.println(" Harga per hari : Rp" + harga);
        System.out.println(" Harga total    : Rp" + totalBiaya(lama_sewa, harga));
        System.out.println("---------------------------------------");
    }
}

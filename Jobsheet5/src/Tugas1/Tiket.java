/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas1;

/**
 *
 * @author ACER
 */
public class Tiket {
    String maskapai, asal, tujuan;
    int harga;
    
    public Tiket(String m , int h, String a, String t){
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }
   
    void tampil(){
    System.out.println("Maskapai : "+maskapai);
    System.out.println("asal: " +asal);
    System.out.println("tujuan : " +tujuan);
    System.out.println("harga : "+harga);
    }
}

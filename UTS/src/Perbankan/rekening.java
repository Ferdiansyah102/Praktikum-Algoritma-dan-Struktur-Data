/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Perbankan;

/**
 *
 * @author ACER
 */
public class rekening {
    String noRekening, namaDepan, namaBelakang, phone, email;
    public rekening(String a, String b, String c,String d, String e){
        noRekening = a ;
        namaDepan = b;
        namaBelakang = c;
        phone = d;
        email = e;
    }
    
    void tampil(){
        System.out.println("No. Rekening : " + noRekening);
        System.out.println("Nama Depan: " + namaDepan);
        System.out.println("Nama Belakang : " +namaBelakang);
        System.out.println("Phone : " + phone);
        System.out.println("Email : " + email);
    }
}

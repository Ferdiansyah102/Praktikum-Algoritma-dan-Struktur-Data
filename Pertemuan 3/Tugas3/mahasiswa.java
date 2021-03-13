<<<<<<< HEAD
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
public class mahasiswa {
    String nama;
    String nomor_induk_mahasiswa;
    char jenis_kelamin;
    double indeks_prestasi_kumulatif;
    
    public mahasiswa(String na, String nim, char jk, double ipk){
       nama = na; 
       nomor_induk_mahasiswa = nim;
       jenis_kelamin = jk;
       indeks_prestasi_kumulatif = ipk;
    }
    public void tampil(){
        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + nomor_induk_mahasiswa);
        System.out.println("Jenis Kelamin   : " + jenis_kelamin);
        System.out.println("IPK             : " + indeks_prestasi_kumulatif);
    }
    double rerata(double ipk, int jml){
        return ipk/jml;
    }
}
=======
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
public class mahasiswa {
    String nama;
    String nomor_induk_mahasiswa;
    char jenis_kelamin;
    double indeks_prestasi_kumulatif;
    
    public mahasiswa(String na, String nim, char jk, double ipk){
       nama = na; 
       nomor_induk_mahasiswa = nim;
       jenis_kelamin = jk;
       indeks_prestasi_kumulatif = ipk;
    }
    public void tampil(){
        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + nomor_induk_mahasiswa);
        System.out.println("Jenis Kelamin   : " + jenis_kelamin);
        System.out.println("IPK             : " + indeks_prestasi_kumulatif);
    }
    double rerata(double ipk, int jml){
        return ipk/jml;
    }
}
>>>>>>> 869130b2f0b6cba33d4b81d78625482bb64c493d

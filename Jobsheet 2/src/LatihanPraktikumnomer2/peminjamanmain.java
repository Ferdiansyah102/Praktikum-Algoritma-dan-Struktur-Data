<<<<<<< HEAD
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
public class peminjamanmain {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        peminjaman satu = new peminjaman();
        System.out.print("Masukkan ID        : " );
        satu.id = input.nextLine();
        System.out.print("Masukkan Nama      : " );
        satu.nama_member = input.nextLine();
        System.out.print("Masukkan Nama Game : " );
        satu.nama_game = input.nextLine();
        System.out.print("Masukkan Lama sewa :.... Hari " );
        satu.lama_sewa = input.nextInt();
        satu.tampil();
    }    
}
=======
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
public class peminjamanmain {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        peminjaman satu = new peminjaman();
        System.out.print("Masukkan ID        : " );
        satu.id = input.nextLine();
        System.out.print("Masukkan Nama      : " );
        satu.nama_member = input.nextLine();
        System.out.print("Masukkan Nama Game : " );
        satu.nama_game = input.nextLine();
        System.out.print("Masukkan Lama sewa :.... Hari " );
        satu.lama_sewa = input.nextInt();
        satu.tampil();
    }    
}
>>>>>>> 869130b2f0b6cba33d4b81d78625482bb64c493d

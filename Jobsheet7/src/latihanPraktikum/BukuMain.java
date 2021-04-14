/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihanPraktikum;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class BukuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Buku st = new Buku(8);
        char pilih;
        do {
            System.out.print("Judul : ");
            String judul = sc.nextLine();
            System.out.print("Nama Pengarang: ");
            String nama = sc.nextLine();
            System.out.print("Tahun Terbit : ");
            int tahun = sc.nextInt();
            System.out.print("Jumlah Halaman: ");
            int jml = sc.nextInt();
            System.out.print("Harga : ");
            int hrg = sc.nextInt();Buku bk = new Buku(judul, nama, tahun, jml, hrg);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            st.push(bk);
        } while (pilih == 'y');
            st.print();
            st.pop();
            st.peek();
            st.print();
    }
}

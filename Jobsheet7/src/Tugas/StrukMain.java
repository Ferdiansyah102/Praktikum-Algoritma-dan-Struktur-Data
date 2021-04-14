/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class StrukMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Struk st = new Struk(8);
        char s;
        do {
            System.out.print("No Transaksi : ");
            int no = sc.nextInt();
            System.out.print("Tanggal Beli : ");
            int tgl = sc.nextInt();
            System.out.print("Jumlah Barang: ");
            int jml = sc.nextInt();
            System.out.print("Total Barang : ");
            int tot = sc.nextInt();
            System.out.println("-------------------------------------------------");
            Struk sk = new Struk(no, tgl, jml, tot);
            System.out.print("Apakah Anda akan menambahkan struk baru (y/n)? ");
            s = sc.next().charAt(0);
            sc.nextLine();
            st.push(sk);
        } while (s == 'y');
            System.out.println("-------------------------------------------------");
            System.out.print("Jumlah struk yang dikeluarkan: ");
            int n = sc.nextInt();
            System.out.println("-------------------------------------------------");
            for (int i = 0; i < n; i++) {
                st.pop();
            }
            System.out.println("-------------------------------------------------");
    }
}

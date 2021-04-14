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
public class Struk {
    int noTransaksi, tglBeli, jmlBarang, totHrg;
    int size;
    int top;
    Struk data[];
    Struk(int nt, int tgl, int jml, int tot) {
        noTransaksi = nt;
        tglBeli = tgl;
        jmlBarang = jml;
        totHrg = tot;
    }
    public Struk(int size) {
        this.size = size;
        data = new Struk[size];
        top = -1;
    }
    public void push(Struk st) {
        top++;
        data[top] = st;
    }
    public void pop() {
        Struk x = data[top];
        top--;
        System.out.println("Struk yang keluar: ");
        System.out.println("-----------------------------");
        System.out.println("No Transaksi : " + x.noTransaksi);
        System.out.println("Tanggal Beli : " + x.tglBeli);
        System.out.println("Jumlah Barang: " + x.jmlBarang);
        System.out.println("Total Barang : " + x.totHrg);
    }
}

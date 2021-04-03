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
public class transaksi {
    double saldo, saldoAwal, saldoAkhir;
    String tanggalTransaksi, type;
    void transaksi(double a, double b, double c, String d,String e){
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi = d;
        type = e;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatihanPraktikum;

/**
 *
 * @author ACER
 */
public class NilaiAlgoritma {
    public String namaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;

    public NilaiAlgoritma(String a, int b, int c, int d, int e) {
        this.namaMhs = a;
        this.nilaiTugas = b;
        this.nilaiKuis =c;
        this.nilaiUTS = d;
        this.nilaiUAS = e;
    }
    
    double hitungTotalNilai(){
        double anil = nilaiTugas * 30/100;
        double bnil = nilaiKuis * 20/100;
        double cnil = nilaiUTS * 20/100;
        double dnil = nilaiUAS * 30/100;
        return anil+bnil+cnil+dnil;
    }
    
    double rataNilai(double arr[]){
        double total = 0;
        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return total/arr.length;
    }
}

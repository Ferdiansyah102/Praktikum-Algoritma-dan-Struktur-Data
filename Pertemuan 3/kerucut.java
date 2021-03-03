/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class kerucut {
    double jari,tinggi,sisi;
    public kerucut(double r, double t, double s){
        jari = r;
        tinggi = t;
        sisi = s;
    }
    double luasPermukaanKr(){
        double luas = 3.14*jari*(jari+sisi);
        return luas;
    }
    double volumeKerucut(){
        double volume = 1/3*3.14*jari*jari*tinggi;
        return volume;
    }
}

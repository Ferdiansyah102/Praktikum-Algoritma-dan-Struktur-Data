/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class tabung {
    double jari,tinggi;
    public tabung(double r, double t){
        jari = r;
        tinggi = t;
    }
    double luasPermukaanTb(){  
        double luas = 2*3.14*(jari + tinggi);
        return luas;
    }
    double volumeTabung(){
        double volume = 3.14*jari*tinggi;
        return volume;
    }
}

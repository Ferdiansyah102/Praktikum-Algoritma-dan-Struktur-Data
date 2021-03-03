/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas2;

/**
 *
 * @author ACER
 */
public class tanah {
    int panjang = 0;
    int lebar = 0;
    
    public tanah(int p, int l){
        panjang = p;
        lebar = l;
    }
    double hitungLuas() {
        return (double) panjang * lebar;
    }
}

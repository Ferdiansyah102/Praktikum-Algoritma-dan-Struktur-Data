/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertanyaan;

/**
 *
 * @author ACER
 */
public class segitiga {
    int alas;
    int tinggi;
    segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }
    int hitungLuas() {
        return alas * tinggi / 2;
    }
    int hitungKeliling() {
        return alas * 3;
    }
}

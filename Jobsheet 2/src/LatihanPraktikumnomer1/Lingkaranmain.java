/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatihanPraktikumnomer1;

/**
 *
 * @author ACER
 */
public class Lingkaranmain {
    public static void main(String[] args) {
        Lingkaran satu = new Lingkaran();
        satu.phi=3.14;
        satu.r= 10;
        double keliling = satu.hitungKeliling();
        System.out.println("Keliling Lingkaran : " + keliling);
        double luas = satu.hitungLuas();
        System.out.println("Luas Lingkaran : " + luas);
    }
}

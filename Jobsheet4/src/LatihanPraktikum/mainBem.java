/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatihanPraktikum;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class mainBem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bem ab = new Bem();
        Bem[] h = new Bem[ab.jmlCalon];
        
        for(int i = 0; i < ab.jmlCalon; i++){
            h[i] = new Bem();
            System.out.print("Nama Calon ke-"+ (i+1)+" : ");
            h[i].calon = sc.nextLine();
        }
        for (int i = 0;i<ab.jmlCalon; i++){
            System.out.print("Jumlah suara calon ke -"+(i+1)+" : ");
            h[i].pilihan = sc.nextInt();
            ab.jmlSuara += h[i].pilihan;
        }
        int hasil = ab.hitung(ab.jmlSuara, h[0].pilihan, h[1].pilihan,h[2].pilihan,h[3].pilihan);
        if(hasil == 0){
            System.out.println("Calon Ketua BEM mempunyai masing - masing suara yang hampir sama");
        }
        else{
            System.out.println("Ketua Bem tahun 2020 yang telah terpilih adalah "+ h[hasil-1].calon);
        }
    }
}

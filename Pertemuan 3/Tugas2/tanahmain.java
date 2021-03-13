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
import java.util.Scanner;
public class tanahmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        tanah[] tnhArray;
        double tanahLuasTerbesar = 0;

        System.out.print("Masukkan banyak tanah : ");
        int n = sc.nextInt(); 
        tnhArray = new tanah[n];
        
        for(int i = 0; i < tnhArray.length; i++){
            tnhArray[i] = new tanah(0,0);
            System.out.println("Tanah ke - " + (i + 1));
            System.out.print("Panjang : ");
            tnhArray[i].panjang = sc.nextInt(); sc.nextLine();
            System.out.print("Lebar   : ");
            tnhArray[i].lebar = sc.nextInt(); sc.nextLine();
            double tmpLuas = tnhArray[i].hitungLuas();
            System.out.println("Luas tanah " + tmpLuas + " m2");
            System.out.println();
            if (tmpLuas > tanahLuasTerbesar) tanahLuasTerbesar = tmpLuas;
        }
        System.out.println("Tanah terluas " + tanahLuasTerbesar + " m2");
    }   
}

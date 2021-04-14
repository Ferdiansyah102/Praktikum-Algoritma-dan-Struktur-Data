/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kt = sc.nextLine();
        Stack dt = new Stack(kt.length());
        dt.print(kt);
        System.out.println();
    }
}

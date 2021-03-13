/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class arrayOfObject {
    public static void main(String[] args){
       // kerucut
        kerucut[] krArray = new kerucut[2];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<2;i++){
            System.out.println("Kerucut ke-" + (i+1));
            System.out.print("Masukkan jari-jari : ");
            double r=sc.nextDouble();
            System.out.print("Masukkan sisi : ");
            double s=sc.nextDouble();
            System.out.print("Masukkan tinggi : ");
            double t=sc.nextDouble();
            krArray[i] = new kerucut(r, s, t);
        }
        for(int i = 0;i<2;i++){
            System.out.println("Kerucut ke-" + (i+1));
            System.out.println("Luas Permukaan : " + krArray[i].luasPermukaanKr());
            System.out.println("Volume Kerucut : " + krArray[i].volumeKerucut());
        }
        //kubus
        kubus[] kbArray = new kubus[2];
        Scanner in = new Scanner(System.in);
        for(int a = 0;a<2;a++){
            System.out.println("kubus ke-" + (a+1));
            System.out.print("Masukkan sisi : ");
            int s = in.nextInt();
            kbArray[a] = new kubus(s);
        }
        for(int a = 0;a<2;a++){
            System.out.println("Kubus ke-" + a);
            System.out.println("Luas Permukaan : " + kbArray[a].luasPermukaanKb());
            System.out.println("Volume Kubus : " + kbArray[a].volumeKubus());
        }
        //Tabung
        tabung[] tbArray = new tabung[2];
        Scanner za = new Scanner(System.in);
        for(int b = 0 ; b<2;b++){
            System.out.println("tabung ke-" + (b+1));
            System.out.print("Masukkan jari-jari : ");
            double r=za.nextDouble();
            System.out.print("Masukkan tinggi : ");
            double t=za.nextDouble();
            tbArray[b] = new tabung(r,t);
        }
        for(int b = 0;b<2;b++){
            System.out.println("Tabung ke-" + b);
            System.out.println("Luas Permukaan : " + tbArray[b].luasPermukaanTb());
            System.out.println("Volume Kubus : " + tbArray[b].volumeTabung());
        }
    }
}

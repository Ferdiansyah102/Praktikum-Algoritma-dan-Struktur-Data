/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package No3;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class mainAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        search a = new search();
        angka b = new angka();
        
        int ang;
        for (int i = 0; i < a.list.length; i++){
            for (int j = 0; j< a.list[0].length;j++ ){
                System.out.print("Masukkan nilai baris " + (i+1)+ ", kolom " + (j+1) + " :" );
                ang = input.nextInt();
                angka mo = new angka(ang);
                a.list[i][j] = mo ;
            }
        }
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int cari = input.nextInt();
        a.FindSeqSearch(cari);
        System.out.println("-----------------------------------");
    }    
}

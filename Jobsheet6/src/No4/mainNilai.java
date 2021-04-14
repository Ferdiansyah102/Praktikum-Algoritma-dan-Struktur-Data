/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package No4;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class mainNilai {
    public static void main(String[] args) {
        searchNilai a = new searchNilai();
        nilai n1 = new nilai(12);
        nilai n2 = new nilai(17);
        nilai n3 = new nilai(2);
        nilai n4 = new nilai(1);
        nilai n5 = new nilai(70);
        nilai n6 = new nilai(50);
        nilai n7 = new nilai(90);
        nilai n8 = new nilai(17);
        nilai n9 = new nilai(2);
        nilai n10 = new nilai(90);
        
        a.tambah(n1);
        a.tambah(n2);
        a.tambah(n3);
        a.tambah(n4);
        a.tambah(n5);
        a.tambah(n6);
        a.tambah(n7);
        a.tambah(n8);
        a.tambah(n9);
        a.tambah(n10);
        
        System.out.println("================================");
        System.out.println("Data sebelum Sorting : ");
        a.tampilAll();
        System.out.println("");
        a.selectionSort();
        System.out.println("Data sesudah Sorting : ");
        a.tampilAll();
        a.FindBinarySearch(a.SearchBiggest(), 0, a.list.length-1);
        
        
    }
}

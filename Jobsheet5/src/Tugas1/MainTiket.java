/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas1;

/**
 *
 * @author ACER
 */
public class MainTiket {
    public static void main(String[] args) {
        TiketService pswt = new TiketService();
        Tiket a1 = new Tiket("Lion Air", 500000, "Jakarta", "Kalimantan");
        Tiket a2 = new Tiket("Garuda", 1000000, "Jakarta" , "Surabaya");
        Tiket a3 = new Tiket("Adam Air", 200000, " Jakarta", "Bali");
        Tiket a4 = new Tiket("Batik Air" , 350000, " Surabaya", "Jakarta" );
       
        pswt.tambah(a1);
        pswt.tambah(a2);
        pswt.tambah(a3);
        pswt.tambah(a4);
        
        System.out.println("Data tiket sebelum bubble sort dan selection sort : ");
        pswt.tampilAll();
        
        System.out.println("-------------------------");
        System.out.println("Data bubble sort");
        pswt.bubleSort(true);
        pswt.tampilAll();
        
        System.out.println("-------------------------");
        System.out.println("Data bubble sort");
        pswt.bubleSort(false);
        pswt.tampilAll();
        
        System.out.println("-------------------------");
        System.out.println("Data selection sort");
        pswt.selectionSort(true);
        pswt.tampilAll();
        
        System.out.println("-------------------------");
        System.out.println("Data selection sort");
        pswt.selectionSort(false);
        pswt.tampilAll();
        System.out.println("-------------------------");
    }           
}

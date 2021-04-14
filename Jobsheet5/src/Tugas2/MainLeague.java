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
public class MainLeague {
    public static void main(String[] args) {
        PremierLeagueService list = new PremierLeagueService();
        PremierLeague L1 = new PremierLeague("Liverpool", 29, 45, 82);
        PremierLeague L2 = new PremierLeague("Manchester City", 27, 39, 57);
        PremierLeague L3 = new PremierLeague("Leicester city", 28, 26, 60);
        PremierLeague L4 = new PremierLeague("Chelsea", 29, 9, 48);
        PremierLeague L5 = new PremierLeague("Wolverhampton Wanderers", 29, 7, 43);
        PremierLeague L6 = new PremierLeague("Sheffield United", 28, 5, 43);
        PremierLeague L7 = new PremierLeague("Manchester United", 28, 12, 42);
        PremierLeague L8 = new PremierLeague("Tottenham Hotspur", 29, 4, 41);
        PremierLeague L9 = new PremierLeague("Arsenal", 28, 4, 40);
        PremierLeague L10 = new PremierLeague("Burnley", 29, -6, 39);
        PremierLeague L11 = new PremierLeague("Crystal Palace", 29, -6, 39);
        PremierLeague L12 = new PremierLeague("Everton", 29, -6, 37);
        PremierLeague L13 = new PremierLeague("Newcastle united", 29, -16, 35);
        PremierLeague L14 = new PremierLeague("Southampton", 29, -17, 34);
        PremierLeague L15 = new PremierLeague("Brighton & Hove Albion", 29, -8, 29);
        PremierLeague L16 = new PremierLeague("West Ham United", 29, -15, 27);
        PremierLeague L17 = new PremierLeague("Watford", 29, -17, 27);
        PremierLeague L18 = new PremierLeague("AFC Bournemouth", 29, -18, 27);
        PremierLeague L19 = new PremierLeague("Aston Villa", 27, -18, 25);
        PremierLeague L20 = new PremierLeague("Norwich City", 29, -27, 21);
        
        list.tambah(L1);
        list.tambah(L2);
        list.tambah(L3);
        list.tambah(L4);
        list.tambah(L5);
        list.tambah(L6);
        list.tambah(L7);
        list.tambah(L8);
        list.tambah(L9);
        list.tambah(L10);
        list.tambah(L11);
        list.tambah(L12);
        list.tambah(L13);
        list.tambah(L14);
        list.tambah(L15);
        list.tambah(L16);
        list.tambah(L17);
        list.tambah(L18);
        list.tambah(L19);
        list.tambah(L20);
        
        System.out.println("==========================================");
        System.out.println("Data Premier League sebelum sorting : ");
        System.out.println("==========================================");
        list.tampilAll();
          
        System.out.println("==========================================");
        System.out.println("Data Premier League setelah sorting asc berdasarkan points ");
        System.out.println("==========================================");
        list.insertionSort(true);
        list.tampilAll();
        
        System.out.println("==========================================");
        System.out.println("Data Premier League setelah sorting dsc berdasarkan points ");
        System.out.println("==========================================");
        list.insertionSort(false);
        list.tampilAll();
        
    }
}

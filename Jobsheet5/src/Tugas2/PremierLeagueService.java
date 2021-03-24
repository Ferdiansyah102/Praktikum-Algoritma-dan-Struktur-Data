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
public class PremierLeagueService {
    PremierLeague listLgi[] = new PremierLeague[20];
    int idx;
    public void tambah(PremierLeague L){
        if(idx<listLgi.length){
            listLgi[idx]=L;
            idx++;
        }else{
            System.out.println("Full!!");
        }
    }
    public void tampilAll(){
       for(PremierLeague L : listLgi){
           L.tampil();
           System.out.println("------------------");
       }
    }
    public void insertionSort(boolean asc){
        for(int i = 1;i<listLgi.length; i++){
            PremierLeague temp = listLgi[i];
            int j = i;
            while(j > 0 && listLgi[j - 1].points > temp.points){
                listLgi[j] = listLgi[j-1];
                j--;
            }
            listLgi[j] = temp;
        }
        for(int i = 1;i<listLgi.length;i++){
            PremierLeague temp = listLgi[i];
            int j = i;
            if(asc){
                
            }else{
               
            }
            listLgi[j] = temp;
        }
    }
}

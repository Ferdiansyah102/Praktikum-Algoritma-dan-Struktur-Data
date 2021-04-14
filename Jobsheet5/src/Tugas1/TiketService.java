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
public class TiketService {
    Tiket pswt[]=new Tiket[4];
        int idx;
        
        
        void tambah(Tiket t){
            if (idx<pswt.length) {
            pswt[idx] =t;
            idx++;
        } else {
            System.out.println("DATA SUDAH PENUH");
        }
        }
        
        void tampilAll(){
            for (Tiket t : pswt) {
            t.tampil();
        }
        }
        
        void bubleSort(boolean bool){
        for(int i=0;i<pswt.length;i++){
            for(int j=1;j<pswt.length-i;j++){
                if(bool == false){
                    if(pswt[j].harga > pswt[j-1].harga){
                        Tiket temp = pswt[j];
                        pswt[j] = pswt[j-1];
                        pswt[j-1] = temp;
                    }
                }else{
                    if(pswt[j].harga < pswt[j-1].harga){
                        Tiket temp = pswt[j];
                        pswt[j] = pswt[j-1];
                        pswt[j-1] = temp;
                    }
                }
            }
        }
    }
    
    void selectionSort(boolean asc){
        for(int i=0;i<pswt.length-1;i++){
            int idx = i;
            for(int j=i+1;j<pswt.length;j++){
                if(asc == false){
                    if(pswt[j].harga > pswt[idx].harga){
                        idx = j;
                    }
                }else{
                    if(pswt[j].harga < pswt[idx].harga){
                        idx = j;
                    }
                }
            }
            Tiket temp = pswt[idx];
            pswt[idx] = pswt[i];
            pswt[i] = temp;
        }
}
}

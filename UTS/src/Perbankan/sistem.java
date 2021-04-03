/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Perbankan;

/**
 *
 * @author ACER
 */
public class sistem {
    rekening rk[]=new rekening[14];
    transaksi trs[]=new transaksi[14];
    int idx;   
    void tambah(rekening r){
             if (idx<rk.length) {
            rk[idx] =r;
            idx++;
        } else {
            System.out.println("DATA SUDAH PENUH");
        }
        }
    void tambah(transaksi r){
        if(idx<trs.length){
            trs[idx] = r;
            idx++;
        }
    }
        void tampilAll(){
            for (rekening r : rk) {
                r.tampil();
            }
        }
    void selectionSort(){
        for (int i=0;i<rk.length-1;i++){
            int idxmin =i;
            for(int j=i+1; j<rk.length-1; j++){
                if(trs[j].saldoAkhir < trs[idxmin].saldoAkhir){
                    idxmin = j;
                }
                rekening tmp = rk[idxmin];
                rk[idxmin] = rk[i];
                rk[i] = tmp;
            }
        }
    }
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right)/2;
            if(cari == rk[mid].noRekening){
                return(mid);
            }else if(rk[mid].noRekening>cari){
                return FindBinarySearch(cari, left, mid-1);
            }else{
                return FindBinarySearch(cari,mid+1,right);
            }
        }
        return -1;
    } 
}

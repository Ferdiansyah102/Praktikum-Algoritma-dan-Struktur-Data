/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatihanPraktikum;

/**
 *
 * @author ACER
 */
public class Bem {
    String calon;
    public int pilihan, jmlSuara = 0, jmlCalon = 4, cek = 0, nilai = 1, terima = 0, diterima = 0, array[] = new int[10000] ;
    
    int hitung(int a, int b, int c, int d, int e){
        if(nilai == 5){
            nilai = 1;
        }
        if(nilai ==1&& b>0){
            array[cek] = nilai;
            cek++;
            nilai++;
            return hitung(a, b - 1, c, d, e);
        }else if(nilai == 2&& c>0){
            array[cek]=nilai;
            cek++;
            nilai++;
            return hitung(a, b , c-1, d, e);
        }else if(nilai == 3 && d>0){
            array[cek]=nilai;
            cek++;
            nilai++;
            return hitung(a, b, c, d-1, e);
        }else if(nilai == 4 && e>0){
            array[cek]=nilai;
            cek++;
            nilai++;
            return hitung(a, b, c, d, e-1);
        }else if(b == 0 && c == 0 && d == 0 && e == 0){
            if(array[terima] == array[terima + 1] && terima + 1 < a){
                return array[terima];
            }else if(terima + 2 < a){
                terima += 2;
                return hitung (a,b,c,d,e);
            }else{
                return 0;
            }
        }else{
            nilai++;
            return hitung(a,b,c,d,e);
        }
    }
}

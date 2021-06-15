/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas2;
import java.util.Comparator;
/**
 *
 * @author ACER
 */
public class Mahasiswa {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa(String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    static Comparator<Mahasiswa>MhsNimCom = new Comparator<Mahasiswa>(){
        public int compare(Mahasiswa m1, Mahasiswa m2){
            return m1.nim.compareTo(m2.nim);
        }
    };
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas4;

/**
 *
 * @author ACER
 */
public class Node {
    String nama;
    String alamat;
    String noRek;
    Node next;
    public Node(String nm, String al, String nr, Node berikutnya){
        this.nama = nm;
        this.alamat = al;
        this.noRek = nr;
        this.next = berikutnya;
    }
}

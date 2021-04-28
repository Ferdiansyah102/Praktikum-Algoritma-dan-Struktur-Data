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
public class main {
    public static void main(String[] args) {
        SingleLinkeedList singLL = new SingleLinkeedList();
        singLL.print();
        singLL.addFirst("a");
        singLL.print();
        singLL.addLast("c");
        singLL.print();
        singLL.insertAfter("c", "d");
        singLL.print();
        singLL.addLast("e");
        singLL.print();
        singLL.insertAt(1, "b");
        singLL.print();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TugasNo1sampai4;

/**
 *
 * @author ACER
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree btr = new BinaryTree();
        btr.addRekursif(6);
        btr.addRekursif(4);
        btr.addRekursif(8);
        btr.addRekursif(3);
        btr.addRekursif(5);
        btr.addRekursif(7);
        btr.addRekursif(9);btr.addRekursif(10);
        btr.addRekursif(15);
        btr.traversePreOrder(btr.root);
        System.out.print("");
        btr.traverseInOrder(btr.root);
        System.out.print("");
        btr.traversePostOrder(btr.root);
        System.out.print("");
        System.out.print("Find " + btr.find(5));
        btr.delete(8);
        btr.traversePreOrder(btr.root);
        System.out.print("");
        System.out.println("Nilai terbesar: " + btr.max(btr.root));
        System.out.println("Nilai terkecil: " + btr.min(btr.root));
        btr.dataLeaf(btr.root);
        System.out.println("Jumlah leaf: " + btr.jmlLeaf(btr.root));
    }
}

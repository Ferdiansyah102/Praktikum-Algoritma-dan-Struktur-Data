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
public class DoubleLinkedList {
    Node head;
     int size;
     
    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(String item) {
        if (isEmpty()) {
        head = new Node(null, item, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
                Node newNode = new Node(current, item, null);
                current.next = newNode;
                size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            head = null;
            size = 0;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public String getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        }
        return head.data;
        }
        public void print() {
        if (!isEmpty()) {
            Node tmp = head; while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
}

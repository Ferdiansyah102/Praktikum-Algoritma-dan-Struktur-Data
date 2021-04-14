/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas;

/**
 *
 * @author ACER
 */
public class Stack {
    int size;
    int top;
    char[] kata;
    public Stack(int size) {
        this.size = size;
        kata = new char[size];
        top = -1;
    }
    public void push(char kt) {
        top++;
        kata[top] = kt;
    }
    public void balik(String kt) {
        for (int i = 0; i < size; i++) {
            char tmp = kt.charAt(i);
            push(tmp);
        }
    }
    public void print(String kt) {
        System.out.println("Hasil: ");
        balik(kt);
        for (int i = (size - 1); i >= 0; i--) {
            System.out.print(kata[i]);
        }
    }
}

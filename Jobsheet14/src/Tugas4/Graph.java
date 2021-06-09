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
public class Graph {
    int vertex;
    LinkedList list[];
     public Graph(int vertex, boolean graphType) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }
    public void addEdge(int index, int index2, String source, String destination) {
        list[index].addFirst(destination);
        list[index2].addFirst(source);
    }
}

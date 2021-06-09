/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Graph {
    int vertex;
    LinkedList list[];
    boolean graphType;
    boolean graphType(boolean pilih) {
        return pilih;
    }
    public Graph(int vertex, boolean graphType) {
        this.vertex = vertex;
        this.graphType = graphType;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }
    public void addEdge(int source, int destination) {
        if (graphType(graphType)) {
            list[source].addFirst(destination);
        } else {
        list[source].addFirst(destination);
        list[destination].addFirst(source);
        }
    }
    public void degree(int source) throws Exception {
        if (graphType(graphType)) {
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == source) {
                        ++totalIn;
                    }
                }
                    //outDegree
                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dai vertex " + source + " : "
            + totalIn);
            System.out.println("Outdegree dari vertex " + source + " : "
            + totalOut);
            System.out.println("degree vertex " + source + " : " +
            (totalIn
            + totalOut));
        } else {
        //degree undirected graph
        System.out.println("degree vertex " + source + " : "
        + list[source].size());
        }
    }
    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }
    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
            System.out.print("Vertex " + i + " terhubung dengan: ");
            for (int j = 0; j < list[i].size(); j++) {
                System.out.print(list[i].get(j) + " ");
            }
            System.out.println("");}
        }
        System.out.println(" ");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int to, from, count = 1;
        boolean jenis = false;
        System.out.println("Jenis graph");
        System.out.println("1. Directed\n2. Undirected");
        System.out.print("Pilih: ");
        int p = sc.nextInt();
        if (p == 1) {
            System.out.println("Directed");
            jenis = true;
        } else if (p == 2) {
            System.out.println("Undirected");
            jenis = false;
        } else {
        }
        Graph graph = new Graph(6, jenis);
        System.out.print("Masukkan jumlah lintasan: ");
        int jml = sc.nextInt();
        System.out.println("Masukkan edges: ");
        while (count <= jml) {
            to = sc.nextInt();
            from = sc.nextInt();
            graph.addEdge(to, from);
            count++;
        }
        System.out.println("");
        graph.printGraph();
    }
}

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
public class PremierLeague {
    static PremierLeague temp;
    String team;
    int play;
    int goal;
    int points;
    
    public PremierLeague(String t, int p, int g, int pt){
        team = t;
        play = p;
        goal = g;
        points = pt;
    }
    public void tampil(){
        System.out.println("Team : " + team);
        System.out.println("Play : " + play);
        System.out.println("Goal : " + goal);
        System.out.println("Points : " + points);
    }
}

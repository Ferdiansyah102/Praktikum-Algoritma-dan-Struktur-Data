/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class kubus {
    int sisi;
    public kubus(int s){
        sisi = s;
    }
    int luasPermukaanKb(){
        int luas = 6*sisi*sisi;
        return luas;
    }
    int volumeKubus(){
        int volume = sisi*sisi*sisi;
        return volume;
    }
}

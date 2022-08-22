/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.noppapeli;

import java.util.Random;

/**
 *
 * @author heyno
 */
public class noppa1 {
    private int sivut;
    private int arvo;
    
    public noppa1(int sivut) {
        this.sivut = sivut;
        heita();
    }

    public int getSivut() {
        return sivut;
    }

    public int getArvo() {
        return arvo;
    }

    public void setSivut(int sivut) {
        this.sivut = sivut;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public void heita(){
        Random rand = new Random();
        arvo = rand.nextInt(sivut) +1;
    }
    
    
    
}

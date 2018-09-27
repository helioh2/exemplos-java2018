/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.animais;

/**
 *
 * @author helio
 */
public class Macaco extends Animal {
    
    private String comidaFavorita;

    public Macaco(String nome, double peso, String comidaFavorita) {
        super(nome, peso);
        this.comidaFavorita = comidaFavorita;
    }
    
//    public void comer() {
//        System.out.println("Come como um macaco");
//    }
    
    public void move() {
        System.out.println("Anda com duas ou quatro patas");
    }
    
}

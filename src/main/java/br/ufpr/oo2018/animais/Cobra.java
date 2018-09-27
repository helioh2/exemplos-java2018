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
public class Cobra extends Animal {
    
    private double comprimento;

    public Cobra(String nome, double peso, double comprimento) {
        super(nome, peso);
        this.comprimento = comprimento;
    }
    
    public void comer() {
        System.out.println(this.nome+" come como uma cobra");
    }
    
    public void move() {
        System.out.println("Anda rastejando");
    }
}

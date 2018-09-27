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
public class Leao extends Mamifero {
    
    private double quantidadeComida;

    public Leao(String nome, double peso, double quantidadeComida) {
        super(nome, peso);
        this.quantidadeComida = quantidadeComida;
    }
    
    
    public void comer() {
        System.out.println(this.nome+" come como um leao");
    }
    
    public void move() {
        System.out.println("Anda com quatro patas");
    }
    
    
    
    
}

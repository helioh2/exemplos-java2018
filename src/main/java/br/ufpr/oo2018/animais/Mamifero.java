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
public class Mamifero extends Animal {

    public Mamifero(String nome, double peso) {
        super(nome, peso);
    }
    
    public void mama(){
        System.out.println("Mama generico");
    }

    
    
}

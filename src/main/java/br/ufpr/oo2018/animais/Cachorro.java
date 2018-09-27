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
public class Cachorro extends Mamifero {

    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public void comer() {
        System.out.println(this.nome + " come como cachorro");
    }

    @Override
    public String toString() {
        return "Cachorro "+nome;
    }
    
    
    
}

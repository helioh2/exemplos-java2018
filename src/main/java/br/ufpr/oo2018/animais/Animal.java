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
public class Animal {
    
    protected String nome;
    protected double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
    
    

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }
    
    public void comer() {
        System.out.println(this.nome+" come genérico");
    }
    
    public void mover() {
        System.out.println("Anda genérico");
    }

    @Override
    public String toString() {
        return "Animal "+nome;             
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Animal) {
            Animal outro = (Animal) obj;
            if (this.getNome().equals(outro.getNome())) {
                return true;
            }          
        }
        return false;
    }
    
    
    
    
    
    
    
    
}

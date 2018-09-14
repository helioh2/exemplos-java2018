/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.pessoas;

/**
 *
 * @author helio
 */
public class Pessoa {
    
    private String nome;
    private Comodo comodoAtual;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void entrar(Comodo c) {
        comodoAtual = c;
        c.addPessoa(this);
    }

    public String getComodoAtual() {
        return "Estou em "+comodoAtual;
    }

    @Override
    public String toString() {
        return nome;
    }
   
    
    
}

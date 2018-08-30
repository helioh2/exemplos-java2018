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
    
    private Comodo comodoAtual;
    
    public void entra(Comodo comodo) {
        comodoAtual = comodo;
        comodo.add(this);
    }
    
}

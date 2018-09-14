/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.relogio;

/**
 *
 * @author helio
 */
public class NumberDisplay {
    
    private int valor;
    private int limite;

    public NumberDisplay(int limite) {
        this.limite = limite;
        this.valor = 0;
    }

    public NumberDisplay() {
        this(100);
    }
    
    public void incrementar() {
//        if (this.valor == this.limite - 1) {
//            this.valor = 0;
//        } else {
//            this.valor += 1;
//        }
        this.valor = (this.valor + 1) % this.limite;

    }
    
    public String mostrar() {
        return valor < 10 ? "0"+valor : valor+"";
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
    
    
    
    
    
    
    
}

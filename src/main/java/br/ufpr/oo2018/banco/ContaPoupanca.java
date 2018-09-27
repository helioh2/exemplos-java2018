/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.banco;

/**
 *
 * @author helio
 */
public class ContaPoupanca extends Conta {
    
    private double taxaJuros;
    
    public ContaPoupanca(String nomeCliente, int numConta, int numAgencia) {
        super(nomeCliente, numConta, numAgencia);
        taxaJuros = 0.5;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    
    
    
    
}

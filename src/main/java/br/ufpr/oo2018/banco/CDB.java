/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.banco;

import java.util.Date;

/**
 *
 * @author helio
 */
public class CDB extends Conta {
    
    private double taxaJuros;
    private Date dataMaturidade;
    
    public CDB(String nomeCliente, int numConta, int numAgencia) {
        super(nomeCliente, numConta, numAgencia);
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public Date getDataMaturidade() {
        return dataMaturidade;
    }

    public void setDataMaturidade(Date dataMaturidade) {
        this.dataMaturidade = dataMaturidade;
    }
    
    
    
    
}

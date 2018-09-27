/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author helio
 */
public class Banco {
    
    private String nome;
    private final Map<Integer, Conta> contas;
    // Integer -> classe wrapper 
    
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new HashMap<>();
    }
   
    public void addConta(Conta conta) {
        contas.put(conta.getNumConta(), conta);
    }

    @Override
    public String toString() {
        String res = "Banco "+nome+":\n\tContas:\n";
        for (Conta c: contas.values()){
            res += "\t\t" + c + "\n";
        }
        return res;
    }
    
    
    
    
}

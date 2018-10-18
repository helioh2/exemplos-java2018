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
/// DAO = Data Access Object


public class Secretario extends Funcionario{
    
    public Secretario(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + this.salario * 0.1; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

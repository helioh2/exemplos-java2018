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
public class Gerente extends Funcionario {
    
    private String senha;
    
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        senha = "0000";
    }
    
    public Gerente(Funcionario f1) {
        this(f1.nome, f1.cpf, f1.salario);
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public boolean autenticar(String senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }

    @Override
    public double getBonificacao() {
           return this.salario*0.15; 
    }
    
    
    
    
     
     
    
    
}

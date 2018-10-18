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

public class Funcionario {
    
    
    protected String nome;
    protected String cpf;
    protected double salario;

    
    // SOBRECARGA DE CONSTRUTOR
    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
    
    public double getBonificacao() {
        return this.salario * 0.1;
    }
    
    /**
     * shdkashdjkahsjda
     * @return 
     */
    public double getRendimentos() {
        return this.salario +  this.getBonificacao();
    }
    
}

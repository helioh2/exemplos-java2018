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
public class Main {

    public static void main(String[] args) {
        Banco banestado = new Banco("Banestado");

        Conta c1 = new ContaCorrente("Fulano", 20, 10);
        Conta c2 = new ContaPoupanca("Fulano", 12, 20);
        Conta c3 = new CDB("josefina", 40, 30);

        banestado.addConta(c1);
        banestado.addConta(c2);
        banestado.addConta(c3);
        
        System.out.println(banestado);
        
        
        Funcionario f1 = new Funcionario("José", "1828282", 2000);
        Funcionario f2 = new Funcionario("Maria", "27272892", 5000);
        
        Funcionario g1 = new Gerente("João", "3838383", 7000);
        
//        Gerente g2 = (Gerente) f1;
        f1 = new Gerente(f1);
        
        
        Secretario s1 = new Secretario("Ana", "2727272", 4000);
        
        System.out.println(f1.getBonificacao());
        System.out.println(f2.getBonificacao());
        System.out.println(g1.getBonificacao());
        System.out.println(s1.getBonificacao());
//        System.out.println(g2.getBonificacao());
        
        
        
    }

}

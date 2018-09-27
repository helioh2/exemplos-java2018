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
    }

}

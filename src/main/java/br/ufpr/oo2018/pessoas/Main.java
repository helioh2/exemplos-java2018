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
public class Main {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("José");
        Pessoa p2 = new Pessoa("Ana");
        
        Comodo c1 = new Comodo("Sala", 300,400);
        Comodo c2 = new Comodo("Cozinha", 200,400);
        
        p1.entrar(c1);
        p2.entrar(c1);
        System.out.println(p1.getComodoAtual());
        
        System.out.println(c1.getPessoas());
        
        System.out.println(c1.isIluminado());
        
        c1.acenderLuz();
        
        System.out.println(c1.isIluminado());
        
        
        Movel m1 = new Movel("Carteira 1");
        Movel m2 = new Movel("Carteira 2");
        
        c1.addMovel(m1, 150, 150);
        c1.addMovel(m2, 150, 200);
        
        System.out.println(c1.getMoveis());
        
        
    }
    
}

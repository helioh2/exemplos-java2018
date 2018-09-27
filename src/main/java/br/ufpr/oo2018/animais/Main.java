/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.animais;

import java.util.Arrays;

/**
 *
 * @author helio
 */
public class Main {
    public static void main(String[] args) {
        Animal m1 = new Macaco("chita", 50, "banana");
        
        Animal l1 = new Leao("simba", 200, 20);
        
        Animal c1 = new Cobra("kaa", 80, 300);
        
        Animal cc1 = new Cachorro("bob", 80);
        Animal cc2 = new Cachorro("bob", 80);
      
        System.out.println(c1.getNome());
                
        
        TratadorZoologico jose = new TratadorZoologico();
        
        jose.alimentarTodos(Arrays.asList(m1, l1, c1, cc1));
        
        
        Object x = cc1;
        
        System.out.println(x.toString());
        
        System.out.println(cc1.equals(cc2));
        
        
        
    }
}

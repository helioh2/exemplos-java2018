/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.relogio;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author helio
 */
public class NumberDisplayTest {
    
    
    @Test
    public void testIncrementarNormal() {
        //PREPARAÇÃO
        NumberDisplay d1 = new NumberDisplay(60);
        assertEquals(d1.mostrar(), "00");
        
        //EXECUÇÃO
        d1.incrementar();
        
        //VERIFICAÇÃO
//        System.out.println(d1.mostrar());
        assertEquals(d1.mostrar(), "01");
            
    }
    
    @Test
    public void testIncrementarVolta() {
        //PREPARAÇÃO
        NumberDisplay d1 = new NumberDisplay(60);
        d1.setValor(59);
        assertEquals(d1.mostrar(), "59");
        
        //EXECUÇÃO
        d1.incrementar();
        
        //VERIFICAÇÃO
        System.out.println(d1.mostrar());
        assertEquals(d1.mostrar(), "00");
            
    }
}

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
public class ClockDisplayTest {
    
   
     @Test
     public void testTickNormal() {
         //PREPARAÇÃO
        ClockDisplay d1 = new ClockDisplay();
//         System.out.println(d1.mostrar());
        assertEquals(d1.mostrar(), "00:00");
        
        //EXECUÇÃO
        d1.tick();
        
        //VERIFICAÇÃO
        assertEquals(d1.mostrar(), "00:01");
     
     }
     
     @Test
     public void testTickPassaHora() {
         //PREPARAÇÃO
        ClockDisplay d1 = new ClockDisplay();
        d1.setHoras(0, 59);
//         System.out.println(d1.mostrar());
        assertEquals(d1.mostrar(), "00:59");
        
        //EXECUÇÃO
        d1.tick();
        
        //VERIFICAÇÃO
        System.out.println(d1.mostrar());
        assertEquals(d1.mostrar(), "01:00");
     
     }
     
     @Test
     public void testTickPassaDia() {
         //PREPARAÇÃO
        ClockDisplay d1 = new ClockDisplay();
        d1.setHoras(23, 59);
//         System.out.println(d1.mostrar());
        assertEquals(d1.mostrar(), "23:59");
        
        //EXECUÇÃO
        d1.tick();
        
        //VERIFICAÇÃO
        System.out.println(d1.mostrar());
        assertEquals(d1.mostrar(), "00:00");
     
     }
}

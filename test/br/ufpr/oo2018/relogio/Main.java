/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.relogio;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author helio
 */
public class Main {
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    
    public static void main(String[] args) {
        ClockDisplay relogio = new ClockDisplay();
        new Thread(){
            
            
            @Override
            public void run() {
//                super.run(); //To change body of generated methods, choose Tools | Templates.
                
                while (true){
//                    System.out.
                    clearScreen();
                    System.out.println(relogio.mostrar());
                    relogio.tick();
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            
            }
            
        }.run();
    }
    
}

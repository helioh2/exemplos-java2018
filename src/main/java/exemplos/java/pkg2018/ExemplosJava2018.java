/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.java.pkg2018;

import br.ufpr.oo2018.banco.ContaCorrente;

/**
 *
 * @author helio
 */
public class ExemplosJava2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContaCorrente cc1 = new ContaCorrente("Fulano", 1001, 234);
        System.out.println(cc1.getSaldo());  // -> 0
        cc1.depositar(200);
        System.out.println(cc1.getSaldo());  // -> 200
        cc1.depositar(-50);
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.banco;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author helio
 */
public class ContaCorrenteTest {
    
    public ContaCorrenteTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testDepositar() {
         //PREPARACAO (CRIANDO PRÉ-CONDIÇÃO)
         ContaCorrente cc1 = new ContaCorrente("Fulano", 115, 111);
         
         //EXECUÇÃO
         cc1.depositar(200);
         
         //VERIFICAÇÃO (VERIFICANDO A PÓS-CONDIÇÃO)
         assertEquals(cc1.getSaldo(), 200, 0.001);
                
         //caso negativo
         //PREPARACAO
         ContaCorrente cc2 = new ContaCorrente("Fulano", 115, 111);
         
         //EXECUCAO
         cc2.depositar(-50);
         
         //VERIFICAÇÃO
         assertEquals(cc2.getSaldo(), 0, 0.001);
     }
     
     @Test
     public void testSacar() {
        
        //Caso em que dá pra sacar (saldo >= quantia)

        //PREPARACAO
         ContaCorrente cc1 = new ContaCorrente("Fulano", 115, 111);
         cc1.depositar(200);
         
         //EXECUÇÃO
         cc1.debitar(100);
         
         //VERIFICACAO
         assertEquals(cc1.getSaldo(), 100, 0.001);
         
        //Caso em que não dá pra sacar (saldo < quantia)

        //PREPARACAO
         cc1 = new ContaCorrente("Fulano", 115, 111);
         cc1.depositar(100);
         
         //EXECUÇÃO
         cc1.debitar(300);
         
         //VERIFICACAO
         assertEquals(cc1.getSaldo(), 100, 0.001);
         
         
         //Caso em que não dá pra sacar (saldo < quantia)

        //PREPARACAO
         cc1 = new ContaCorrente("Fulano", 115, 111);
         cc1.depositar(100);
         
         //EXECUÇÃO
         cc1.debitar(-300);
         
         //VERIFICACAO
         assertEquals(cc1.getSaldo(), 100, 0.001);
         
     }
     
     @Test
     public void testTransferir(){
         //PREPARAÇÃO
         ContaCorrente cc1 = new ContaCorrente("Fulano", 115, 111);
         ContaCorrente cc2 = new ContaCorrente("Beltrano", 117, 111);
         cc1.depositar(200);
         
         //EXECUÇÃO
         cc1.transferir(80, cc2);
         
         //VERIFICACAO
         assertEquals(cc1.getSaldo(), 120, 0.001);
         assertEquals(cc2.getSaldo(), 80, 0.001);
         
     }
}

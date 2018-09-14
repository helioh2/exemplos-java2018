/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.mail;

import br.ufpr.oo2018.mail.MailClient;
import br.ufpr.oo2018.mail.MailItem;
import br.ufpr.oo2018.mail.MailServer;
import br.ufpr.oo2018.mail.MailStatus;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author helio
 */
public class MailClientTest {
    
//    @Mock
    MailServer ms1;
//    @Mock
    MailServer ms2;
    
    
    public MailClientTest() {
    }
   
    
    @Before
    public void setUp() {
        ms1 = new MailServer("teste.com");
        ms2 = new MailServer("exemplo.com");
    }
   

  
     @Test
     public void testEscrever() {
         //PREPARAÇÃO
         MailClient mc1 = new MailClient("fulano", ms1);
         MailClient mc2 = new MailClient("beltrano", ms1);
         //EXECUÇÃO
         MailItem email = mc1.escrever(Arrays.asList("beltrano@teste.com"),
                 "assunto", "mensagem");
         //VERIFICAÇÃO
         assertEquals("beltrano@teste.com", email.getPara());
         assertEquals("fulano@teste.com", email.getDe());
         assertEquals("assunto", email.getAssunto());
         assertEquals("mensagem", email.getMensagem());
         assertEquals(MailStatus.RASCUNHO, email.getStatus());
         assertTrue(mc1.getRascunhos().contains(email));        
         
     }
     
     @Test
     public void testEnviarMesmoServidorSucesso() {
         //PREPARAÇÃO
         MailClient mc1 = new MailClient("fulano", ms1);
         MailClient mc2 = new MailClient("beltrano", ms1);
         //EXECUÇÃO
         MailItem email = mc1.escrever(Arrays.asList("beltrano@teste.com"),
                 "assunto", "mensagem");
         mc1.enviar(email);
         //VERIFICAÇÃO
         assertTrue(mc1.getEnviadas().contains(email));
         assertFalse(mc1.getRascunhos().contains(email));
         assertEquals(MailStatus.RECEBIDA, email.getStatus());
         assertTrue(mc2.getCaixaEntrada().contains(email));
//         assert
     }
}

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


import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.*;

/**
 *
 * @author helio
 */
public class MailClientTest {
    
    @Mock
    MailServer ms1;
    @Mock
    MailServer ms2;
    
    
    public MailClientTest() {
        
    }
   
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(ms1.getDominio()).thenReturn("teste.com");
        // when(ms2.getDominio()).thenReturn("example.com");
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
         assertEquals(Arrays.asList("beltrano@teste.com"), email.getPara());
         assertEquals("fulano@teste.com", email.getDe());
         assertEquals("assunto", email.getAssunto());
         assertEquals("mensagem", email.getMensagem());
         assertEquals(MailStatus.RASCUNHO, email.getStatus());
         assertTrue(mc1.getRascunhos().contains(email));        
         
     }
     
     @Test
     public void testEnviar() {
        
         //PREPARAÇÃO
         MailClient mc1 = new MailClient("fulano", ms1);
         MailItem email = mc1.escrever(Arrays.asList("beltrano@teste.com"),
                 "assunto", "mensagem");
        //EXECUCAO
         mc1.enviar(email);
         
         //VERIFICAÇÃO
         verify(ms1).receber(email);
         assertTrue(mc1.getEnviadas().contains(email));
         assertFalse(mc1.getRascunhos().contains(email));     
         assertEquals(MailStatus.ENVIADA, email.getStatus());
     }
     
     @Test
     public void testReceber() {
         //PREPARAÇÃO
         MailClient mc2 = new MailClient("beltrano", ms1);
         MailItem email = new MailItem("fulano");
         email.setAssunto("assunto");
         email.setMensagem("mensagem");
         email.setPara(Arrays.asList("beltrano@teste.com"));
         //EXECUCAO
         mc2.receber(email);
         //VERIFICAÇÃO
         assertTrue(mc2.getCaixaEntrada().contains(email));
         assertEquals(MailStatus.RECEBIDA, email.getStatus());
     }
     
     
     @Test
     public void testAbrirSucesso() throws ItemNaoEncontradoException {
         //PREPARAÇÃO
         MailClient mc2 = new MailClient("beltrano", ms1);
         MailItem email = new MailItem("fulano");
         email.setAssunto("assunto");
         email.setMensagem("mensagem");
         email.setPara(Arrays.asList("beltrano@teste.com"));
         int id = email.getId();
         mc2.receber(email);

         //EXECUÇÃO
         MailItem theEmail = mc2.abrir(id);

         //VERIFICAÇÃO
         assertEquals(theEmail, email);
         assertEquals(MailStatus.LIDA, theEmail.getStatus());
         
     }

     @Test(expected = ItemNaoEncontradoException.class)
     public void testAbrirFalha() throws ItemNaoEncontradoException {
         //PREPARAÇÃO
         MailClient mc2 = new MailClient("beltrano", ms1);
         MailItem email = new MailItem("fulano");
         email.setAssunto("assunto");
         email.setMensagem("mensagem");
         email.setPara(Arrays.asList("beltrano@teste.com"));
         int id = email.getId();
         mc2.receber(email);

         //EXECUÇÃO
         mc2.abrir(id+1);
         
     }


}

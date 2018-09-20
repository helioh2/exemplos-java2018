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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
public class MailServerTest {
    
    @Mock
    MailClient mc2;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(mc2.getUsername()).thenReturn("beltrano");
    }
   

  
     @Test
     public void testReceberMesmoServidor() {
        //PREPARAÇÃO
        MailServer ms1 = new MailServer("teste.com");
        ms1.addCliente(mc2);
        MailItem email = new MailItem("fulano");
        email.setAssunto("assunto");
        email.setMensagem("mensagem");
        email.setPara(Arrays.asList("beltrano@teste.com"));

        //EXECUÇÃO
        ms1.receber(email);

        //VERIFICACAO
        verify(mc2).receber(email);
     }

     @Test
     public void testReceberOutroServidor() {
        //PREPARAÇÃO
        MailServer ms1 = new MailServer("example.com");
        MailServer ms2 = mock(MailServer.class);
        when(ms2.getDominio()).thenReturn("teste.com");
        when(ms2.getServidoresConhecidos()).thenReturn(new HashMap<>());
        ms1.addServidor(ms2);
        MailItem email = new MailItem("fulano");
        email.setAssunto("assunto");
        email.setMensagem("mensagem");
        email.setPara(Arrays.asList("beltrano@teste.com"));

        //EXECUÇÃO
        ms1.receber(email);

        //VERIFICACAO
        verify(ms2).receber(email);
     }

     
}

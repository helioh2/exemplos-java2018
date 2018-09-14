/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.mail;

import java.util.Arrays;

/**
 *
 * @author helio
 */
public class main {
    public static void main(String[] args) {
        
       MailServer serv1 = new MailServer("zipmail.com");
       
       MailServer serv2 = new MailServer("uol.com.br");
 
      
       MailClient ns1 = new MailClient("fulano", serv1 ); 
       
       MailItem novoEmail = new MailItem("fulano");
        
       MailItem email = ns1.escrever(Arrays.asList("fulano@zipmail"), "Churrasco hoje", "Tras a carne");
       
       serv1.addCliente(ns1);
       serv1.addServidor(serv2);
       
       ns1.enviar(email);
       
    }
}

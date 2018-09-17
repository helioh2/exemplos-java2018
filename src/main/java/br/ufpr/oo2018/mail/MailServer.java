/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.mail;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author helio
 */
public class MailServer {
    private String dominio;
    private List<MailClient> clientes;
    private List<MailServer> servidoresConhecidos;

    public MailServer(String dominio) {
        this.dominio = dominio;
        this.clientes = new ArrayList();
        this.servidoresConhecidos =new ArrayList<>();
        
        
    }
    public void addCliente (MailClient cliente){
        clientes.add(cliente);
        
    }
    
    public void addServidor (MailServer servidor){
        this.servidoresConhecidos.add(servidor);
        servidor.getServidoresConhecidos().add(this);
    }

        
    public List<MailServer> getServidoresConhecidos() {
        return servidoresConhecidos;
    }

    public String getDominio() {
        return dominio;
    }
    
    
    
    public void receber(MailItem m){
        System.out.println("Recebido");        
    }
    
}

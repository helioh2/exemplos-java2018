/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.mail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author helio
 */
public class MailServer {
    private String dominio;
    private Map<String, MailClient> clientes;
    private Map<String, MailServer> servidoresConhecidos;

    public MailServer(String dominio) {
        this.dominio = dominio;
        this.clientes = new HashMap<>();
        this.servidoresConhecidos =new HashMap<>(); 
    }
   
    public void addCliente (MailClient cliente){
        clientes.put(cliente.getUsername(), cliente);
        
    }
    
    public void addServidor (MailServer servidor){
        this.servidoresConhecidos.put(servidor.getDominio(), servidor);
        servidor.getServidoresConhecidos().put(this.getDominio(), this);
    }

        
    public Map<String, MailServer> getServidoresConhecidos() {
        return servidoresConhecidos;
    }

    public String getDominio() {
        return dominio;
    }
    
    
    
    public void receber(MailItem m){
        encaminhar(m);
    }

    private void encaminhar(MailItem m) {
        Iterator<String> it =  m.getPara().iterator();       
        while (it.hasNext()) {
            String endereco = it.next();
            String username = endereco.split("@")[0];
            String dominio = endereco.split("@")[1];
            if (this.dominio.equals(dominio)) {
                encaminharCliente(username, m);
            } else {
                encaminharServidor(dominio, m);
            }
        }
        
//        for (String endereco: m.getPara()){
//            String username = endereco.split("@")[0];
//            String dominio = endereco.split("@")[1];
//            if (this.dominio.equals(dominio)) {
//                encaminharCliente(username, m);
//            } else {
//                encaminharServidor(dominio, m);
//            }
//        }
        
    }
    
    private void encaminharCliente(String username, MailItem m) {
//        for (MailClient mc: clientes.values()) {
//            if (mc.getUsername().equals(username)) {
//                mc.receber(m);
//                return;
//            }
//        }
        if (clientes.containsKey(username)) {
            MailClient mc = clientes.get(username);
            mc.receber(m);
        }
    }

    private void encaminharServidor(String dominio, MailItem m) {
        if (servidoresConhecidos.containsKey(dominio)) {
            MailServer ms = servidoresConhecidos.get(dominio);
            ms.receber(m);
        }
    }
    
}

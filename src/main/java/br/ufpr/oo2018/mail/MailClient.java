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
public class MailClient {
    String username;
    List<MailItem> caixaEntrada; 
    List<MailItem> enviadas;
    List<MailItem> lixeira;
    List<MailItem> rascunhos;
    MailServer servidor;
    
    public MailClient(String username, MailServer servidor){
        this.username = username;
        this.servidor = servidor;
        this.caixaEntrada = new ArrayList<>();
        this.enviadas = new ArrayList<>();
        this.lixeira = new ArrayList<>();
        this.rascunhos = new ArrayList<>();
        
    }
    
    public MailItem escrever(List<String> para, String assunto, String mensagem){
        MailItem email = new MailItem(this.username);
        email.setAssunto(assunto);
        email.setMensagem(mensagem);
        email.setPara(para);
        return email;
    }

    public String getUsername() {
        return username;
    }

    public List<MailItem> getCaixaEntrada() {
        return caixaEntrada;
    }

    public List<MailItem> getEnviadas() {
        return enviadas;
    }

    public List<MailItem> getRascunhos() {
        return rascunhos;
    }

    public List<MailItem> getLixeira() {
        return lixeira;
    }

    
    
    
    public void enviar(MailItem email){
        servidor.receber(email);
    }

    public void receber(MailItem email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public MailItem abrir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

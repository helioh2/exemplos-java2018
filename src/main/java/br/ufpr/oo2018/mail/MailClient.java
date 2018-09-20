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
    List<MailItem> caixaEntrada; ///DÁ PARA OTIMIZAR COM MAP
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
        MailItem email = new MailItem(this.username + "@" + servidor.getDominio());
        email.setAssunto(assunto);
        email.setMensagem(mensagem);
        email.setPara(para);
        rascunhos.add(email);
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
        enviadas.add(email);
        rascunhos.remove(email);
        email.setEnviada();
        servidor.receber(email);
    }

    public void receber(MailItem email) {
        caixaEntrada.add(email);
        email.setRecebida();
    }
    
    public MailItem abrir(int id) throws ItemNaoEncontradoException {
//        for (int i = 0; i < caixaEntrada.size(); i++) {
//            MailItem item = caixaEntrada.get(i);
//            if (item.getId() == id) {
//                return item;
//            }
//        }
        for (MailItem item: caixaEntrada) {
            if (item.getId() == id) {
                item.setLida();
                return item;
            }
        }
        throw new ItemNaoEncontradoException("ERRO: Email não encontrado");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.mail;

import java.util.Date;
import java.util.List;

/**
 *
 * @author helio
 */
public class MailItem {
    
    private static int ID = 0;
    
    private int id;
    private String de;
    private List<String> para;
    private String assunto;
    private String mensagem;
    private Date dataEnvio;
    private Date dataCriacao;
    private MailStatus status;

    public MailItem(String de){
        this.id = ++ID;
        this.de = de;
        this.dataCriacao = new Date(); //na verdade aqui não foi enviado ainda.
        this.status = MailStatus.RASCUNHO;
    }

    public int getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public List<String> getPara() {
        return para;
    }

    public String getDe() {
        return de;
    }

    public MailStatus getStatus() {
        return status;
    }

    public String getAssunto() {
        return assunto;
    }

    
    
    public void setAssunto(String assunto) {
        this.assunto = assunto;

    }

    public void setPara(List<String> para) {
        this.para = para;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
     
    
    
    
    
    
}

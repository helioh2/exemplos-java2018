/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.mail;

/**
 *
 * @author helio
 */
public class ControladorMailClient {
    
    MailClient meuCliente;

    public ControladorMailClient(MailClient meuCliente) {
        this.meuCliente = meuCliente;
    }
    
    
    
    public void tratarAbrir(int id){
        try {
            meuCliente.abrir(id);
        } catch (ItemNaoEncontradoException ex) {
            System.out.println(ex.getMessage());
        }
         
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.pessoas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author helio
 */
public class Comodo {
    
    private String nome;
    private List<Pessoa> pessoas;
    private int comprimento;
    private int largura;
    private Color corParede;
    private Lampada lampada;
    private List<Movel> moveis;

    public Comodo(String nome, int comprimento, int largura) {
        this.nome = nome;
        pessoas = new ArrayList<>();
        moveis = new ArrayList<>();
        corParede = Color.gray;
        lampada = new Lampada();
    }
    
    public void addPessoa(Pessoa p) {
        pessoas.add(p);
    }
    
    public void addMovel(Movel m, int x, int y) {
        moveis.add(m);
        m.setX(x);
        m.setY(y);
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public List<Movel> getMoveis() {
        return moveis;
    }
    
    
    /**
     * Este seria o interruptor.
     */
    public void acenderLuz() {
        lampada.acender(); //DELEGAÇÃO
    }
    public void apagarLuz() {
        lampada.apagar(); //DELEGAÇÃO
    }
    
    public boolean isIluminado() {     
        return lampada.isAceso();
    }

    @Override
    public String toString() {
        return nome+" de cor "+corParede;
    }
    
    
    
    
    
    
    
    
   
    
}

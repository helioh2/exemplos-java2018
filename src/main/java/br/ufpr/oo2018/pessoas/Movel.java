/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.pessoas;

/**
 *
 * @author helio
 */
class Movel {
    
    private String nome;
    private int x;
    private int y;

    public Movel(String nome) {
        this.nome = nome;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    public void arrastar(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return nome + " na posição x="+x+", y="+y;
    }
    
    
    
}

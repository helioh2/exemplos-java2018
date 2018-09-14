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
class Lampada {
    
    private boolean aceso = false;

    public void acender() {
        aceso = true;
    }
    
    public void apagar() {
        aceso = false;
    }

    public boolean isAceso() {
        return aceso;
    }

    
    
    
}

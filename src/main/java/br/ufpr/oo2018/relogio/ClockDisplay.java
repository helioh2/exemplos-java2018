/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.relogio;

/**
 *
 * @author helio
 */
public class ClockDisplay {
    
    private NumberDisplay displayHoras;
    private NumberDisplay displayMinutos;

    public ClockDisplay() {
        this.displayHoras = new NumberDisplay(24);
        this.displayMinutos = new NumberDisplay(60);
    }
    
    public void tick() {
        displayMinutos.incrementar();
        if (displayMinutos.getValor() == 0){
            displayHoras.incrementar();
        }
    }
    
    public String mostrar() {
        return displayHoras.mostrar() + ":" + displayMinutos.mostrar();
    }
    
    public void zerar() {
        return;
    }
    
    public void setHoras(int horas, int minutos) {
        displayHoras.setValor(horas);
        displayMinutos.setValor(minutos);
    }
    
    
    
}

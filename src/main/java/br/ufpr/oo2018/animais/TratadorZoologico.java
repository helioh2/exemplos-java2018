/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.oo2018.animais;

import java.util.List;

/**
 *
 * @author helio
 */
public class TratadorZoologico {
    
    public void alimentarTodos(List<Animal> animais) {
        for (Animal animal: animais) {
            animal.comer();
        }
        
//        animais.stream().forEach((animal) -> animal.comer());
    }
    
}

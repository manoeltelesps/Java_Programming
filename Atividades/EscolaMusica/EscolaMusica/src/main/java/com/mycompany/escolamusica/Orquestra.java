/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manoeltelesps
 */
public class Orquestra {
    
    private List<InstrumentoMusical> instrumentos;

    public Orquestra() {
        instrumentos = new ArrayList<>();
    }

    public void adicionar(InstrumentoMusical instrumento) {
        instrumentos.add(instrumento);
    }

    public void apresentar() {
        for (InstrumentoMusical i : instrumentos) {
            i.tocar();
        }
    }

    // teste rapido
    public static void main(String[] args) {
        Orquestra o = new Orquestra();
        o.adicionar(new Piano("Piano"));
        o.adicionar(new Flauta("Flauta"));
        o.adicionar(new Violino("Violino"));
        o.adicionar(new Violoncelo("Violoncelo"));
        o.apresentar();
    }
}


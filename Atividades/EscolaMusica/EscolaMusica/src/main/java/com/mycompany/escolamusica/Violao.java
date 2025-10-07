/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusica;

/**
 *
 * @author manoeltelesps
 */
public class Violao extends InstrumentoMusical{
    private int qtdCordas;
    
    public Violao(String nome, String material, int qtdCordas) {
        super(nome, "Cordas", material);
        this.qtdCordas = qtdCordas;
    }
    
    @Override
    public void tocar() {
        System.out.println("Violao toca: plim plim...");
    }

    /**
     * @return the qtdCordas
     */
    public int getQtdCordas() {
        return qtdCordas;
    }
}

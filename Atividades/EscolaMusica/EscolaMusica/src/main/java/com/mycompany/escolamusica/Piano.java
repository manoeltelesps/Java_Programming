/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusica;

/**
 *
 * @author manoeltelesps
 */
public class Piano extends InstrumentoMusical{
    private int qtdTeclas;

    public Piano(String nome, String material, int qtdTeclas) {
        super(nome, "Teclas", material);
        this.qtdTeclas = qtdTeclas;
    }

    @Override
    public void tocar() {
        System.out.println("Piano toca: plim plom plim...");
    }

    /**
     * @return the qtdTeclas
     */
    public int getQtdTeclas() {
        return qtdTeclas;
    }
}

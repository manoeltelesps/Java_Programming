/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusica;

/**
 *
 * @author manoeltelesps
 */
public class Bateria extends InstrumentoMusical{
    private int qtdTambores;

    public Bateria(String nome, String material, int qtdTambores) {
        super(nome, "Percussao", material);
        this.qtdTambores = qtdTambores;
    }

    @Override
    public void tocar() {
        System.out.println("Bateria toca: tum tss tum tss...");
    }

    /**
     * @return the qtdTambores
     */
    public int getQtdTambores() {
        return qtdTambores;
    }
}

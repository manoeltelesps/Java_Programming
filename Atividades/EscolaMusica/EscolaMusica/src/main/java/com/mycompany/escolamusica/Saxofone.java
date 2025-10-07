/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusica;

/**
 *
 * @author manoeltelesps
 */
public class Saxofone extends InstrumentoMusical{
    private String tipoSax;
    
    public Saxofone(String nome, String material, String tipoSax) {
        super(nome, "Sopro", material);
        this.tipoSax = tipoSax;
    }

    @Override
    public void tocar() {
        System.out.println("Saxofone (" + tipoSax + ") toca: fuuu fuuu...");
    }
}

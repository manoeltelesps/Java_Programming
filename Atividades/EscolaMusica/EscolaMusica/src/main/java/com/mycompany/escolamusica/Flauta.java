/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusica;

/**
 *
 * @author manoeltelesps
 */
public class Flauta extends InstrumentoMusical{
    
    public Flauta(String nome){
        super("Nome");
    }
    
    @Override 
    public void tocar(){
        System.out.println("Flauta toca: fiuuu fiuuu...");
    }
}

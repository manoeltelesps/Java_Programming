/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusica;

/**
 *
 * @author manoeltelesps
 */
public class Violoncelo extends InstrumentoMusical{
    
    public Violoncelo(String nome){
        super("Nome");
    }
    
    @Override 
    public void tocar(){
        System.out.println("Violoncelo toca: vruuum vruuum...");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escolamusica;

/**
 *
 * @author manoeltelesps
 */
public abstract class InstrumentoMusical {
    
    private String nome;
    
    public InstrumentoMusical(String nome){
        this.nome = nome;
    }
    
    public abstract void tocar();

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
}

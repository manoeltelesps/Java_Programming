/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escolamusica;

/**
 *
 * @author manoeltelesps
 */
public abstract class InstrumentoMusical {
    
    protected String nome;
    protected String tipo;
    protected String material;

    public InstrumentoMusical(String nome, String tipo, String material) {
        this.nome = nome;
        this.tipo = tipo;
        this.material = material;
    }
    
    public void afinar() {
        System.out.println(nome + " afinando...");
    }

    public abstract void tocar();

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

}

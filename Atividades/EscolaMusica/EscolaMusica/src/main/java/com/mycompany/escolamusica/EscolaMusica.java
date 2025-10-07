/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusica;

/**
 *
 * @author manoeltelesps
 */

public class EscolaMusica {

    public static void main(String[] args) {
        InstrumentoMusical[] banda = new InstrumentoMusical[4];
        System.out.println("=== INICIANDO ORQUESTRA ===");
                
        banda[0] = new Violao("Violao Classico", "Madeira", 6);
        banda[1] = new Piano("Piano de Cauda", "Madeira e Metal", 88);
        banda[2] = new Bateria("Bateria Acustica", "Madeira e Metal", 5);
        banda[3] = new Saxofone("Saxofone", "Latão", "Alto");
        
        EscolaMusica escola = new EscolaMusica();
        
        System.out.println("=== AFINANDO INSTRUMENTOS ===");
        for (InstrumentoMusical i : banda) {
            i.afinar();
        }

        System.out.println("\n=== INSTRUMENTOS TOCANDO ===");
        for (InstrumentoMusical i : banda) {
            i.tocar();
        }

        // INFORMACOES DO INSTRUMENTO 1
        System.out.println("\n=== INFORMACOES DO INSTRUMENTO 1 ===");
        InstrumentoMusical primeiro = banda[0];
        System.out.println("Nome: " + primeiro.getNome());
        System.out.println("Material: " + primeiro.getMaterial());
        
        if (primeiro instanceof Violao) {
            Violao v = (Violao) primeiro;
            System.out.println("Qtd de cordas: " + v.getQtdCordas());
        } else {
            System.out.println("Qtd de cordas: N/A");
        }
    }
}


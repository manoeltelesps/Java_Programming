/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herancaestudo;

/**
 *
 * @author manoeltelesps
 */
public class HerancaEstudo {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa(
            "José", 
            21, 
            "111.222.333-44"
        );
        
        pessoa1.mostrarDados();
        
        Funcionario funcionario = new Funcionario(
                "Gustavo",
                34,
                "222.333.444-55", 
                "Zelador",
                "04/09/2018",
                1324.32
        );
        
        funcionario.mostrarDados();
        funcionario.calcularSalarioAnual();
        funcionario.receberAumento(100);
        
        funcionario.mostrarDados();
        funcionario.calcularSalarioAnual();
        
        Gerente gerente = new Gerente(
                "Kenay",
                21,
                "333.444.555-66",
                "Gerente",
                "01/01/2017",
                10000,
                6
        );
        
        gerente.mostrarDados();
        gerente.calcularSalarioComBonus(50);
      
        
    }
}

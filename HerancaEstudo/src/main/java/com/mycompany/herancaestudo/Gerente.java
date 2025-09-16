/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaestudo;

/**
 *
 * @author manoeltelesps
 */
public class Gerente extends Funcionario {
    private int equipe;
    private double bonus;
    
    public Gerente(String nome, int idade, String cpf, String cargo, String dataAdmissao, double salario, int equipe){
        super(nome, idade, cpf, cargo, dataAdmissao, salario);
        this.equipe = equipe;
    }
    
    @Override
    public void mostrarDados(){
       super.mostrarDados();
        System.out.println("Pessoas na equipe: " + getEquipe());
    }
    
    public void gerenciarEquipe(){
        System.out.println("\nO gerente " + getNome() + " está gerenciando uma equipe de " + getEquipe() + " pessoas");
    }
    
    public double calcularSalarioComBonus(double bonus){
        setSalario((getSalario() * (bonus/100)) + getSalario());
        
        System.out.println("\nNovo salário com bonus de " + bonus + "% é igual a: R$ " + getSalario());
        return getSalario();
    }

    /**
     * @return the equipe
     */
    public int getEquipe() {
        return equipe;
    }

    /**
     * @param equipe the equipe to set
     */
    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

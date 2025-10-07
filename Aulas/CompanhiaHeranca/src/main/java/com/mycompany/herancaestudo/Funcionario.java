/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaestudo;

/**
 *
 * @author manoeltelesps
 */
public class Funcionario extends Pessoa {
    protected String cargo;
    protected String dataAdmissao;
    protected double salario;
    
    public Funcionario(String nome, int idade, String cpf, String cargo, String dataAdmissao, double salario){
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Cargo: " + getCargo() + "\nData de Admissão: " + getDataAdmissao() + "\nSalário: " + getSalario());
    }
    
    public double calcularSalarioAnual(){
        
        System.out.println("\nO salario anual é de: " + getSalario() * 12);
        return getSalario() * 12;
    }
    
    public void receberAumento(double aumento){
        setSalario(getSalario() + aumento);
        System.out.println("\nRecebeu aumento, novo salario é de: R$ " + getSalario());
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the dataAdmissao
     */
    public String getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * @param dataAdmissao the dataAdmissao to set
     */
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}

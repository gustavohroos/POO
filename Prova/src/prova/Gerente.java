/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

/**
 *
 * @author gustavo
 */
public class Gerente extends Funcionario{
    @Override
    public String getNome(){
        String completo;
        completo = "Gerente" + this.nome;
        return completo;
    }
    @Override
    public void setSalario(float salario){
        this.salario = salario + salario*0.05f;
    }
    
}

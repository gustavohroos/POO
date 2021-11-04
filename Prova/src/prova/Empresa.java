/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author gustavo
 */
public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
    
    public void inserirFuncionario(Funcionario f){
        this.funcionarios.add(f);
    }
    
    public void aumentarSalario(){
        for(int i = 0; i< funcionarios.size(); i++){
            this.funcionarios.get(i).setSalario(this.funcionarios.get(i).getSalario()*1.1f); 
        }
    }
}

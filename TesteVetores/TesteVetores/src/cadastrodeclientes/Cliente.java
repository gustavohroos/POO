/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeclientes;

/**
 *
 * @author Felipe Marques
 */
public class Cliente {
    private String cpf;
    private String nome;
    
    Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public void imprimir() {
        System.out.println("################################");
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
    }
}

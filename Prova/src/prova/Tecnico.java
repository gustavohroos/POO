/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

/**
 *
 * @author gustavo
 */
public class Tecnico extends Funcionario{
    
    @Override
    public String getNome(){
        String completo;
        completo = "Tecnico" + this.getNome();
        return completo;
    }
    
}

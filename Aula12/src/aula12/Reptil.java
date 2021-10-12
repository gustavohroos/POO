/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author gustavo
 */
public class Reptil extends Animal {
    protected String corEscama;
    
    @Override
    public void locomover(){
        System.out.println("rastejando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("comendo vegetais");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("som de réptil");
    }
}

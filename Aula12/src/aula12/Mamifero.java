/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author gustavo
 */
public class Mamifero extends Animal {
    protected String corPelo;
    
    @Override
    public void locomover(){
        System.out.println("correndo");
    }
    @Override
    public void alimentar(){
        System.out.println("mamando");
    }
    @Override
    public void emitirSom(){
        System.out.println("som de mamifero");
    }
    
}

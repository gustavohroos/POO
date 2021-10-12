/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author gustavo
 */
public class Peixe extends Animal {
    protected String corEscama;
    
    @Override
    public void locomover(){
        System.out.println("nadando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("comendo substancias do solo");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("peixe nao emite som");
    }
    
    public void soltarBolha(){
        System.out.println("soltando bolha");
    }
    
}

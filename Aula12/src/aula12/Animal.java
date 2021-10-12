/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author gustavo
 */
public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}

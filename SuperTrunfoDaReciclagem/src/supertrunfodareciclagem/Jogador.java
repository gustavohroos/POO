/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package supertrunfodareciclagem;

import java.util.LinkedList; // import the ArrayList class
/**
 *
 * @author gustavo
 */
public class Jogador {
    private String nome;
    private LinkedList<Carta> cartas;
    
    public String nome(){
        return this.nome;
    }
    public int numeroDeCartas(){
        return cartas.size();
    }
    public void incluir(CartaAdd){
        cartas.add(CartaAdd);
    }
    
    public Carta excluir(){
        
        
        return carta;
        
    }
    
    public boolean temCartas(){
        return cartas.isEmpty();
    }
}

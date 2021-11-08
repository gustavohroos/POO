/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package supertrunfodareciclagem;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author gustavo
 */
public class Jogador {
    private String nome;
    private Queue<Carta> cartas;
    
    public String nome(){
        return this.nome;
    }
    public int numeroDeCartas(){
        return cartas.size();
    }
    public void incluir(Carta cartaAdd){
        cartas.add(cartaAdd);
    }
    
    public Carta excluir(){
        
        Carta cartaReturn = cartas.peek();
        
        cartas.remove(cartas.peek());
        
        return cartaReturn;
        
    }
    
    public boolean temCartas(){
        return cartas.isEmpty();
    }
}

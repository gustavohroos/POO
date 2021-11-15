package supertrunfodareciclagem;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author gustavo
 */
public class Jogador {
    private String nome;
    private final Queue<Carta> cartas;

    public Jogador() {
        cartas = new LinkedList<>();
    }
    
    public String nome(){
        return this.nome;
    }
    public int numeroDeCartas(){
        return cartas.size();
    }
    public void incluir(Carta cartaAdd){
        cartas.add(cartaAdd);
    }
    
    public Carta mostrarPrimeira(){
        return cartas.peek();
    }
    
    public Carta excluir(){        
        return cartas.remove();
    }
    
    public boolean temCartas(){
        return !cartas.isEmpty();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Jogador{" + "Nome: " + nome + "\nCartas: " + cartas + '}';
    }

}

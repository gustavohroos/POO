/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supertrunfodareciclagem;

/**
 *
 * @author gustavo
 */
public abstract class Carta {
    private String nome;
    private String descricao;
    private String tipo;
    private Cor cor;
    private double decomposicao;
    private int ataque;
    
    public abstract boolean ehReciclavel();

    @Override
    public String toString() {
        return "Carta{" + "nome=" + nome + ", descricao=" + descricao + ", tipo=" + tipo + ", cor=" + cor + ", decomposicao=" + decomposicao + ", ataque=" + ataque + '}';
    }
    
    
    
}

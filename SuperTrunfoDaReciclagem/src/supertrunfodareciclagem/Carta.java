/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supertrunfodareciclagem;

import java.io.Serializable;

/**
 *
 * @author gustavo
 */
public abstract class Carta implements Serializable {
    private char[] codigo;
    private String nome;
    private String descricao;
    private String tipo;
    private Cor cor;
    private double decomposicao;
    private int ataque;
    
    public abstract boolean ehReciclavel();

    public Carta(char[] codigo, String nome, String descricao, String tipo, Cor cor, double decomposicao, int ataque) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.cor = cor;
        this.decomposicao = decomposicao;
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return ("------------------------------------\n" + "Código: " + codigo[0]+codigo[1] + 
               ", Nome: " + nome + "\nDescrição: '" + descricao + "'\nTipo: " + 
                tipo + ", Cor: " + cor + "\nDecomposicao: " + decomposicao + 
                " anos" + "\nAtaque: " + ataque + "\n");
    }
    
    
    
    
}

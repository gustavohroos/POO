/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supertrunfodareciclagem;

/**
 *
 * @author gustavo
 */
public class NaoReciclavel extends Carta {

    public NaoReciclavel(char[] codigo, String nome, String descricao, String tipo, Cor cor, double decomposicao, int ataque) {
        super(codigo, nome, descricao, tipo, cor, decomposicao, ataque);
    }

    @Override
    public boolean ehReciclavel() {
        return false;
    }
    
}

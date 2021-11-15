package supertrunfodareciclagem;

/**
 *
 * @author gustavo
 */
public class Reciclavel extends Carta {

    public Reciclavel(char codigo[], String nome, String descricao, String tipo,
                      Cor cor, double decomposicao, int ataque) {
        super(codigo, nome, descricao, tipo, cor, decomposicao, ataque);
    }

    @Override
    public boolean ehReciclavel() {
        return true;
    }
}

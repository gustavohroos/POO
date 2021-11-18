package supertrunfodareciclagem;

import java.io.Serializable;
import static java.lang.System.exit;

/**
 *
 * @author gustavo
 */
public abstract class Carta implements Serializable {
    private final char[] codigo;
    private final String nome;
    private final String descricao;
    private final String tipo;
    private final Cor cor;
    private final double decomposicao;
    private final int ataque;
    
    protected abstract boolean ehReciclavel();

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
        return ("---------------------------------------------------------------" +
                "\nNome: " + nome + "('" + codigo[0]+codigo[1] + "')" +  
                "\nDescrição: '" + descricao + "'" +
                "\nTipo: " + tipo +
                "\nCor: " + cor + 
                "\nDecomposicao: " + decomposicao + " anos" +
                "\nReciclável: " + this.ehReciclavel() +
                "\nAtaque: " + ataque + "\n" +
                "---------------------------------------------------------------\n");
    }
    
    private int comparaReciclavel(Carta carta){
        if (this.ehReciclavel() && carta.ehReciclavel()){
            return 0;
        }
        if (this.ehReciclavel() && !carta.ehReciclavel()){
            return 1;
        } else {
            return -1;
        }
    }
    
    private int comparaCor(Carta carta){
        if (this.cor.equals(carta.cor)){
            return 0;
        } else if (this.cor == Cor.VERMELHO && (carta.cor == Cor.AMARELO || carta.cor
            == Cor.VERDE || carta.cor == Cor.MARROM || carta.cor == Cor.CINZA)){
            return 1;
        } else if (this.cor == Cor.VERMELHO && (carta.cor == Cor.AZUL || carta.cor
            == Cor.LARANJA || carta.cor == Cor.ROXO || carta.cor == Cor.BRANCO)){
            return -1;
        } else if (this.cor == Cor.AZUL && (carta.cor == Cor.VERMELHO || carta.cor
            == Cor.AMARELO || carta.cor == Cor.VERDE || carta.cor == Cor.MARROM ||
            carta.cor == Cor.CINZA)){
            return 1;
        } else if (this.cor == Cor.AZUL && (carta.cor == Cor.CINZA || carta.cor
            == Cor.LARANJA || carta.cor == Cor.ROXO || carta.cor == Cor.BRANCO ||
            carta.cor == Cor.PRETO)){
            return -1;
        } else if (this.cor == Cor.AMARELO && (carta.cor == Cor.VERDE || carta.cor
            == Cor.MARROM || carta.cor == Cor.CINZA || carta.cor == Cor.PRETO ||
            carta.cor == Cor.BRANCO)){
            return 1;
        } else if (this.cor == Cor.AMARELO && (carta.cor == Cor.VERMELHO || carta.cor
            == Cor.AZUL || carta.cor == Cor.LARANJA || carta.cor == Cor.ROXO ||
            carta.cor == Cor.BRANCO)){
            return -1;
        } else if (this.cor == Cor.VERDE && (carta.cor == Cor.MARROM || carta.cor
            == Cor.CINZA || carta.cor == Cor.PRETO || carta.cor == Cor.BRANCO)){
            return 1;
        } else if (this.cor == Cor.VERDE && (carta.cor == Cor.VERMELHO || carta.cor
            == Cor.AZUL || carta.cor == Cor.AMARELO || carta.cor == Cor.ROXO)){
            return -1;
        } else if (this.cor == Cor.CINZA && (carta.cor == Cor.PRETO || carta.cor
            == Cor.BRANCO || carta.cor == Cor.LARANJA || carta.cor == Cor.ROXO ||
            carta.cor == Cor.AZUL)){
            return 1;
        } else if (this.cor == Cor.CINZA && (carta.cor == Cor.VERMELHO || carta.cor
            == Cor.AZUL || carta.cor == Cor.AMARELO || carta.cor == Cor.VERDE ||
            carta.cor == Cor.MARROM)){
            return -1;
        } else if (this.cor == Cor.LARANJA && (carta.cor == Cor.ROXO || carta.cor
            == Cor.AZUL || carta.cor == Cor.VERMELHO || carta.cor == Cor.AMARELO)){
            return 1;
        } else if (this.cor == Cor.LARANJA && (carta.cor == Cor.CINZA || carta.cor
            == Cor.MARROM || carta.cor == Cor.BRANCO || carta.cor == Cor.PRETO)){
            return -1;
        } else if (this.cor == Cor.MARROM && (carta.cor == Cor.CINZA || carta.cor
            == Cor.PRETO || carta.cor == Cor.BRANCO || carta.cor == Cor.LARANJA ||
            carta.cor == Cor.ROXO)){
            return 1;
        } else if (this.cor == Cor.MARROM && (carta.cor == Cor.VERMELHO || carta.cor
            == Cor.AZUL || carta.cor == Cor.AMARELO || carta.cor == Cor.VERDE ||
            carta.cor == Cor.ROXO)){
            return -1;
        } else if (this.cor == Cor.ROXO && (carta.cor == Cor.AZUL || carta.cor
            == Cor.VERMELHO || carta.cor == Cor.AMARELO || carta.cor == Cor.VERDE ||
            carta.cor == Cor.MARROM)){
            return 1;
        } else if (this.cor == Cor.ROXO && (carta.cor == Cor.CINZA || carta.cor
            == Cor.LARANJA || carta.cor == Cor.MARROM || carta.cor == Cor.BRANCO ||
            carta.cor == Cor.PRETO)){
            return -1;
        } else if (this.cor == Cor.BRANCO && (carta.cor == Cor.LARANJA || carta.cor
            == Cor.ROXO || carta.cor == Cor.AZUL || carta.cor == Cor.VERMELHO ||
            carta.cor == Cor.AMARELO)){
            return 1;
        } else if (this.cor == Cor.BRANCO && (carta.cor == Cor.AMARELO || carta.cor
            == Cor.VERDE || carta.cor == Cor.CINZA || carta.cor == Cor.MARROM ||
            carta.cor == Cor.PRETO)){
            return -1;
        } else if (this.cor == Cor.PRETO && (carta.cor == Cor.BRANCO || carta.cor
            == Cor.LARANJA || carta.cor == Cor.ROXO || carta.cor == Cor.AZUL)){
            return 1;
        } else if (this.cor == Cor.PRETO && (carta.cor == Cor.AMARELO || carta.cor
            == Cor.VERDE || carta.cor == Cor.CINZA || carta.cor == Cor.MARROM)){
            return -1;
        } else if ((this.cor == Cor.PRETO && carta.cor == Cor.VERMELHO) || 
            (this.cor == Cor.VERMELHO && carta.cor == Cor.PRETO) ||
            (this.cor == Cor.VERDE && carta.cor == Cor.LARANJA) ||
            (this.cor == Cor.LARANJA && carta.cor == Cor.VERDE)){
            return 0;
        } else if (this.cor == Cor.MAIOR && carta.ehReciclavel()){
            return 1;
        } else if (this.cor == Cor.MAIOR && !carta.ehReciclavel()){
            return -1;
        } else if (this.cor == Cor.MENOR && !carta.ehReciclavel()){
            return 1;
        } else if (this.cor == Cor.MENOR && carta.ehReciclavel()){
            return -1;
        }
        return 0;
    }
    
    private int comparaAtaque(Carta carta){
        if (this.ataque == carta.ataque){
            return 0;
        }
        if (this.ataque > carta.ataque){
            return 1;
        } else {
            return -1;
        }
    }
    
    private int comparaDecomposicao(Carta carta){
        if (this.decomposicao == carta.decomposicao){
            return 0;
        }
        if (this.decomposicao < carta.decomposicao){
            return 1;
        } else {
            return -1;
        }
    }
    
    public int comparar(int atributo, Carta oponente, int vez){
        int ganhou;
        switch (atributo){
            case 0 -> {
                ganhou = this.comparaCor(oponente);
                if ((vez == 0 || vez == 1) && ganhou == 0){
                    return -1;
                } else if (vez == 0 && ganhou == 1){
                    return 0;
                } else if (vez == 0 && ganhou == -1){
                    return 1;
                } else if (vez == 1 && ganhou == 1){
                    return 1;
                } else if (vez == 1 && ganhou == -1){
                    return 0;
                }
            }
            case 1 -> {
                ganhou = this.comparaDecomposicao(oponente);
                if ((vez == 0 || vez == 1) && ganhou == 0){
                    return -1;
                } else if (vez == 0 && ganhou == 1){
                    return 0;
                } else if (vez == 0 && ganhou == -1){
                    return 1;
                } else if (vez == 1 && ganhou == 1){
                    return 1;
                } else if (vez == 1 && ganhou == -1){
                    return 0;
                }
            }
            case 2 -> {
                ganhou = this.comparaReciclavel(oponente);
                if ((vez == 0 || vez == 1) && ganhou == 0){
                    return -1;
                } else if (vez == 0 && ganhou == 1){
                    return 0;
                } else if (vez == 0 && ganhou == -1){
                    return 1;
                } else if (vez == 1 && ganhou == 1){
                    return 1;
                } else if (vez == 1 && ganhou == -1){
                    return 0;
                }
            }
            case 3 -> {
                ganhou = this.comparaAtaque(oponente);
                if ((vez == 0 || vez == 1) && ganhou == 0){
                    return -1;
                } else if (vez == 0 && ganhou == 1){
                    return 0;
                } else if (vez == 0 && ganhou == -1){
                    return 1;
                } else if (vez == 1 && ganhou == 1){
                    return 1;
                } else if (vez == 1 && ganhou == -1){
                    return 0;
                }
            }
            default -> {
                System.out.println("Erro!");
                exit(0);
            }
        }
        return 0;
    }
}

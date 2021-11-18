package supertrunfodareciclagem;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 *
 * @author gustavo
 */
public class Baralho {
    private final List<Carta> baralho;
    private final Queue<Carta> empate;
    private int numeroCartas;

    public Baralho() throws FileNotFoundException {
        baralho = new ArrayList<>();
        empate = new LinkedList<>();
        leituraDoArquivo("super.csv");
        Collections.shuffle(baralho);
        numeroCartas = baralho.size();
    }
    
    private void leituraDoArquivo(String nome) {
        try{
            try (BufferedReader reader = new BufferedReader(new FileReader(nome))) {
                String linha;
                
                do {
                    linha = reader.readLine();
                    if (linha != null){
                        baralho.add(criarCarta(linha));
                    }
                } while (linha != null);
            }
        } catch (IOException ioe) {
                System.out.println("Erro: arquivo '"+ nome + "' não encontrado");
        }
    }
    
    private Carta criarCarta(String linha) {
        String[] atributos = linha.split(";");
        if ((atributos[7].equals("sim")) || atributos[7].equals("Sim")) {
            return new Reciclavel(atributos[0].toCharArray(),
                                  atributos[1],
                                  atributos[2],
                                  atributos[3],
                                  Cor.stringToCor(atributos[4]),                                  
                                  Double.parseDouble(atributos[5]),
                                  Integer.parseInt(atributos[6]));
        } else if ((atributos[7].equals("não")) ||(atributos[7].equals("Não"))){
            return new NaoReciclavel(atributos[0].toCharArray(),
                                  atributos[1],
                                  atributos[2],
                                  atributos[3],
                                  Cor.stringToCor(atributos[4]),                                  
                                  Double.parseDouble(atributos[5]),
                                  Integer.parseInt(atributos[6]));
        }
        return null;
    }

    @Override
    public String toString() {
        return "Baralho{" + baralho + '}';
    }
    
    public void distribuirCartas(Jogador j0, Jogador j1){
        int cartasPorJogador = this.numeroCartas/2;
        
        for(int i = 0; i < cartasPorJogador; i++){
            j0.incluir(this.baralho.get(numeroCartas - i - 1));
            j1.incluir(this.baralho.get(i));
        }
    }
    
    public int numeroDeCartasEmpate(){
        return empate.size();
    }
    public void incluirEmpate(Carta cartaAdd){
        empate.add(cartaAdd);
    }
    
    public Carta mostrarPrimeiraEmpate(){
        return empate.peek();
    }
    
    public Carta excluirEmpate(){        
        return empate.remove();
    }
    
    public boolean temCartasEmpate(){
        return !empate.isEmpty();
    }
    
    public void limparEmpate(){
        empate.clear();
    }
}

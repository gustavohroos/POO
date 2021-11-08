/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supertrunfodareciclagem;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author gustavo
 */
public class Baralho {
    private final List<Carta> baralho;
    private Random indice;

    public Baralho() throws FileNotFoundException {
        baralho = new ArrayList<>();
        leituraDoArquivo("super.csv");
        indice = new Random();
    }
    
    private final void leituraDoArquivo(String nome) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader(nome));
            String linha;
        
            do {
                linha = reader.readLine();
                if (linha != null){
                    baralho.add(criarCarta(linha));
                    }
            } while (linha != null);
            reader.close();
        } catch (IOException ioe) {
                System.out.println("Erro: arquivo '"+ nome + "' não encontrado");
        }
    }
    
    private final Carta criarCarta(String linha) {
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
    
    
}


package supertrunfodareciclagem;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class SuperTrunfoDaReciclagem {

    public static void main(String[] args) throws FileNotFoundException {
        Baralho baralho = new Baralho();
        int turno;
        Scanner sc = new Scanner(System.in);
        Jogador j[] = new Jogador[2];
        System.out.println("## Bem-vindo ao jogo SUPER TRUNFO DA RECICLAGEM ##");
        System.out.print("          pressione ENTER para começar");
        pressEnter();        
                
        for(int i = 0; i < 2; i++){
            j[i] = new Jogador();
            System.out.print("\nDigite o nome do jogador " + (i + 1) + ": ");
            String nome = sc.nextLine();
            j[i].setNome(nome);
        }
        
        System.out.println("\nPressione ENTER para começar o jogo");
        pressEnter();
        turno = 1;
        int vez = chooseOne();
        baralho.distribuirCartas(j[0], j[1]);
        
        while (j[0].temCartas() && j[1].temCartas()) {
            System.out.println("\nRodada " + turno);
            System.out.println("Jogador '" + j[0].nome() + "' tem " + 
                               + j[0].numeroDeCartas() + " cartas" );
            System.out.println("Jogador '" + j[1].nome() + "' tem " + 
                               + j[1].numeroDeCartas() + " cartas" );
            
            vez = jogar(baralho, j[0], j[1], vez);
            
            System.out.println("\nPressione ENTER para próxima rodada...");
            pressEnter();
            turno++;
        }
        
        System.out.println("Obrigado por jogar.  Adeus.");
    }
    
    public static int menuAtributo(Jogador j){
        int op = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("O jogador '" + j.nome() + "' deve escolher a comparação: ");
            System.out.println("\t1 - Tipo/Cor");
            System.out.println("\t2 - Decomposição");
            System.out.println("\t3 - Reciclável");
            System.out.println("\t4 - Ataque");
            System.out.print("Sua escolha: ");
            op = sc.nextInt();
        } while (op < 1 && op > 4);
        return op;
    }
    
    public static int chooseOne(){
        
        Random gerador = new Random();    
        return gerador.nextInt(2);
    }
    
    public static int jogar(Baralho baralho, Jogador j0, Jogador j1, int vez){
        
        Carta primeira, segunda;
        int atributo;
        primeira = j0.mostrarPrimeira();
        segunda = j1.mostrarPrimeira();
        switch (vez){
            case 0 -> {
                System.out.println(">>>Carta jogador 1:\n" + primeira);
                atributo = menuAtributo(j0);
                vez = primeira.comparar(atributo, segunda, vez);
                System.out.println(">>>Carta jogador 1:\n" + primeira);
                System.out.println(">>>Carta jogador 2:\n " + segunda);
                switch (vez) {
                    case 0 -> {
                        System.out.println("Jogador '" + j0.nome() +"' ganhou"
                                + ", jogue novamente");
                        j0.excluir();
                        j0.incluir(primeira);
                        j0.incluir(segunda);
                        j1.excluir();
                }
                    case -1 -> {
                        System.out.println("Empate, jogue novamente jogador '"
                                + j0.nome() + "':");
                        vez = 0;
                }
                    default -> {
                        System.out.println("Jogador '" + j1.nome() +"' ganhou, passando"
                                + " a vez...");
                        j1.excluir();
                        j1.incluir(primeira);
                        j1.incluir(segunda);
                        j0.excluir();
                }
                }
            }
            case 1 -> {
                System.out.println(">>>Carta jogador 2:\n" + segunda);
                atributo = menuAtributo(j1);
                vez = segunda.comparar(atributo, primeira, vez);
                System.out.println(">>>Carta jogador 2:\n" + segunda);
                System.out.println(">>>Carta jogador 1:\n" + primeira);
                switch (vez) {
                    case 1 -> {
                        System.out.println("Jogador '" + j1.nome() +"' ganhou"
                                + ", jogue novamente");
                        j1.excluir();
                        j1.incluir(primeira);
                        j1.incluir(segunda);
                        j0.excluir();
                }
                    case -1 -> {
                        System.out.println("Empate, jogue novamente jogador '"
                                + j1.nome() + "':");
                        vez = 1;
                }
                    default -> {
                        System.out.println("Jogador '" + j0.nome() +"' ganhou, passando"
                                + " a vez...");
                        j0.excluir();
                        j0.incluir(primeira);
                        j0.incluir(segunda);
                        j1.excluir();
                }
                }
            }
        }
                
        return vez;
        
    }
    
    public static void pressEnter(){
        Scanner sc = new Scanner(System.in);
        String lixo = sc.nextLine();
    }
}

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
        clearScr();
        System.out.println("## Bem-vindo ao jogo SUPER TRUNFO DA RECICLAGEM ##");
        System.out.print("          pressione ENTER para começar");
        pressEnter();        
                
        for(int i = 0; i < 2; i++){
            j[i] = new Jogador();
            System.out.print("\nDigite o nome do jogador " + (i + 1) + ": ");
            String nome = sc.nextLine();
            j[i].setNome(nome);
        }
        
        int jogo = menuInicio();
        
        System.out.println("\nPressione ENTER para começar o jogo\n");
        pressEnter();
        clearScr();
        turno = 1;
        int vez = chooseOne();
        baralho.distribuirCartas(j[0], j[1]);
        
        switch (jogo){
            case 1 -> turno = simularJogo(baralho, j[0], j[1], vez, turno);
            case 2 -> turno = jogoInterface(baralho, j[0], j[1], vez, turno);
        }
        
        System.out.println("\nRodada " + turno);
        System.out.println("Jogador '" + j[0].nome() + "' tem " + 
                            + j[0].numeroDeCartas() + " cartas" );
        System.out.println("Jogador '" + j[1].nome() + "' tem " + 
                            + j[1].numeroDeCartas() + " cartas" );
        System.out.println("Montante empatado: " + baralho.numeroDeCartasEmpate());
        
        if(j[0].temCartas()){
            System.out.println("\n\n\nParabéns '" + j[0].nome() + "', você venceu!");
        } else {
            System.out.println("\n\n\nParabéns '" + j[1].nome() + "', você venceu!");
        }
        
        System.out.println("Obrigado por jogar.  Adeus.");
    }
    
    public static int menuAtributo(Jogador j){
        int op = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("O jogador '" + j.nome() + "' deve escolher a comparação: ");
            System.out.println("\t0 - Tipo/Cor");
            System.out.println("\t1 - Decomposição");
            System.out.println("\t2 - Reciclável");
            System.out.println("\t3 - Ataque");
            System.out.print("Sua escolha: ");
            op = sc.nextInt();
            clearScr();
        } while (op < 0 || op > 3);
        return op;
    }
    
    public static int menuInicio(){
        int op = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n\nDeseja simular ou jogar o jogo com interface?");
            System.out.println("\t1 - Simular");
            System.out.println("\t2 - Jogar com interface");
            System.out.print("Sua escolha: ");
            op = sc.nextInt();
            clearScr();
        } while (op < 1 || op > 2);
        return op;
    }
    
    public static int simularJogo(Baralho baralho, Jogador j0, Jogador j1,
                                   int vez, int turno){
        while (j0.temCartas() && j1.temCartas()) {
            System.out.println("\nRodada " + turno);
            System.out.println("Jogador '" + j0.nome() + "' tem " + 
                               + j0.numeroDeCartas() + " cartas" );
            System.out.println("Jogador '" + j1.nome() + "' tem " + 
                               + j1.numeroDeCartas() + " cartas" );
            
            vez = jogarSimulacao(baralho, j0, j1, vez);
            turno++;
        }
        return turno;
    }
    
    public static int jogarSimulacao(Baralho baralho, Jogador j0, Jogador j1, int vez){
        
        Carta primeira, segunda;
        int atributo;
        primeira = j0.mostrarPrimeira();
        segunda = j1.mostrarPrimeira();
        switch (vez){
            case 0 -> {
                atributo = chooseAtributo();
                vez = primeira.comparar(atributo, segunda, vez);
                System.out.println(">>>Carta jogador 1:\n" + primeira);
                System.out.println(">>>Carta jogador 2:\n " + segunda);
                System.out.println(">>>Atributo escolhido:\n" + atributo);
                switch (vez) {
                    case 0 -> {
                        System.out.println("Jogador '" + j0.nome() +"' ganhou"
                                + ", jogue novamente");
                        j1.excluir();
                        j0.excluir();
                        j0.incluir(primeira);
                        j0.incluir(segunda);
                        if (baralho.temCartasEmpate()){
                            while (baralho.temCartasEmpate()){
                                j0.incluir(baralho.excluirEmpate());
                            }
                            baralho.limparEmpate();
                        }
                    }
                    case -1 -> {
                        System.out.println("Empate, jogue novamente jogador '"
                                + j0.nome() + "':");
                        j0.excluir();
                        j1.excluir();
                        baralho.incluirEmpate(primeira);
                        baralho.incluirEmpate(segunda);
                        System.out.println("Montante empatado: " + baralho.numeroDeCartasEmpate());
                        vez = 0;
                    }
                    default -> {
                        System.out.println("Jogador '" + j1.nome() +"' ganhou, passando"
                                + " a vez...");
                        j0.excluir();
                        j1.excluir();
                        j1.incluir(primeira);
                        j1.incluir(segunda);
                        if (baralho.temCartasEmpate()){
                            while (baralho.temCartasEmpate()){
                                j1.incluir(baralho.excluirEmpate());
                            }
                            baralho.limparEmpate();
                        }
                    }
                }
            }
            case 1 -> {
                atributo = chooseAtributo();
                vez = segunda.comparar(atributo, primeira, vez);
                System.out.println(">>>Carta jogador 1:\n" + primeira);
                System.out.println(">>>Carta jogador 2:\n" + segunda);                
                switch (vez) {
                    case 1 -> {
                        System.out.println("Jogador '" + j1.nome() +"' ganhou"
                                + ", jogue novamente");
                        j0.excluir();
                        j1.excluir();
                        j1.incluir(primeira);
                        j1.incluir(segunda);                        
                        if (baralho.temCartasEmpate()){
                            while (baralho.temCartasEmpate()){
                                j1.incluir(baralho.excluirEmpate());
                            }
                            baralho.limparEmpate();
                        }
                    }
                    case -1 -> {
                        System.out.println("Empate, jogue novamente jogador '"
                                + j1.nome() + "':");
                        j0.excluir();
                        j1.excluir();
                        baralho.incluirEmpate(primeira);
                        baralho.incluirEmpate(segunda);
                        System.out.println("Montante empatado: " + baralho.numeroDeCartasEmpate());
                        vez = 1;
                    }
                    default -> {
                        System.out.println("Jogador '" + j0.nome() +"' ganhou, passando"
                                + " a vez...");
                        j1.excluir();
                        j0.excluir();
                        j0.incluir(primeira);
                        j0.incluir(segunda);
                        if (baralho.temCartasEmpate()){
                            while (baralho.temCartasEmpate()){
                                j0.incluir(baralho.excluirEmpate());
                            }
                            baralho.limparEmpate();
                        }
                    }
                }
            }
        }
                
        return vez;
        
    }
    
    public static int jogoInterface(Baralho baralho, Jogador j0, Jogador j1,
                                      int vez, int turno){
        while (j0.temCartas() && j1.temCartas()) {
            System.out.println("\nRodada " + turno);
            System.out.println("Jogador '" + j0.nome() + "' tem " + 
                               + j0.numeroDeCartas() + " cartas" );
            System.out.println("Jogador '" + j1.nome() + "' tem " + 
                               + j1.numeroDeCartas() + " cartas" );
            
            vez = jogarInterface(baralho, j0, j1, vez);
            
            System.out.println("\nPressione ENTER para próxima rodada...");
            pressEnter();
            turno++;
            clearScr();
        }
        return turno;
    }
    
    public static int jogarInterface(Baralho baralho, Jogador j0, Jogador j1, int vez){
        
        
        Carta primeira, segunda;
        int atributo;
        primeira = j0.mostrarPrimeira();
        segunda = j1.mostrarPrimeira();
        switch (vez){
            case 0 -> {
                System.out.println(">>>Vez do jogador '" + j0.nome() + "'");
                System.out.println(">>>Carta jogador 1:\n" + primeira);
                atributo = menuAtributo(j0);
                vez = primeira.comparar(atributo, segunda, vez);
                System.out.println(">>>Carta jogador 1:\n" + primeira);
                System.out.println(">>>Carta jogador 2:\n " + segunda);
                switch (vez) {
                    case 0 -> {
                        System.out.println("Jogador '" + j0.nome() +"' ganhou"
                                + ", jogue novamente");
                        j1.excluir();
                        j0.excluir();
                        j0.incluir(primeira);
                        j0.incluir(segunda);
                        if (baralho.temCartasEmpate()){
                            while (!baralho.temCartasEmpate()){
                                j0.incluir(baralho.excluirEmpate());
                            }
                            baralho.limparEmpate();
                        }
                    }
                    case -1 -> {
                        System.out.println("Empate, jogue novamente jogador '"
                                + j0.nome() + "':");
                        j0.excluir();
                        j1.excluir();
                        baralho.incluirEmpate(primeira);
                        baralho.incluirEmpate(segunda);
                        System.out.println("Montante empatado: " + baralho.numeroDeCartasEmpate());
                        vez = 0;
                    }
                    default -> {
                        System.out.println("Jogador '" + j1.nome() +"' ganhou, passando"
                                + " a vez...");
                        j0.excluir();
                        j1.excluir();
                        j1.incluir(primeira);
                        j1.incluir(segunda);
                        if (baralho.temCartasEmpate()){
                            while (!baralho.temCartasEmpate()){
                                j1.incluir(baralho.excluirEmpate());
                            }
                            baralho.limparEmpate();
                        }
                    }
                }
            }
            case 1 -> {
                System.out.println(">>>Vez do jogador '" + j1.nome());
                System.out.println(">>>Carta jogador 2:\n" + segunda);
                atributo = menuAtributo(j1);
                vez = segunda.comparar(atributo, primeira, vez);
                System.out.println(">>>Carta jogador 2:\n" + segunda);
                System.out.println(">>>Carta jogador 1:\n" + primeira);
                switch (vez) {
                    case 1 -> {
                        System.out.println("Jogador '" + j1.nome() +"' ganhou"
                                + ", jogue novamente");
                        j0.excluir();
                        j1.excluir();
                        j1.incluir(primeira);
                        j1.incluir(segunda);                        
                        if (baralho.temCartasEmpate()){
                            while (!baralho.temCartasEmpate()){
                                j1.incluir(baralho.excluirEmpate());
                            }
                            baralho.limparEmpate();
                        }
                    }
                    case -1 -> {
                        System.out.println("Empate, jogue novamente jogador '"
                                + j1.nome() + "':");
                        j0.excluir();
                        j1.excluir();
                        baralho.incluirEmpate(primeira);
                        baralho.incluirEmpate(segunda);
                        System.out.println("Montante empatado: " + baralho.numeroDeCartasEmpate());
                        vez = 1;
                    }
                    default -> {
                        System.out.println("Jogador '" + j0.nome() +"' ganhou, passando"
                                + " a vez...");
                        j1.excluir();
                        j0.excluir();
                        j0.incluir(primeira);
                        j0.incluir(segunda);
                        if (baralho.temCartasEmpate()){
                            while (!baralho.temCartasEmpate()){
                                j0.incluir(baralho.excluirEmpate());
                            }
                            baralho.limparEmpate();
                        }
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
    
    public static void clearScr(){
        for (int i = 0; i < 100; i++){
            System.out.println("\n");
        }
    }
    
    public static int chooseOne(){
        
        Random gerador = new Random();    
        return gerador.nextInt(2);
    }
     
    public static int chooseAtributo(){
        
        Random gerador = new Random();    
        return gerador.nextInt(4);
    }
}

import java.util.Scanner;


public class Lembretes {
    private String nome;
    private String descricao;
    private String data;
    public int size;

    public Lembretes(String data, String nome, String descricao) {
        this.data = data;
        this.nome = nome;
        this.descricao = descricao;
    }

    // public class BlocoDeLembretes {

        Lembretes[] listaDeLembretes = new Lembretes[10];
      
    // }

    public void Imprimir() {
        
        for (int i = 0; i < size; i++) {
            System.out.println("Lembrete [" + i + "] Data: " + listaDeLembretes[i].data + " Nome: " + listaDeLembretes[i].nome + " Descricao: " + listaDeLembretes[i].descricao);
        }

    }

    public void incluirLembrete() {
        
        int i;
        i = size;
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("Insira a data do lembrete: ");
        listaDeLembretes[i + 1].data = entrada.next();
        
        size++;

    }

}

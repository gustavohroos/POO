package testevetores;

public class Cliente {
    private String CPF;
    private String nome;

    Cliente(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println("###########################");
        System.out.println("CPF: " + CPF);
        System.out.println("Nome: " + nome);
    }
}

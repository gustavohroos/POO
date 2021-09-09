public class Lembrete {
    private String data;
    private String nome;
    private String descricao;

    Lembrete(String data, String nome, String descricao) {
        this.data = data;
        this.nome = nome;
        this.descricao = descricao;
    }

    public void imprimir() {
        System.out.println("###########################");
        System.out.println("Data: " + data);
        System.out.println("Nome: " + nome);
        System.out.println("Descriçao: " + descricao);
    }
}

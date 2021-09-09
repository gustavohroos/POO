import CadastroDeLembretes.java;

public static void main(String[] args) {
    CadastroDeLembretes cadastro = new CadastroDeLembretes();
    
    System.out.println("Comprimento do Vetor: " + cadastro.listaDeLembretes.length);
    cadastro.incluir(new Lembrete("10/09/2021", "Gustavo", "Terminar Lista de Linguagens Formais"));
    cadastro.incluir(new Lembrete("24/09/2021", "Aviso", "Terminar Lista de sei la oq"));
    cadastro.incluir(new Lembrete("12/09/2021", "POO", "Fazer a lista 2"));
    cadastro.incluir(new Lembrete("11/09/2021", "Gibim", "Terminar de bater no giba"));
    cadastro.incluir(new Lembrete("09/09/2021", "Marco Orelha", "Terminar Lista de hentai"));
    cadastro.imprimir();
    System.out.println("#################\nQuantidade de lembretes cadastrados: " + cadastro.numeroDeLembretes);
}

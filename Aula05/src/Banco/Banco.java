package Banco;


public class Banco {

    
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta("1111");
        c1.setNome("Jubileu");
        c1.abrirConta("CC");
        c1.imprimir();
        ContaBanco c2 = new ContaBanco();
        c2.setNumConta("2222");
        c2.setNome("Jubiléia");
        c2.abrirConta("CP");
        c2.imprimir();
        
        c1.depositar(1550.60f);
        c1.imprimir();
    }
    
}

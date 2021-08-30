package testevetores;

public class CadastroDeClientes {
    private Cliente[] listaDeClientes;
    private int numeroDeClientes;

    CadastroDeClientes() {
        this.listaDeClientes = new Cliente[10];
        numeroDeClientes = 0;
    }

    public void imprimir() {
        int i;
        for (i = 0; i < numeroDeClientes; i++) {
            listaDeClientes[i].imprimir();
        }
    }
    public boolean incluir(Cliente c) {
        if (numeroDeClientes < listaDeClientes.length) {
            listaDeClientes[numeroDeClientes++] = c;
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        CadastroDeClientes cadastro = new CadastroDeClientes();
        
        System.out.println("Comprimento do Vetor: " + cadastro.listaDeClientes.length);
        cadastro.incluir(new Cliente("99999999999", "Gustavo"));
        cadastro.incluir(new Cliente("88888888888", "Henrique"));
        cadastro.incluir(new Cliente("77777777777", "Giba"));
        cadastro.imprimir();
        System.out.println("Quantidade de clientes cadastrados: " + cadastro.numeroDeClientes);
    }
}

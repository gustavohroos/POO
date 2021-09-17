/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeclientes;

/**
 *
 * @author Felipe Marques
 */
public class CadastroDeClientes {
    private Cliente[] listaDeClientes;
    private int numeroDeClientes;
    
    CadastroDeClientes() {
        this.listaDeClientes = new Cliente[10];
        numeroDeClientes = 0;
    }
    
    public boolean incluir(Cliente c) {
        if (numeroDeClientes < listaDeClientes.length) {
            listaDeClientes[numeroDeClientes++] = c;
            return true;
        }
        return false;
    } 
    
    public void imprimir() {
        int i;
        for (i = 0; i < numeroDeClientes; i++)
            listaDeClientes[i].imprimir();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadastroDeClientes cadastro = new CadastroDeClientes();
        
        System.out.println("Comprimento do Vetor: " + cadastro.listaDeClientes.length);
        
        Cliente cx = new Cliente("99999999999", "Felipe");
        cadastro.incluir(cx);
   
        cadastro.incluir(new Cliente("66666666666", "Guilherme"));      
        
        cadastro.imprimir();
    }
    
}

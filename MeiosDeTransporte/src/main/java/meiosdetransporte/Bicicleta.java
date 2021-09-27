/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meiosdetransporte;

/**
 *
 * @author gustavo
 */
public class Bicicleta extends Veiculo {
    private boolean bagageiro;
    private int numeroDeMarchas;
    
    public Bicicleta(String marca, String modelo, int numeroDeRodas,
            int numeroDeMarchas, boolean bagageiro) {
        super(marca, modelo, numeroDeRodas);
        this.bagageiro = bagageiro;
        this.numeroDeMarchas = numeroDeMarchas;        
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Número de Marchas: " + numeroDeMarchas);
        System.out.println(bagageiro?"Tem bagageiro":"Não tem bagageiro");
    }
}

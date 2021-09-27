/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meiosdetransporte;

/**
 *
 * @author gustavo
 */
public class Carro extends Automovel{
    private int quantidadeDePortas;
    public Carro(String marca, String modelo, int numeroDeRodas,
            double potenciaDoMotor, int quantidadeDePortas){
        super(marca, modelo, numeroDeRodas, potenciaDoMotor);
        this.quantidadeDePortas = quantidadeDePortas;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Quantidade de portas: " + quantidadeDePortas);
    }
    
}

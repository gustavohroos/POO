/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meiosdetransporte;

/**
 *
 * @author gustavo
 */
public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int numeroDeRodas;
    // private int velocidade;
    
    public Veiculo(String marca, String modelo, int numeroDeRodas){
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDeRodas = numeroDeRodas;
    }
    
    public void imprimir(){
        System.out.println("###################################");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Múmero de rodas: " + numeroDeRodas);
    }
    
    public void acelerar(){
        
    }
}

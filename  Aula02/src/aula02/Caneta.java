/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author gustavo
 */
public class Caneta {
    private String modelo;
    private String cor;
    private boolean tampada;
    private float ponta;
    private int carga;
    
    public Caneta(String modelo, String cor, boolean tampada,
            float ponta, int carga) {
        this.modelo = modelo;
        this.cor = cor;
        this.tampada = tampada;
        this.ponta = ponta;
        this.carga = carga;
    }
    
    void imprimir(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Com carga em " + this.carga + "%");
        System.out.println(tampada?"Está tampada":"Está destampada");
    }
    
    void rabiscar(){
        if (this.tampada = true){
            destampar();
        }
        System.out.println("Rabiiissscoooo");
        this.tampada = true;
        
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}

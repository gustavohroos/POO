/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author gustavo
 */
public class Caneta {
    public String modelo;
    private String cor;
    private boolean tampada;
    private float ponta;
    private int carga;

    public Caneta() {
        this.tampada = true;
        this.carga = 100;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public float getPonta() {
        return ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void imprimir(){
        System.out.println("Caneta " + getCor() + " da marca " + getModelo() + " com ponta " + getPonta() + " carga em " + getCarga() + "%");
        System.out.println(isTampada()?"Está tampada":"Não está tampada");
    }
    
    
}

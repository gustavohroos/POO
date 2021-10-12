/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author gustavo
 */
public class ContaBanco {
    private float saldo;
    private String nome;
    private boolean status;
    protected String tipo;
    public String numConta;

    public ContaBanco() {
        this.saldo = 0.f;
        this.status = false;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isStatus() {
        return status;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    
    public void abrirConta(String t){
        setStatus(true);
        setTipo(t);
        if (t.equals("CC")){
            setSaldo(50.f);
        } else if(t.equals("CP")){
                setSaldo(150.f);
            }
    }
    
    public void fecharConta(){
        setStatus(false);
    }
    
    public void depositar(float d){
        if(isStatus()){
        setSaldo(this.saldo + d);
        }
    }
    
    public void sacar(float s){
        if(this.saldo >= s){
            System.out.println("Saldo antigo: " + this.saldo);
            setSaldo(this.saldo - s);
            System.out.println("Saldo atual: " + this.saldo);
        } else{
            System.out.println("Erro! Saldo insuficiente");
        }
    }
    
    public void pagarMensal(){
        if(this.tipo.equals("CC")){
            setSaldo(this.saldo - 12);
        } else if(this.tipo.equals("CP")){
            setSaldo(this.saldo - 20);
        } else {
            System.out.println("Erro! Tipod de conta não identificado.");
        }
    }
    
    public void imprimir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Numero da conta: " + getNumConta());
        System.out.println("Tipo da conta: " + getTipo());
        System.out.println("Saldo da conta: " + getSaldo());
        System.out.println(isStatus()?"Conta aberta":"Conta fechada");
    }
}


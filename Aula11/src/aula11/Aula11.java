/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11;

/**
 *
 * @author gustavo
 */
public class Aula11 {

    public static void main(String[] args) {
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Visitante p4 = new Visitante();
        
        p2.setNome("João");
        p3.setNome("Maria");
        p4.setNome("Gustavo");
        
        p2.setCurso("Cincia da computação");
        p3.setSalario(14530.60f);
        
        System.out.println(p2.toString());
        
    }
    
}

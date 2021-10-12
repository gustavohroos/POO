/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10;

/**
 *
 * @author gustavo
 */
public class Aula10 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("João");
        p3.setNome("Maria");
        p4.setNome("Gustavo");
        
        p1.setIdade(14);
        p2.setCurso("Cincia da computação");
        p3.setSalario(14530.60f);
        p4.setTrabalhando(true);
        
        System.out.println(p2.toString());
        System.out.println(p1.toString());
    }
    
}

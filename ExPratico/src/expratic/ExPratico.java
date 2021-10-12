/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expratic;

/**
 *
 * @author gustavo
 */
public class ExPratico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[5];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Gustavo", 19, "M");
        p[2] = new Pessoa("Maria", 18, "F");
        
        l[0] = new Livro("Harry Potter", "JK Rowling", 300, p[0]);
        l[1] = new Livro("Animais Fantasticos", "JK Rowling", 300, p[2]);
        l[2] = new Livro("Seja foda", "Caio Carneiro", 207 , p[0]);
        l[3] = new Livro("C Completo & Total ", "Herbert Schildt", 800, p[1]);
        l[4] = new Livro("Logica para computação", "Gersting", 1000, p[1]);
        
        
        System.out.println(l[3].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
    
}

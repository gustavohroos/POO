/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14;

/**
 *
 * @author gustavo
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[5];
        v[0] = new Video("Aula 1 de Java");
        v[1] = new Video("Aula 2 de Java");
        v[2] = new Video("Aula 3 de Java");
        v[3] = new Video("Aula 4 de Java");
        v[4] = new Video("Aula 5 de Java");
        
        Gafanhoto p0 = new Gafanhoto("Juvenal", 19, "M", "juba123");
        Gafanhoto p1 = new Gafanhoto("Maria", 18, "F", "dudaatt");
        Gafanhoto p2 = new Gafanhoto("Bianca", 19, "F", "biazinha1");
        Gafanhoto p3 = new Gafanhoto("Alexandre", 45, "M", "xand404");
        Gafanhoto p4 = new Gafanhoto("Marlei", 40, "F", "marlei&eu");
        
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(v[3].toString());
        System.out.println(v[4].toString());
        System.out.println(p0.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}

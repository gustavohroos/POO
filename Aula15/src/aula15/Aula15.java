/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula15;

/**
 *
 * @author gustavo
 */
public class Aula15 {

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
        
        Gafanhoto p1 = new Gafanhoto("Maria", 18, "F", "dudaatt");
        Gafanhoto p2 = new Gafanhoto("Bianca", 19, "F", "biazinha1");
        Gafanhoto p3 = new Gafanhoto("Alexandre", 45, "M", "xand404");
        Gafanhoto p4 = new Gafanhoto("Marlei", 40, "F", "marlei&eu");
        
        System.out.println("VÍDEOS ################");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(v[3].toString());
        System.out.println(v[4].toString());
        System.out.println("GAFANHOTOS ################");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println("VISUALIZAÇÕES ################");
        
        Visualizacao v0 = new Visualizacao(p3, v[0]); //xand404 assiste aula 1
        v0.avaliar(8);
        Visualizacao v2 = new Visualizacao(p1, v[0]); //dudaatt assiste aula 1
        v2.avaliar(8);
        Visualizacao v3 = new Visualizacao(p2, v[0]); //biazinha1 assiste aula 1
        v3.avaliar(90.0f);
        Visualizacao v4 = new Visualizacao(p4, v[0]); //marley&eu assiste aula 1
        v4.avaliar(10);
        Visualizacao v5 = new Visualizacao(p4, v[0]); //marley&eu assiste aula 1
        v5.avaliar(10);
        Visualizacao v6 = new Visualizacao(p4, v[0]); //marley&eu assiste aula 1
        v6.avaliar(10);
        Visualizacao v7 = new Visualizacao(p4, v[0]); //marley&eu assiste aula 1
        v7.avaliar(100);
        
        System.out.println(v[0].toString());
        
        System.out.println("GAFANHOTOS ################");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(v4.toString());
    }
    
}

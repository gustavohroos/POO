/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13;

/**
 *
 * @author gustavo
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        
        c.reagir("Vai apanhar");
        c.reagir("Olá");
        c.reagir(false);
        c.reagir(true);
        c.reagir(9, 10);
        c.reagir(15, 30);
        c.reagir(21, 00);
        c.reagir(7, 8.56f);
        c.reagir(14, 29.56f);
        c.reagir(2, 40.56f);
    }
    
}

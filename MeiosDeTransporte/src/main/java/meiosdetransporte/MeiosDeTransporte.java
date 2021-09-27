/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meiosdetransporte;

/**
 *
 * @author gustavo
 */
public class MeiosDeTransporte {
        public static void main(String[] args){
            Veiculo b = new Bicicleta ("Bike", "Wendy", 2, 18, false);
            Veiculo m = new Moto ("Honda", "CG", 2, 50, true);
            Veiculo c = new Carro ("GM", "Opala", 4, 180, 4);
            
            //v.acelerar(50);
            b.imprimir();
            m.imprimir();
            c.imprimir();
        }
}

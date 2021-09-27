/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meiosdetransporte;

/**
 *
 * @author gustavo
 */
public abstract class Automovel extends Veiculo{
    private double potenciaDoMotor;
    
    public Automovel(String marca, String modelo, int numeroDeRodas,
                    double potenciaDoMotor){
        super(marca, modelo, numeroDeRodas);
        this.potenciaDoMotor = potenciaDoMotor;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Potência do motor: " + potenciaDoMotor);
    }
}

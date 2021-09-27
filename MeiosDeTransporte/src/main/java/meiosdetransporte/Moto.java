/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meiosdetransporte;

/**
 *
 * @author gustavo
 */
public class Moto extends Automovel{
    private boolean partidaEletrica;
    public Moto(String marca, String modelo, int numeroDeRodas,
            double potenciaDoMotor, boolean partidaEletrica){
        super(marca, modelo, numeroDeRodas, potenciaDoMotor);
        this.partidaEletrica = partidaEletrica;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println(partidaEletrica?"Tem partida elétrica":
                            "Não tem partida elétrica");
    }
}

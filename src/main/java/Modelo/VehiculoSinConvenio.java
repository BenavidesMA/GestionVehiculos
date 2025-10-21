/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Miguel
 */
public class VehiculoSinConvenio extends Vehiculo{
    
    String aseguradora;

    public VehiculoSinConvenio(String placa, String modelo, Propietario propietario, String aseguradora) {
        super(placa, modelo, propietario);
        this.aseguradora = aseguradora;
    }
    
    @Override
    
    public String adicionarReparacion(Reparacion nvaReparacion){
    String message = "";
    return message;
    }
}

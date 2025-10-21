/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Miguel
 */
public class VehiculoConConvenio extends Vehiculo{
    
    String fechaAfiliacion;
    
    public VehiculoConConvenio(String placa, String modelo, Propietario propietario, String fechaAfiliacion) {
        super(placa, modelo, propietario);
        this.fechaAfiliacion = fechaAfiliacion;
    }
    
    @Override
    
    public String adicionarReparacion(Reparacion nvaReparacion){
    String message = "";
    return message;
    }
}

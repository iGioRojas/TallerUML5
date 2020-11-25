/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actores;

import Clinica.Cita;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author GeovannyRojas
 */
public class Secretaria extends Persona {
    protected Doctor doc;
    protected Cita citas;

    public Secretaria(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Cita citas) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.citas = citas;
    }
    
    public boolean verificarCita()
    {
        return true;
    }
    
    public void agendarCita()
    {
        
    }
    
}

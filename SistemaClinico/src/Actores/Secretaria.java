/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actores;

import java.util.Date;

/**
 *
 * @author GeovannyRojas
 */
public class Secretaria extends Persona {
    protected Doctor doc;

    public Secretaria(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
    }
    
    public boolean verificarCita()
    {
        return true;
    }
    
    public void agendarCita()
    {
        
    }
    
}

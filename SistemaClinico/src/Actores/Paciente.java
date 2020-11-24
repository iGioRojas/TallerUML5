/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actores;

import Clinica.Cita;
import Clinica.HistoriaClinica;
import java.util.Date;

/**
 *
 * @author GeovannyRojas
 */
public class Paciente extends Persona{
    protected String email;
    protected HistoriaClinica historiaClinica;
    protected Cita cita;
    public Paciente(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean solicitarCita()
    {
        return true;
    }
   
    
    
}

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
public class Doctor extends Persona{
    protected int regDoctor;
    protected String especialidad;
    protected Secretaria ayudante;
    
    public Doctor(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, int regDoctor, String especialidad) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
    }
    
    public void recetar()
    {
        
    }
    
    public void agregarPlanNut()
    {
        
    }
    
    public void imprimirReceta()
    {
        
    }
    
    public void registraSecretaria(Secretaria sec)
    {
        this.ayudante = sec;
    }
    
    
}

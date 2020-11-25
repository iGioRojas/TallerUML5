/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actores;

import Clinica.Cita;
import Clinica.HistoriaClinica;
import Utilidad.Receta;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author GeovannyRojas
 */
public class Paciente extends Persona{
    protected String email;
    protected HistoriaClinica historiaClinica;
    protected ArrayList<Receta> recetas;
    protected Cita cita;
    protected boolean estadoAtención;
    public Paciente(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac,HistoriaClinica historiaClinica,ArrayList<Receta> recetas) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.historiaClinica=historiaClinica;
        this.recetas=recetas;
    }

    public void setEstadoAtención(boolean estado) {
        this.estadoAtención = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean solicitarCita()
    {
        java.util.Date fecha = new Date();
        Doctor doc= new Doctor("doc","****","Juan","Valdez","042589631","El Puyo",fecha,1234,"pediatria",new ArrayList<>(),new ArrayList<>());
        Cita c= new Cita(fecha,false,this.nombre,doc,this);
        doc.citasPendientes.add(c);
        System.out.println("email enviado !!");
        return true;
    }
   
    
    
}

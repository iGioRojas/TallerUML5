/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actores;

import Clinica.Cita;
import Utilidad.Receta;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author GeovannyRojas
 */
public class Doctor extends Persona{
    protected int regDoctor;
    protected String especialidad;
    protected Secretaria ayudante;
    protected ArrayList<Cita> citasPendientes;
    protected ArrayList<Receta> recetas;

    public Doctor(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, int regDoctor, String especialidad,ArrayList<Cita> citasPendientes, ArrayList<Receta> recetas) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
        this.citasPendientes=citasPendientes;
        this.recetas=recetas;
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
    public void atenderPaciente(Paciente p){
        for(Cita c: citasPendientes){
            if(c.getPaciente().equals(p))
                c.getPaciente().setEstadoAtención(true); //true hace referencia a que se lo ha atendido
                this.recetar();
                this.imprimirReceta();
            System.out.println("receta enviada a su correo");


        }


    }
    
    
}

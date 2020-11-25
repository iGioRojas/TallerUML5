/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinica;

import Actores.Doctor;
import Actores.Paciente;
import Pago.Pago;
import java.util.Date;

/**
 *
 * @author GeovannyRojas
 */
public class Cita implements Pago {
    protected Date fecha;  //DateTime
    protected boolean pagada;
    protected String registradoPor;
    protected Doctor doc;
    protected Paciente paciente;

    public Cita(Date fecha, boolean pagada, String registradoPor, Doctor doc, Paciente paciente){
        this.fecha=fecha;
        this.pagada=pagada;
        this.registradoPor=registradoPor;
        this.doc=doc;
        this.paciente=paciente;

    }
    public Paciente getPaciente(){
        return this.paciente;

    }
    @Override
    public boolean realizarPago(float monto) {
        return true;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinica;

import Actores.Doctor;
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
    
    @Override
    public boolean realizarPago(float monto) {
        return true;
    }
    
}

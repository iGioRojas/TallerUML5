/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

import Actores.Doctor;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author GeovannyRojas
 */
public class Receta {
    protected PlanNutricional planNut;
    protected Date fecha;  //DateTime
    protected ArrayList<Medicamento> medicamentos = new ArrayList<>();
    protected Doctor doctor;
    public Receta(PlanNutricional planNut, Date fecha, Doctor doctor) {
        this.planNut = planNut;
        this.fecha = fecha;
        this.doctor=doctor;
    }

    public PlanNutricional getPlanNut() {
        return planNut;
    }

    public void setPlanNut(PlanNutricional planNut) {
        this.planNut = planNut;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void añadirMedicamento(Medicamento m)
    {
        medicamentos.add(m);
    }
    
    public void quitarMedicamento(Medicamento m)
    {
        medicamentos.remove(m);
    }
    
}

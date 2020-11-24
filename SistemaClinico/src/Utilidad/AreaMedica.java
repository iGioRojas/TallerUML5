/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

import java.util.ArrayList;

/**
 *
 * @author GeovannyRojas
 */
public class AreaMedica {
    protected String especialidad;
    protected float costo;
    protected ArrayList<Medicamento> medicamentos = new ArrayList<>();

    public AreaMedica(String especialidad, float costo) {
        this.especialidad = especialidad;
        this.costo = costo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    
    
    
}

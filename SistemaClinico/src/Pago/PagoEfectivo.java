/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pago;

/**
 *
 * @author GeovannyRojas
 */
public class PagoEfectivo implements Pago {
    protected float monto;
 
    @Override
    public boolean realizarPago(float monto) {
        return true;
    }

    public PagoEfectivo(float monto) {
        this.monto = monto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
    
}

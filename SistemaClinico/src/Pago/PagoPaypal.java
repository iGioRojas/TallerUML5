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
public class PagoPaypal implements Pago{

    protected float monto;
    protected String email;

    public PagoPaypal(float monto, String email) {
        this.monto = monto;
        this.email = email;
    }
    
    
    @Override
    public boolean realizarPago(float monto) {
        return true;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
    
}

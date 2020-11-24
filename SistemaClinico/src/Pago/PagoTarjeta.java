/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pago;

import java.util.Date;

/**
 *
 * @author GeovannyRojas
 */
public class PagoTarjeta implements Pago {

    protected float monto;
    protected String numero;
    protected Date expira;
    protected String propietario;
    protected String banco;

    public PagoTarjeta(float monto, String numero, Date expira, String propietario, String banco) {
        this.monto = monto;
        this.numero = numero;
        this.expira = expira;
        this.propietario = propietario;
        this.banco = banco;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getExpira() {
        return expira;
    }

    public void setExpira(Date expira) {
        this.expira = expira;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    
    
    
}

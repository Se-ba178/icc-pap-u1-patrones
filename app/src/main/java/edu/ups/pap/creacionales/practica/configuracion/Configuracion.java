package edu.ups.pap.creacionales.practica.configuracion;

public class Configuracion {

    private static Configuracion instancia = new Configuracion();

    private double impuesto = 15.0;

    private Configuracion() {
    }

    public static Configuracion getInstancia() {
        return instancia;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

}

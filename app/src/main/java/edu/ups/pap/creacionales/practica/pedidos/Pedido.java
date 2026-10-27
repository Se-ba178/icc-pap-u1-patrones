package edu.ups.pap.creacionales.practica.pedidos;

import edu.ups.pap.creacionales.practica.configuracion.Configuracion;

public abstract class Pedido {

    private String codigo;
    private String cliente;
    private double subtotal;

    private double impuesto;
    private double total;

    public Pedido(String codigo, String cliente, double subtotal) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.subtotal = subtotal;
    }

    public void procesar() {
        Configuracion config = Configuracion.getInstancia();

        impuesto = subtotal * config.getImpuesto() / 100;
        total = subtotal + impuesto;
    }

    public void mostrarInformacion() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Cliente: " + cliente);
        System.out.printf("Subtotal: " +  subtotal);
        System.out.printf("Impuesto:" +  impuesto);
        System.out.printf("Total: " + total);
    }

    public abstract void generarComprobante();


    
}

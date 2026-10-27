package edu.ups.pap.creacionales.practica.pedidos;

public final class PedidoPresencial extends Pedido{

    public PedidoPresencial(String codigo, String cliente, double subtotal) {
        super(codigo, cliente, subtotal);
    }

    @Override
    public void generarComprobante() {
        System.out.println("Comprobante generado en tienda.");
    }

    
}

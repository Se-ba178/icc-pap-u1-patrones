package edu.ups.pap.creacionales.practica.pedidos;

public final class PedidoEnLinea extends Pedido  {

    public PedidoEnLinea(String codigo, String cliente, double subtotal) {
        super(codigo, cliente, subtotal);
    }

    @Override
    public void generarComprobante() {
        System.out.println("Confirmacion digital generada.");
    }


    
}

package edu.ups.pap.creacionales.practica.creadores;

import edu.ups.pap.creacionales.practica.pedidos.Pedido;
import edu.ups.pap.creacionales.practica.pedidos.PedidoEnLinea;

public class CreadorPedidoEnLinea extends CreadorPedido{

    @Override
    public Pedido crearPedido(String codigo, String cliente, double subtotal) {
        return new PedidoEnLinea(codigo, cliente, subtotal);
    }
    
}

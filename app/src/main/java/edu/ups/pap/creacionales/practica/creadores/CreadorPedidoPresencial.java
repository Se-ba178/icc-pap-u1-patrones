package edu.ups.pap.creacionales.practica.creadores;

import edu.ups.pap.creacionales.practica.pedidos.Pedido;
import edu.ups.pap.creacionales.practica.pedidos.PedidoPresencial;

public class CreadorPedidoPresencial extends CreadorPedido{

     @Override
    public Pedido crearPedido(String codigo, String cliente, double subtotal) {
        return new PedidoPresencial(codigo, cliente, subtotal);
    }


    
}

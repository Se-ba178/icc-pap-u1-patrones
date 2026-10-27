package edu.ups.pap.creacionales.practica.creadores;

import edu.ups.pap.creacionales.practica.pedidos.Pedido;

public abstract class CreadorPedido {

    public abstract Pedido crearPedido(
            String codigo, String cliente, double subtotal);

    
}

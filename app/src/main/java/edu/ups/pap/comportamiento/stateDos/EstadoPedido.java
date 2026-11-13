package edu.ups.pap.comportamiento.stateDos;


public interface EstadoPedido {

    public void pagar(Pedido pedido);
    public void enviar(Pedido pedido);
    public void entregar(Pedido pedido);
    public void cancelar(Pedido pedido);
    public String nombre();

}

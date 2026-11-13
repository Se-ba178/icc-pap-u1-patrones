package edu.ups.pap.comportamiento.stateDos;

public class Enviado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("El pedido ya esta pagado ");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("El pedido ya fue enviado");
    }
    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido entregado");
        pedido.changeStare(new Entregado());
        
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("No se puede cancelar un pedido ya enviado");
        
    }

    @Override
    public String nombre() {
        return "ENVIADO";
        
    }
    
}

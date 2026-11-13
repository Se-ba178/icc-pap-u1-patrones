package edu.ups.pap.comportamiento.stateDos;

public class Pagado implements  EstadoPedido{

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Ya esta pagado");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Ya esta pagado");;
        pedido.changeStare(new Enviado());
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Debe enviarse primeor");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("No se puede cancelar un pedido ya pagado");
    }

    @Override
    public String nombre() {
        return "PAGADO";
    }
    
}

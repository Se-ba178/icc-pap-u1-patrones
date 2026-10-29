package edu.ups.pap.estructurales.adapter;

public final class DecoradorRegistro extends DecoradorCargador {

    public DecoradorRegistro(Cargador cargador) {
        super(cargador);
    }

    @Override
    public void cargarCelular() {
        System.out.println("Iniciando carga con ");
        super.cargarCelular();
        System.out.println("Carga finalizada ;)");
    }
}
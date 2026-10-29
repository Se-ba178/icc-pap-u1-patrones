package edu.ups.pap.estructurales.adapter;

public final class DecoradorSeguridad extends DecoradorCargador {

    private boolean permitir;

    public DecoradorSeguridad(Cargador cargador, boolean permitir) {
        super(cargador);
        this.permitir = permitir;
    }

    @Override
    public void cargarCelular() {
        System.out.println("Verificando seguridad...");

        if (permitir) {
            super.cargarCelular();
        } else {
            System.out.println("Carga bloqueada.");
        }
    }
}
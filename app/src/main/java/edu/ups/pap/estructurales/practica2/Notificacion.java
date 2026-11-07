package edu.ups.pap.estructurales.practica2;

public abstract class Notificacion {
    
    protected final CanalEnvio canal ;

    public Notificacion(CanalEnvio canal) {
        this.canal = canal;
    }

    public abstract void notificar(String destinatario, String mensaje);

    
}

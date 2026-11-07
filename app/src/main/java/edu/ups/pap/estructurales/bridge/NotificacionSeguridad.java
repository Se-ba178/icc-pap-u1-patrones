package edu.ups.pap.estructurales.bridge;

public class NotificacionSeguridad extends Notificacion{

    public  NotificacionSeguridad(CanalDeEnvio canalDeEnvio){
        super(canalDeEnvio);
    }

    @Override
    public void notificar(String mensaje) {
        canal.enviar("Seguridad: " + mensaje);
    }

    
    
}

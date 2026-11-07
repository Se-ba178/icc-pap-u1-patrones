package edu.ups.pap.estructurales.practica2;

public class NotificacionSeguridad extends Notificacion{

    public NotificacionSeguridad(CanalEnvio canalEnvio){
        super(canalEnvio);
    }

    @Override
    public void notificar(String destinatario, String mensaje) {
         canal.enviar("Not seguridad " + destinatario, " Mensaje " + mensaje);
    }
    
}

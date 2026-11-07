package edu.ups.pap.estructurales.practica2;

public class NotificacionAcademica  extends  Notificacion{

    public NotificacionAcademica(CanalEnvio canalEnvio){
        super(canalEnvio);
    }

    @Override
    public void notificar(String destinatario, String mensaje) {
        canal.enviar("Not academico " + destinatario, " Mensaje " + mensaje);
    }
    
}

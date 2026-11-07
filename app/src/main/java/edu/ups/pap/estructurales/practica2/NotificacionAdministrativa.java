package edu.ups.pap.estructurales.practica2;

public class NotificacionAdministrativa extends Notificacion{

    public NotificacionAdministrativa(CanalEnvio canalEnvio){
        super(canalEnvio);
    }

    @Override
    public void notificar(String destinatario, String mensaje) {
        canal.enviar("Not administrativo " + destinatario, " Mensaje " + mensaje);
    }
    
    
}

package edu.ups.pap.estructurales.bridge;

public class NotificacionAcademica extends Notificacion{


    public NotificacionAcademica(CanalDeEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    public void notificar(String mensaje) {
        canal.enviar("Not academico " + mensaje);
        
    }
    
}

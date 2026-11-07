package edu.ups.pap.estructurales.bridge;

public class AppBridge {
    public static void main(String[] args) {

        Notificacion not1 = new NotificacionAcademica(new CanalCorreo());
        Notificacion not2 = new NotificacionAcademica(new CanalPush());

        Notificacion notSegurCorreo = new NotificacionSeguridad(new CanalCorreo());
        Notificacion notSegurPush = new NotificacionSeguridad(new CanalPush());

        String mensajeAca = "Solicitud ##44 aprobada";
        String mensajeSegur = "Alerta de correos Maliciosos";

        not1.notificar(mensajeAca);
        not2.notificar(mensajeAca);

        notSegurCorreo.notificar(mensajeSegur);
        notSegurPush.notificar(mensajeSegur);


        
    }
    
}

package edu.ups.pap.estructurales.practica2;

public class AppNotificaciones {
    public static void main(String[] args) {
        
        // Caso 1: notificacion academica por correo
        System.out.println("\n=== Caso 1: Academica por correo ===");

        Notificacion academica = new NotificacionAcademica(new CanalCorreo());

        academica.notificar("estudiante@universidad.edu","Sus calificaciones estan disponibles.");

        // Caso 2: notificacion administrativa por SMS
        System.out.println("\n=== Caso 2: Administrativa por SMS ===");

        Notificacion administrativa = new NotificacionAdministrativa(new CanalISMS());

        administrativa.notificar("0991234567","Existe un tramite pendiente.");

        // Caso 3: seguridad por push con autorizacion
        System.out.println("\n=== Caso 3: Seguridad con autorizacion ===");

        CanalEnvio pushProtegido = new ProxyCanalEnvio(new CanalPush(),true);

        Notificacion seguridadPush = new NotificacionSeguridad(pushProtegido);

        seguridadPush.notificar("usuario123","Se detecto un inicio de sesion sospechoso.");

        // Caso 4: academica por SMS sin autorizacion
        System.out.println("\n=== Caso 4: Academica sin autorizacion ===");

        CanalEnvio smsBloqueado = new ProxyCanalEnvio(new CanalISMS(),false);

        Notificacion academicaBloqueada = new NotificacionAcademica(smsBloqueado);

        academicaBloqueada.notificar("0987654321","Sus calificaciones estan disponibles.");

        // Caso 5: reutilizar el mismo objeto CanalCorreo
        System.out.println("\n=== Caso 5: Canal de correo compartido ===");

        CanalEnvio correoCompartido = new CanalCorreo();

        Notificacion academicaCorreo = new NotificacionAcademica(correoCompartido);

        Notificacion administrativaCorreo = new NotificacionAdministrativa(correoCompartido);

        academicaCorreo.notificar( "estudiante@universidad.edu","Su horario de clases esta disponible.");

        administrativaCorreo.notificar("estudiante@universidad.edu","Debe actualizar sus datos personales.");

        // Caso 6: seguridad con dos canales protegidos por Proxy
        System.out.println("\n=== Caso 6: Bridge y Proxy ===");

        CanalEnvio correoAutorizado = new ProxyCanalEnvio(new CanalCorreo(),true);

        CanalEnvio smsNoAutorizado = new ProxyCanalEnvio(new CanalISMS(),false);

        Notificacion seguridadCorreo = new NotificacionSeguridad(correoAutorizado);

        Notificacion seguridadSMS = new NotificacionSeguridad(smsNoAutorizado);

        seguridadCorreo.notificar("estudiante@universidad.edu","Se detecto un acceso sospechoso a su cuenta.");

        seguridadSMS.notificar("0991234567","Se detecto un acceso sospechoso a su cuenta.");
    }
    
    
    
}

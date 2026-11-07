package edu.ups.pap.estructurales.practica2;

public class CanalPush implements CanalEnvio {
    
    @Override
    public void enviar(String destinatario, String mensaje){
        System.out.println("Push; " + destinatario + " Mensaje; " + mensaje);
    }
    
}

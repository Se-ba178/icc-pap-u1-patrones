package edu.ups.pap.estructurales.practica2;

public class CanalISMS implements CanalEnvio{

    @Override
    public void enviar(String destinatario , String mensaje ) {
       System.out.println("ISMS : " + destinatario + " Mensaje: " + mensaje);
    }

    
}

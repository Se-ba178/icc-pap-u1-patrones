package edu.ups.pap.estructurales.bridge;

public class CanalCorreo implements CanalDeEnvio{

    @Override
    public void enviar(String mensaje) {
       System.out.println("Correo: " + mensaje);
    }
    
}

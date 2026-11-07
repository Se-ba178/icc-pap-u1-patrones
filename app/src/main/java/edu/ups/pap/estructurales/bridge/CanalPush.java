package edu.ups.pap.estructurales.bridge;

public class CanalPush implements CanalDeEnvio{

    @Override
    public void enviar(String mensaje) {
       System.out.println("Push: " + mensaje);
    }
    
}

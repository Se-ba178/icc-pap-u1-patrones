package edu.ups.pap.estructurales.practica2;

public class ProxyCanalEnvio implements CanalEnvio {

    private  CanalEnvio canalReal;
    private boolean autorizado;


    public ProxyCanalEnvio(CanalEnvio canalReal, boolean autorizado) {
        this.canalReal = canalReal;
        this.autorizado = autorizado;
    }

    public void enviar(String destinatario , String mensaje){
        if(autorizado){
            canalReal.enviar(destinatario, mensaje);
        }else{
            System.out.println("Envio Bloqueado ;  usuario no autorizado ");
        }
    }

    
    
}

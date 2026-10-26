package edu.ups.pap.creacionales.Prototype;

public class PlantillaEmail {

    private  String asunto;
    private String mensaje;


    public PlantillaEmail(String asunto, String mensaje) {
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public  PlantillaEmail clone(){
        return new PlantillaEmail(asunto, mensaje);
    }

     //para cambiar datos de una forma general  SETTER ASUNTOC ON OTRO NOMBRE 
    public  void  cambiarAsunto(String newAsunto){
        this.asunto = newAsunto;

    }
    
    // GUETTER DEL TO STRING CON OTRO NOMBRE 
    public  String contenido(){
        return this.toString();
    }

    
    @Override
    public String toString() {
        return asunto + ": " + mensaje;
    }

    

    
}

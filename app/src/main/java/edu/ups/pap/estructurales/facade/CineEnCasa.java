package edu.ups.pap.estructurales.facade;
/**
 * Facade es la q coordina los componentes necesarios para una accion determinada
 * CineEnCasa
 */

public class CineEnCasa {

    private final Proyector proyector;
    private  final Reproductor reproductor;

    public CineEnCasa() {
        this.proyector = new Proyector();
        this.reproductor =  new Reproductor();
    }

    public  void  iniciarPelicula(String nombre){
        proyector.encender();
        reproductor.reprodcuir(nombre);

    }

    
    
}

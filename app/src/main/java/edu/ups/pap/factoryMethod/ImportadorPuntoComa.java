package edu.ups.pap.factoryMethod;

public class ImportadorPuntoComa extends Importador {
    @Override 
    protected LecturaLinea crearLector(){
        return new LectorPuntoComa();
    }
    
}

package edu.ups.pap.factoryMethod;

public class LectorPuntoComa implements LecturaLinea {
    @Override 
    public Lectura leer(String linea){
        //dividir la linea por el separador ;
        //Devolver una instancia de Lectura
        String[] partes = linea.split(";");
        return new Lectura(partes[0],Double.parseDouble((partes[1])),partes[2]);
        
    }
    
}

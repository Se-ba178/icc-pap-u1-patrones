package edu.ups.pap.factoryMethod;

public class LecturaTabulacion  implements  LecturaLinea{
     @Override 
    public Lectura leer(String linea){
        //dividir la linea por el separador "Tab";
        //[0] [1] [2]
        //Devolver una instancia de Lectura
        String[] partes = linea.split("\t");
        return new Lectura(partes[0],Double.parseDouble(partes[1]),partes[2]);
        
    }
    
    
}

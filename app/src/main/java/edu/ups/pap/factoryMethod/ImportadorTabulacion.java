package edu.ups.pap.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public class ImportadorTabulacion extends Importador{
     @Override 
    protected LecturaLinea crearLector(){
        return new LecturaTabulacion();
    }

    // @Override 
    // List<Lectura> importacion(List<String> lecturas){
    //     return  new ArrayList<>();
    // }
    
}

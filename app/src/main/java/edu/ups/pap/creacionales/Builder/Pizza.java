package edu.ups.pap.creacionales.Builder;

import java.util.List;

/**
 * Pizza  clase inmutable d
 * representa una pizza ya configurada 
 */

//LOS UNOS ACUMULAN BUIDERS OSEA DATOS Y EL BUIDER EN GERAL DEVUELVE UN PRODCUTO 
//TIENE METODOS ACUMULATIVOS Q DEVUELVEN LA INSTANCIAS DEL BUIDER PARA SEGUIR AGREGANDO COSAS PARA ASI PODER TENET UN PRODCUTO 

public final class Pizza {// el final hace q la clase sea inmutable 

    private  String tamanio;
    private  final List<String> ingredientes;


    protected Pizza(String tamanio, List<String> ingredientes) {
        this.tamanio = tamanio;
        this.ingredientes = ingredientes;
    }

    public  String descripcion(){
        return "Pizza " + tamanio + " con : " + ingredientes;
    }

    



    
}

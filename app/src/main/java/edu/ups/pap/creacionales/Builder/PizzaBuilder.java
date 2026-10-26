package edu.ups.pap.creacionales.Builder;

import java.util.ArrayList;
import java.util.List;

/**
*ObjBuilder
*Va a acumular las opciones de una pizza
*y creara el producto(Objeto(pizza)) cuando se le pida al metodo construir (build)
*/
public final class PizzaBuilder {

    private String size = "mediana";
    private  List<String> ingredientes = new ArrayList<>();  // liked list mantiene el orden de entrada , LinkedHash set para no repetir ingredientes 
    

public  PizzaBuilder(){
    this.size= "mediana";
    this.ingredientes = new ArrayList<>();
    this.ingredientes.add("Queso");

}
    //opcion uno
    public PizzaBuilder setSize(String size){
        this.size = size;
        return this;
    }

    //opcion dos 
    public  PizzaBuilder addIng(String ing){
        boolean contiene = ingredientes.contains(ing);
        
        if(contiene){
            return this;
        }

        this.ingredientes.add(ing);
        return this;
    }

    //Metodo Builder -> devuelve el producto
    public Pizza build(){
        return new Pizza(size, ingredientes);
    }

    



    
}

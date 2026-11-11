package edu.ups.pap.comportamiento.observer;

public record CambioProducto (
    Producto producto,
    String atributo,
    Object anterior,
    Object nuevo){

}
    


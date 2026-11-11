package edu.ups.pap.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
//Consumer herramienta de java sirve para establecer una accion con las funciones flecha 

public class Producto {

    private String codigo ;
    private double precio;
    private String nombre;

    public  final List<Consumer<CambioProducto>> observadores;

    
    public Producto(String codigo, double precio, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
        this.observadores = new ArrayList<>();
    }

    public  void suscribir(Consumer<CambioProducto> observador){
        observadores.add(observador);
    }

    private  void  notifyAll(CambioProducto p){
        for (Consumer<CambioProducto> observable : observadores) {
            observable.accept(p);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        String codigoOld = this.codigo;
        this.codigo = codigo;

        CambioProducto cP = new CambioProducto(this,"Codigo",codigoOld , codigo );
        notifyAll(cP);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        double precioAnt = this.precio;
        this.precio = precio;

        CambioProducto cPrecio = new CambioProducto(this, "Precio", precioAnt , precio);
        notifyAll(cPrecio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String nombreAnt = this.nombre;
        this.nombre = nombre;

        CambioProducto cNombre = new CambioProducto(this,"Nombre" , nombreAnt , nombre);

        notifyAll(cNombre);
    }

    public List<Consumer<CambioProducto>> getObservadores() {
        return observadores;
    }

    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", precio=" + precio + ", nombre=" + nombre +  "]";
    }

    

    
    




     
    
}

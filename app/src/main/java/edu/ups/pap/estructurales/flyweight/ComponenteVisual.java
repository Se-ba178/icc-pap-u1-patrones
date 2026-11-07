package edu.ups.pap.estructurales.flyweight;

public class ComponenteVisual {

    private final String tipo;
    private  final String color;
    private  final String border;


    public ComponenteVisual(String tipo, String color, String border) {
        this.tipo = tipo;
        this.color = color;
        this.border = border;
    }

    public void dibujar(String texto, int x , int y){
        System.out.printf("%s [%s] en (%d,%d), color=%s, border=%s%n", tipo, texto, x, y, color, border);
 
    }

    
    
}

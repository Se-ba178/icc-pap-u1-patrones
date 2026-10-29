package edu.ups.pap.estructurales.decorator;
/**
 * 
 * Leche esta clase es mi decorador que envuelve a una bebida 
 * BEBIDA -> general puede ser cualquiera un cafe un expreso chocolate etc
 */

public final class Leche implements Bebida{

    protected final Bebida bebida ; // cuando se pone el final se inicializa en el constructor

    public  Leche(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String descripcion() {
        return  bebida.descripcion()  + "  leche";
        
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.5;
    }



    
}

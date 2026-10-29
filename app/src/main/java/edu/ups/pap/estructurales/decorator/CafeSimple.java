package edu.ups.pap.estructurales.decorator;

public class CafeSimple implements  Bebida{

    @Override
    public String descripcion() {
        return "Un cafe  simple con";
        
    }

    @Override
    public double precio() {
        return 2.00;
    }

    
}

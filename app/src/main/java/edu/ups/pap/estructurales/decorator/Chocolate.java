package edu.ups.pap.estructurales.decorator;

public final  class Chocolate implements Bebida {
    protected  Bebida bebida;

     public  Chocolate(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + "  chocolate";
        
    }

    @Override
    public double precio() {
        return  bebida.precio() + 0.75;
    }

    
}

package edu.ups.pap.estructurales.adapter;

public abstract class DecoradorCargador implements Cargador {

    protected  Cargador cargador;

    public DecoradorCargador(Cargador cargador){
        this.cargador = cargador;
    }

    public  void cargarCelular(){
        cargador.cargarCelular();
    }
     
}

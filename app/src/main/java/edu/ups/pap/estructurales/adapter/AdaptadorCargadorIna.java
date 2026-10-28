package edu.ups.pap.estructurales.adapter;

public class AdaptadorCargadorIna implements Cargador {

    private  final CargadorInalambrico cInalambrico;

    public AdaptadorCargadorIna (CargadorInalambrico cInalambrico){
        this.cInalambrico = cInalambrico;

    }

    @Override
    public void cargarCelular() {
        // Validaciones
        //Try cathc
        // control de excepcioens
        
        cInalambrico.cargarBase();
    }

    
}

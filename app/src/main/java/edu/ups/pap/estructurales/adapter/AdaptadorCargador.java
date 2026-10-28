package edu.ups.pap.estructurales.adapter;

public class AdaptadorCargador implements  Cargador{

    //dependencia del cragador antiguo
    private  final CargadorAntiguo cargadorAntiguo;

    public AdaptadorCargador(CargadorAntiguo cargadorAntiguo){
        this.cargadorAntiguo = cargadorAntiguo;
    }

    @Override
    public void cargarCelular() {
        cargadorAntiguo.cargarConector();
        
    }



    
}

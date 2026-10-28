package edu.ups.pap.estructurales.adapter;

public final  class AppAdapter {
    public static void main(String[] args) {

        //cargar el celular con un cargador prero tengo uno antiguo tengo q crear un adaptador 
        CargadorAntiguo cAntiguo = new CargadorAntiguo();
        CargadorInalambrico cInalambrico = new CargadorInalambrico();
        Cargador cargadorUno = new AdaptadorCargador(cAntiguo);
        Cargador cargador2 = new AdaptadorCargadorIna(cInalambrico);


        cargadorUno.cargarCelular();
        cargador2.cargarCelular();

        //cargar el celular 
        // cargadorUno.cargarCelular();

        // cargar el celular sin el patron 
        // si el cargador es antiguo 
        // cAntiguo.cargarConector();

        // cInalambrico.cargarBase();
        

    }

    
}

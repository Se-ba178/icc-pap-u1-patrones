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
        Cargador c1= new DecoradorRegistro(cargadorUno);
        Cargador c2= new DecoradorSeguridad(cargador2, true);
        Cargador c3= new DecoradorSeguridad(cargadorUno, false);
        Cargador c4= new DecoradorSeguridad(new DecoradorRegistro(c2), true);
        //Cargador c5 = new DecoradorRegistro(c3);
        //Cargador c4 = new DecoradorSeguridad(c2,true);
        System.out.println("Caso 1 ");
        c1.cargarCelular();
        System.out.println();
        System.out.println("Caso 2");
        c2.cargarCelular();
        System.out.println();
        System.out.println("Caso 3");
        c3.cargarCelular();
        System.out.println();
        System.out.println("Caso 4");
        c4.cargarCelular();
        

    }

    
}

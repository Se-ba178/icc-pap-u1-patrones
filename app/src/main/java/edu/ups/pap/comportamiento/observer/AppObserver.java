package edu.ups.pap.comportamiento.observer;

public class AppObserver {

    public static void main(String[] args) {

        Producto producto = new Producto("001" , 20.50 , "Pizza");

        // producto.suscribir(cP -> System.out.println("Correo: " + cP)); 
        // producto.suscribir(cP -> System.out.println("Registro precio: $ " + cP));

        // // q cambien cuando el codigo cambia q imprima solo si el codigo cambia 
        // String guardada = producto.getCodigo() ;

        // producto.suscribir(p -> {
        //     //Imprimir el nuevo codigo solo el codigo siempre y cuando cambio solo el codigo 
        //     if(!guardada.equals(producto.getCodigo())){
        //         System.out.println("El codigo viejo es  ; " + guardada + " " +  "El codigo nuevo es :  " + producto.getCodigo());
        //     }
        // });
        producto.suscribir(cP -> {
            System.out.println("Se identifico el codigo");
            System.out.println("Se modifico el " + cP.atributo());
            System.out.println("Old= " + cP.anterior() + " New = " + cP.nuevo());
        });
        System.out.println("--Cambio el precio--");
        producto.setPrecio(15.50);
        System.out.println("--Cambio el nombre --");
        producto.setNombre("PIZZA");

        System.out.println("Cambio el codigo ");
        producto.setCodigo("010");


        
        


        

    }
    
}

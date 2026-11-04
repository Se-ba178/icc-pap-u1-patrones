package edu.ups.pap.estructurales.proxy;

public class AppProxy {

    public static void main(String[] args) {

        Documento documento = new DocumentoProxy("Informe pdf");
        System.out.println("El proxy esta creado");
        documento.mostrar();
        documento.mostrar();
        
    }
    
}

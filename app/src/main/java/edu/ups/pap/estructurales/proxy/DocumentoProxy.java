package edu.ups.pap.estructurales.proxy;

/**
 * 
 * DocumentoProxy  pospone la creacion de un documento real hasta q se le necesite
 */

public class DocumentoProxy implements Documento {

    private  final String path;
    private  DocumentoReal documento;

    public DocumentoProxy(String path) {
        this.path = path;
    }


    @Override
    public void mostrar() {
        if(documento == null){
            documento = new DocumentoReal(path);
        }
        documento.mostrar();
    }
    
}

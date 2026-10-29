package edu.ups.pap.estructurales.decorator;

public class AppDecorator {
    public static void main(String[] args) {
        Bebida bebida = new CafeSimple(); //BEBIDA   -> Cafe Simple 
        System.out.println(bebida.descripcion() + " $" + bebida.precio());
        Bebida bebidaCon = new Leche(bebida); // BEBIDA -> CAFE  +  LECHE
        System.out.println(bebidaCon.descripcion() + " $ " + bebidaCon.precio());
        

        Bebida bebidaChocolate = new Chocolate(bebida);
        System.out.println(bebidaChocolate.descripcion()  + " $" + bebidaChocolate.precio());

        Bebida bebidaLecheChoco = new Chocolate(new Leche(bebida));
        System.out.println(bebidaLecheChoco.descripcion()  + " $ " + bebidaLecheChoco.precio());

        Bebida bebidaChocoLeche = new Leche(new Chocolate(bebida));
        System.out.println(bebidaChocoLeche.descripcion()  + " $" + bebidaChocoLeche.precio());

        Bebida bebidaChocoCuadradoLeche = new Leche(new Chocolate(new Chocolate(bebida)));
        System.out.println(bebidaChocoCuadradoLeche.descripcion()  + " $" + bebidaChocoCuadradoLeche.precio());

    }
    
}

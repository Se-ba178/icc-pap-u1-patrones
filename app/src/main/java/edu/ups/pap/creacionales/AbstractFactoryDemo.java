package edu.ups.pap.creacionales;

public class AbstractFactoryDemo {
    // Botón claro --
    static class BotonClaro implements Boton {
        @Override
        public void dibujar() {
            System.out.println("Dibujando boton claro");
        }
    }

    // Botón oscuro
    static class BotonOscuro implements Boton {
        @Override
        public void dibujar() {
            System.out.println("Dibujando boton oscuro");
        }
    }

    // Menú claro
    static class MenuClaro implements Menu {
        @Override
        public void mostrar() {
            System.out.println("Mostrando menu claro");
        }
    }

    // Menú oscuro
    static class MenuOscuro implements Menu {
        @Override
        public void mostrar() {
            System.out.println("Mostrando menu oscuro");
        }
    }

    // Fábrica q tiene botony menu claros 
    static class FabricaClara implements FabricaGUI {
        @Override
        public Boton crearBoton() {
            return new BotonClaro();
        }

        @Override
        public Menu crearMenu() {
            return new MenuClaro();
        }
    }

    // Fábrica q tiene boton y menu oscuros 
    static class FabricaOscura implements FabricaGUI {
        @Override
        public Boton crearBoton() {
            return new BotonOscuro();
        }

        @Override
        public Menu crearMenu() {
            return new MenuOscuro();
        }
    }

    // Demostración
    public static void ejecutar() {

        // Empezamos con la fabrica clara yy a instanciamos
        FabricaGUI fabrica = new FabricaClara();

        // Creamos los botones y menus para la fabrica clara 
        Boton boton = fabrica.crearBoton();
        Menu menu = fabrica.crearMenu();

        // Mostramos los productos de la fabria clara 
        boton.dibujar();
        menu.mostrar();

        System.out.println("--------------------");

        // modificamos la variable fabica sin afectar a la anterior y la hacems con la fabrica oscura
        fabrica = new FabricaOscura();

        // Creamos los botones y menus oscuros
        boton = fabrica.crearBoton();
        menu = fabrica.crearMenu();

        // Mostramos los productos de la fabrica oscura 
        boton.dibujar();
        menu.mostrar();
    }
}
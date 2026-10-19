El ejemplo es sobre el patrón Abstract Factory, que sirve para crear grupos de objetos que están relacionados entre sí. En mi caso, hice un ejemplo con dos temas, uno claro y otro oscuro, y cada uno tiene su botón y su menú.

Las interfaces Boton y Menu indican qué debe hacer cada producto, mientras que FabricaGUI define los métodos para crearlos. Luego tengo FabricaClara y FabricaOscura, que se encargan de crear los elementos de cada tema.

En el método ejecutar() primero uso la fábrica clara y después cambio a la oscura, utilizando la misma variable. Así puedo demostrar el polimorfismo y ver cómo cambia la familia de productos sin tener que modificar todo el código.

También utilizo @Override para implementar los métodos de las interfaces y definir qué hace cada botón, menú o fábrica.
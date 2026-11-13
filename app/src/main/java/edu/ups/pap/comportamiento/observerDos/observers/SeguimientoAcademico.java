package edu.ups.pap.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import edu.ups.pap.comportamiento.observerDos.CambioEstudiante;

//Observer dos 
//Consumer es una interfaz 
public class SeguimientoAcademico implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        if(!"Promedio".equals(cambio.atributo())){  //ESTE OBSERVER SE LANZA SIEMPRE 
            return;
        }

        double anterior = (Double)cambio.old();
        double nuevo = (Double)cambio.nuevo();

        if(anterior >= 7.0 && nuevo < 7.0){
            System.out.println("[ACADEMICO] Bajo rendimiento " + cambio.est());
        }

        if(anterior <7.0 && nuevo >=7.0){
             System.out.println("[ACADEMICO] Recuperacion academica " + cambio.est());

        }

    }

    
}

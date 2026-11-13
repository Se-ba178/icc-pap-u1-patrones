package edu.ups.pap.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import edu.ups.pap.comportamiento.observerDos.CambioEstudiante;

public class ControlDeAsistencia  implements  Consumer<CambioEstudiante>{

    @Override
    public void accept(CambioEstudiante cambio) {
         if (!"Asistencias".equals(cambio.atributo())) {
            return;
        }

        int anterior = (Integer)cambio.old();
        int nuevo = (Integer)cambio.nuevo();

        switch (nuevo) {
            case 0,1,2:
                if (anterior < 0 || anterior > 2) {
                    System.out.println("Normal " + cambio.est());
                }
                break;
            case 3,4,5:
                if (anterior < 3 || anterior > 5) {
                    System.out.println("Advertencia "  + cambio.est());
                }
                break;
            default:
                if (anterior >= 0 && anterior < 6) {
                    System.out.println("Critico " + cambio.est());
                }
                break;
        }

        
    }
    
}

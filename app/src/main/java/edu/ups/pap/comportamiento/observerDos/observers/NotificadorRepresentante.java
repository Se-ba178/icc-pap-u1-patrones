package edu.ups.pap.comportamiento.observerDos.observers;

import java.util.function.Consumer;
import edu.ups.pap.comportamiento.observerDos.CambioEstudiante;
import edu.ups.pap.comportamiento.observerDos.Matricula;

public class NotificadorRepresentante implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        String motivo;

        switch (cambio.atributo()) {
            case "Promedio":
                double promedio = ((Number) cambio.nuevo()).doubleValue();
                if (!(promedio < 6.0)) {
                    return;
                }
                motivo = "Promedio inferior a 6.0 (" + promedio + ")";
                break;

            case "Asistencias":
                int inasistencias = ((Number) cambio.nuevo()).intValue();
                if (inasistencias < 8) {
                    return;
                }
                motivo = "Inasistencias iguales o superiores a 8 (" + inasistencias + ")";
                break;

            case "Matricula ": 
                if (cambio.nuevo() != Matricula.SUSPENDIDO
                        || cambio.old() == Matricula.SUSPENDIDO) {
                    return;
                }
                motivo = "Matrícula suspendida";
                break;

            default:
                return;
        }

        System.out.println("[REPRESENTANTE] " + cambio.est().getNombre()+ " | " + motivo);
    }
}
package edu.ups.pap.comportamiento.observerDos.observers;

import java.util.Objects;
import java.util.function.Consumer;

import edu.ups.pap.comportamiento.observerDos.CambioEstudiante;

public class ControlDeMatricula implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        if (!"matricula".equals(cambio.atributo())) {
            return;
        }

        Object anterior = cambio.old();
        Object nuevo = cambio.nuevo();

        if (nuevo == null || Objects.equals(anterior, nuevo)) {
            return;
        }

        switch (nuevo.toString()) {
            case "SUSPENDIDO":
                System.out.println("Estudiante suspendido: " + cambio.est());
                break;

            case "RETIRADO":
                System.out.println("Estudiante retirado: " + cambio.est());
                break;

            case "ACTIVO":
                if ("SUSPENDIDO".equals(Objects.toString(anterior))
                        || "RETIRADO".equals(Objects.toString(anterior))) {
                    System.out.println("Estudiante reactivado: " + cambio.est());
                }
                break;
        }
    }
}

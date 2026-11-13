package edu.ups.pap.comportamiento.observerDos.observers;

import java.util.function.Consumer;
import edu.ups.pap.comportamiento.observerDos.CambioEstudiante;
import edu.ups.pap.comportamiento.observerDos.Estudiante;
import edu.ups.pap.comportamiento.observerDos.Matricula;

public class ControlSeguimiento implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        Estudiante estudiante = cambio.est();

        double promedio = estudiante.getPromedio();
        int inasistencias = estudiante.getAsistencias();
        Matricula estado = estudiante.getEstado();

        if (!estaEnRiesgo(promedio, inasistencias, estado)) {
            return;
        }

        
        switch (cambio.atributo()) {
            case "Promedio":
                promedio = ((Number) cambio.old()).doubleValue();
                break;
            case "Asistencias":
                inasistencias = ((Number) cambio.old()).intValue();
                break;
            case "Matricula ":
                estado = (Matricula) cambio.old();
                break;
            default:
                return;
        }

        if (!estaEnRiesgo(promedio, inasistencias, estado)) {
            System.out.println("[ALERTA INTEGRAL] Riesgo integral de "
                    + estudiante.getNombre());
        }
    }

    private boolean estaEnRiesgo(double promedio, int inasistencias, Matricula estado) {
        return promedio < 7.0 && inasistencias >= 6 && estado == Matricula.ACTIVO;
    }
}
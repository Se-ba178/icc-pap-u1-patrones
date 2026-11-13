package edu.ups.pap.comportamiento.observerDos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class Estudiante {

    private String codigo;
    private String nombre;
    private double promedio;
    private int asistencias;
    private Matricula estado;

    private final List<Consumer<CambioEstudiante>> observer;

    public Estudiante(String codigo, String nombre, double promedio,int asistencias, Matricula estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
        this.asistencias = asistencias;
        this.estado = estado;
        this.observer = new ArrayList<>();
    }

    public void suscribir(Consumer<CambioEstudiante> observador) {
        observer.add(observador);
    }

    public void notificar(CambioEstudiante cambio) {
        for (Consumer<CambioEstudiante> observador : observer) {
            observador.accept(cambio);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (Objects.equals(this.codigo, codigo)) {
            return;
        }

        String codigoAnterior = this.codigo;
        this.codigo = codigo;
        notificar(new CambioEstudiante(this, "Codigo", codigoAnterior, codigo));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (Objects.equals(this.nombre, nombre)) {
            return;
        }

        String nombreAnterior = this.nombre;
        this.nombre = nombre;
        notificar(new CambioEstudiante(this, "Nombre", nombreAnterior, nombre));
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (Double.compare(this.promedio, promedio) == 0) {
            return;
        }

        double promedioAnterior = this.promedio;
        this.promedio = promedio;
        notificar(new CambioEstudiante(this, "Promedio", promedioAnterior, promedio));
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        if (this.asistencias == asistencias) {
            return;
        }

        int asistenciasAnteriores = this.asistencias;
        this.asistencias = asistencias;
        notificar(new CambioEstudiante(this, "Asistencias", asistenciasAnteriores, asistencias));
    }

    public Matricula getEstado() {
        return estado;
    }

    public void setEstado(Matricula estado) {
        if (this.estado == estado) {
            return;
        }

        Matricula estadoAnterior = this.estado;
        this.estado = estado;
        notificar(new CambioEstudiante(this, "Matricula ", estadoAnterior, estado));
    }

    @Override
    public String toString() {
        return "Estudiante [codigo=" + codigo + ", nombre=" + nombre
                + ", promedio=" + promedio + ", asistencias=" + asistencias
                + ", estado=" + estado + "]";
    }
}
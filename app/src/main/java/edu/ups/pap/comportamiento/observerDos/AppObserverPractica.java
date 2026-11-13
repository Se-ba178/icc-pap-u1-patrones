package edu.ups.pap.comportamiento.observerDos;

import java.util.function.Consumer;

import edu.ups.pap.comportamiento.observerDos.observers.ControlDeAsistencia;
import edu.ups.pap.comportamiento.observerDos.observers.ControlDeMatricula;
import edu.ups.pap.comportamiento.observerDos.observers.ControlSeguimiento;
import edu.ups.pap.comportamiento.observerDos.observers.NotificadorRepresentante;
import edu.ups.pap.comportamiento.observerDos.observers.SeguimientoAcademico;

public class AppObserverPractica {
    public static void main(String[] args) {

        Estudiante ana = new Estudiante("EST001", "Ana Torres", 8.5, 1, Matricula.ACTIVO);
        Estudiante luis = new Estudiante("EST002", "Luis Perez", 7.2, 4, Matricula.ACTIVO);
        Estudiante maria = new Estudiante("EST003", "Maria Lopez", 9.1, 0, Matricula.ACTIVO);

        Consumer<CambioEstudiante> auditoria = cambio -> {
            System.out.printf("[AUDITORIA] %s | %s : %s -> %s%n ", cambio.est(), cambio.atributo(), cambio.old(),
                    cambio.nuevo());
        };

        // Observador dos academico
        SeguimientoAcademico obdAcademico = new SeguimientoAcademico();
        // Observador tres asistencia
        ControlDeAsistencia obdAsistencia = new ControlDeAsistencia();
        // Observador cuatro
        ControlDeMatricula obdMatricula = new ControlDeMatricula();
        // Observador cinco
        ControlSeguimiento obdSeguimiento = new ControlSeguimiento();
        // Observer seis
        NotificadorRepresentante obdNotificador = new NotificadorRepresentante();

        ana.suscribir(auditoria);
        luis.suscribir(auditoria);
        maria.suscribir(auditoria);

        ana.suscribir(obdAcademico);
        luis.suscribir(obdAcademico);
        maria.suscribir(obdAcademico);

        ana.suscribir(obdAsistencia);
        luis.suscribir(obdAsistencia);
        maria.suscribir(obdAsistencia);

        ana.suscribir(obdMatricula);
        luis.suscribir(obdMatricula);
        maria.suscribir(obdMatricula);

        ana.suscribir(obdSeguimiento);
        luis.suscribir(obdSeguimiento);
        maria.suscribir(obdSeguimiento);

        ana.suscribir(obdNotificador);
        luis.suscribir(obdNotificador);

        ana.setCodigo("EST004");
        System.out.println();
        ana.setNombre("ANA");
        System.out.println("-----------Caso001------------");
        ana.setPromedio(6.5);
        System.out.println("---------------Caso002-----------");
        ana.setPromedio(7.8);
        System.out.println("----------------caso003-------------");
        luis.setAsistencias(7);
        System.out.println("--------------Caso004--------------");
        maria.setEstado(Matricula.SUSPENDIDO);
        System.out.println("---------------Caso005-------------");
        luis.setPromedio(6.4);
        System.out.println("----------Caso006-----------------");
        maria.setCodigo(maria.getCodigo());
        maria.setNombre(maria.getNombre());
        maria.setPromedio(maria.getPromedio());
        maria.setAsistencias(maria.getAsistencias());
        maria.setEstado(maria.getEstado());
        System.out.println();
        System.out.println("--------------Caso007-----------------");
        ana.setPromedio(6.5);
        luis.setPromedio(7.5);
        maria.setAsistencias(4);

        System.out.println("------------Caso008--------------------");
        System.out.println(ana);
        System.out.println(luis);
        System.out.println(maria);

        System.out.println();
        ana.setPromedio(5.8); 
        luis.setAsistencias(8); 
        luis.setEstado(Matricula.SUSPENDIDO); 

        maria.setPromedio(5.5);

    }

}
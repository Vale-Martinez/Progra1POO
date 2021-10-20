package Controlador;

import Vistas.ConsultaCursoCo;
import Vistas.ConsultaCursoPlan;
import Vistas.ConsultaCursoReq;
import Vistas.ConsultaPlan;
import Vistas.EliminarCurso;
import Vistas.EliminarCursoPlan;
import Vistas.EliminarCursoReq;
import Vistas.RegistroCurso;
import Vistas.RegistroEscuela;
import Vistas.RegistroPlanEstudio;
import Vistas.RegistroReqCo;

/**
 * Clase controlador de la vista menu
 *
 * @author valem
 * @author nathb
 */
public class ConMenu {

//variables de vista que se van a implementar
    static Vistas.RegistroEscuela registroEscuela = new RegistroEscuela();
    static Vistas.RegistroPlanEstudio registroPlanEstudio = new RegistroPlanEstudio();
    static Vistas.RegistroCurso registroCurso = new RegistroCurso();
    static Vistas.RegistroReqCo registroReqCo = new RegistroReqCo();

    static Vistas.ConsultaPlan consultaPlan = new ConsultaPlan();
    static Vistas.ConsultaCursoPlan consultaCursoPlan = new ConsultaCursoPlan();
    static Vistas.ConsultaCursoReq consultarCursoReq = new ConsultaCursoReq();
    static Vistas.ConsultaCursoCo consultarCursoCo = new ConsultaCursoCo();

    static Vistas.EliminarCursoReq eliminarCursoReq = new EliminarCursoReq();
    static Vistas.EliminarCursoPlan eliminarCursoPlan = new EliminarCursoPlan();
    static Vistas.EliminarCurso eliminarCurso = new EliminarCurso();

    /**
     * Abre la vista de registro de escuela
     */
    public static void AbrirResgistroEscuela() {
        registroEscuela.setVisible(true);
    }

    /**
     *Abre la vista de registro de  un plan de estudio
     */
    public static void AbrirResgistroPlanEstudio() {
        registroPlanEstudio.setVisible(true);
    }

    /**
     *Abre la vista de registro de un curso
     */
    public static void AbrirResgistroCurso() {
        registroCurso.setVisible(true);
    }

    /**
     *Abre la vista de registro de un requisito y correquisito
     */
    public static void AbrirResgistroReqCo() {
        registroReqCo.setVisible(true);
    }

    /**
     *Abre la vista de consulta de de un plan de estudio
     */
    public static void AbrirConsultaPlan() {
        consultaPlan.setVisible(true);
    }

    /**
     *Abre la vista de consulta de un curso en un plan
     */
    public static void AbrirConsultaCursoPlan() {
        consultaCursoPlan.setVisible(true);
    }

    /**
     *Abre la vista de consulta de los requisitos de un curso 
     */
    public static void AbrirConsultaCursoReq() {
        consultarCursoReq.setVisible(true);
    }

    /**
     * Abre la vista de consulta de los correquisitos de un curso
     */
    public static void AbrirConsultaCursoCo() {
        consultarCursoCo.setVisible(true);
    }

    /**
     *Abre la vista de eliminar un requisito de un curso
     */
    public static void AbrirEliminarCursoReq() {
        eliminarCursoReq.setVisible(true);
    }

    /**
     * Abre la vista de eliminar un curso de un plan 
     */
    public static void AbrirEliminarCursoPlan() {
        eliminarCursoPlan.setVisible(true);
    }

    /**
     * Abre la vista de eliminar un curso
     */
    public static void AbrirEliminarCurso() {
        eliminarCurso.setVisible(true);
    }
}

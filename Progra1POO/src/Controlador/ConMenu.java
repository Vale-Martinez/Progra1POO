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
 *
 * @author valem
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

    public static void AbrirResgistroEscuela() {
        registroEscuela.setVisible(true);
    }

    public static void AbrirResgistroPlanEstudio() {
        registroPlanEstudio.setVisible(true);
    }

    public static void AbrirResgistroCurso() {
        registroCurso.setVisible(true);
    }

    public static void AbrirResgistroReqCo() {
        registroReqCo.setVisible(true);
    }

    public static void AbrirConsultaPlan() {
        consultaPlan.setVisible(true);
    }

    public static void AbrirConsultaCursoPlan() {
        consultaCursoPlan.setVisible(true);
    }

    public static void AbrirConsultaCursoReq() {
        consultarCursoReq.setVisible(true);
    }

    public static void AbrirConsultaCursoCo() {
        consultarCursoCo.setVisible(true);
    }

    public static void AbrirEliminarCursoReq() {
        eliminarCursoReq.setVisible(true);
    }

    public static void AbrirEliminarCursoPlan() {
        eliminarCursoPlan.setVisible(true);
    }

    public static void AbrirEliminarCurso() {
        eliminarCurso.setVisible(true);
    }
}

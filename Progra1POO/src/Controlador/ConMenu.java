package Controlador;

import Vistas.ConsultaPlan;
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
    
    
    public static void AbrirConsultaPlan(){
    consultaPlan.setVisible(true);
    }
}

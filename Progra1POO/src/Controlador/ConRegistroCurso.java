package Controlador;

import Modelo.Curso;
import Vistas.Menu;

/**
 *
 * @author valem
 */
public class ConRegistroCurso {

   static Vistas.Menu menu = new Menu();
    
    //llama a la ventana anterior 
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroCurso.setVisible(false);
    }
    
    public static void Registrar(int numPlan, Curso cur) {
        String consulta1 = "Insert into Curso (codigoCurso, nombreCurso, bloque,creditos, horasLectivas) values ('" + cur.getCodigoCurso() + "','" + cur.getNombreCurso() + "',"+cur.getBloque()+","+cur.getCreditosCurso() +","+cur.getHorasLectivas()+");";
        Modelo.ConexionSQL.consultaRegistar(consulta1);
        String consulta2 = "Insert into PlanEstudio_Curso (numPlan, codigoCurso ) values (" + numPlan + ",'" +cur.getCodigoCurso() + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta2);
    }
}

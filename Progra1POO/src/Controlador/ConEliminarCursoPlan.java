package Controlador;

import Vistas.Menu;

/**
 *
 * @author valem
 */
public class ConEliminarCursoPlan {

    static Vistas.Menu menu = new Menu();
//llama a la ventana anterior 

    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroCurso.setVisible(false);
    }

    public static void Eliminar(String codCurso, int numPlan) {
        String consulta1 = "delete from  PlanEstudio_Curso where codigoCurso =  '" + codCurso + "' AND numPlan = " + numPlan + ";";
        Modelo.ConexionSQL.consultaEliminiar(consulta1);
    }
}

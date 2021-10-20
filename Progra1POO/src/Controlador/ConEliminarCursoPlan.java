package Controlador;

import Vistas.Menu;

/**
 * Clase controlador de la vista eliminar un curso de un plan
 *
 * @author valem
 * @author nathb
 */
public class ConEliminarCursoPlan {

    static Vistas.Menu menu = new Menu();

    /**
     * llama a la ventana anterior
     */
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroCurso.setVisible(false);
    }

    /**
     * elimina el curso del plan
     *
     * @param codCurso cosigo del curso que se desea eliminar
     * @param numPlan numero de plan del que se desea eliminar
     */
    public static void Eliminar(String codCurso, int numPlan) {
        String consulta1 = "delete from  PlanEstudio_Curso where codigoCurso =  '" + codCurso + "' AND numPlan = " + numPlan + ";";
        Modelo.ConexionSQL.consultaEliminiar(consulta1);
    }
}

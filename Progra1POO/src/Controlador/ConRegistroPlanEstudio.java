package Controlador;

import Modelo.PlanEstudio;
import Vistas.Menu;

/**
 * Clase controlador de la vista registar un plan de estudio
 *
 * @author valem
 * @author nathb
 */
public class ConRegistroPlanEstudio {

    static Vistas.Menu menu = new Menu();

    /**
     * llama a la ventana anterior
     */
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroPlanEstudio.setVisible(false);
    }

    /**
     * registro de un plan de estudio en la base de datos
     *
     * @param codigoEscuela codigo de la escuela a la que se desea asignar el
     * plan
     * @param PlanEstudio objeto de tipo plan que se desea guardar
     */
    public static void Registrar(String codigoEscuela, PlanEstudio PlanEstudio) {
        String consulta1 = "Insert into PlanEstudio (numPlan, fechaVigencia) values ('" + PlanEstudio.getNumPlan() + "','" + PlanEstudio.getFechaVigencia() + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta1);
        String consulta2 = "Insert into Escuela_PlanEstudio (codigoEscuela, numPlan) values ('" + codigoEscuela + "','" + PlanEstudio.getNumPlan() + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta2);
    }
}

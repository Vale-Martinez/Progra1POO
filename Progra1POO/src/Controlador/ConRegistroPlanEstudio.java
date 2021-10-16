package Controlador;

import Modelo.PlanEstudio;
import Vistas.Menu;

/**
 *
 * @author valem
 */
public class ConRegistroPlanEstudio {

    static Vistas.Menu menu = new Menu();

    //llama a la ventana anterior 
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroPlanEstudio.setVisible(false);
    }

    public static void Registrar(String codigoEscuela, PlanEstudio PlanEstudio) {
        String consulta1 = "Insert into PlanEstudio (numPlan, fechaVigencia) values ('" + PlanEstudio.getNumPlan() + "','" + PlanEstudio.getFechaVigencia() + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta1);
        String consulta2 = "Insert into Escuela_PlanEstudio (codigoEscuela, numPlan) values ('" + codigoEscuela + "','" + PlanEstudio.getNumPlan() + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta2);
    }
}

package Controlador;

import Vistas.Menu;
import java.sql.Date;

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

    public static void Registrar(String codigoEscuela, int numPlan, Date fechaVigencia) {
        String consulta1 = "Insert into PlanEstudio (numPlan, fechaVigencia) values ('" + numPlan + "','" + fechaVigencia + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta1);
        String consulta2 = "Insert into Escuela_PlanEstudio (codigoEscuela, numPlan) values ('" + codigoEscuela + "','" + numPlan + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta2);
    }
}

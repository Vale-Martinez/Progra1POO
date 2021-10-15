package Controlador;

import Vistas.Menu;
import java.sql.Date;

/**
 *
 * @author valem
 */
public class ConRegistroBloque {

   static Vistas.Menu menu = new Menu();
    
    //llama a la ventana anterior 
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroBloque.setVisible(false);
    }
    
    public static void Registrar(int numPlan, int numeroBloque, String nombreBloque) {
        String consulta1 = "Insert into Bloque (numeroBloque, nombreBloque) values ('" + numeroBloque + "','" + nombreBloque + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta1);
        String consulta2 = "Insert into PlanEstudio_Bloque (numPlan,numeroBloque) values (" + numPlan + "," +numeroBloque + ");";
        Modelo.ConexionSQL.consultaRegistar(consulta2);
    }
}

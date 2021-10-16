package Controlador;

import Vistas.Menu;
import Modelo.Escuela;
/**
 *
 * @author valem
 */
public class ConRegistroEscuela {

    static Vistas.Menu menu = new Menu();

    //llama a la ventana anterior 
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroEscuela.setVisible(false);
    }

    public static void Registrar(Escuela esc) {
        String consulta = "Insert into Escuela (codigoEscuela, nombreEscuela) VALUES ('" + esc.getCodigoEscuela() + "','" + esc.getNombreEscuela() + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta);
    }
}

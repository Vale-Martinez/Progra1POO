package Controlador;

import Vistas.Menu;
import Modelo.Escuela;

/**
 * Clase controlador de la vista registrar una escuela
 *
 * @author valem
 * @author nathb
 */
public class ConRegistroEscuela {

    static Vistas.Menu menu = new Menu();

    /**
     * llama a la ventana anterior
     */
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroEscuela.setVisible(false);
    }

    /**
     * registra una escuela en la base de datos
     *
     * @param esc obejto de tipo escuela que se desea registar
     */
    public static void Registrar(Escuela esc) {
        String consulta = "Insert into Escuela (codigoEscuela, nombreEscuela) VALUES ('" + esc.getCodigoEscuela() + "','" + esc.getNombreEscuela() + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta);
    }
}

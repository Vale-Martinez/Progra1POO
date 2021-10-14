package Controlador;

import Vistas.Menu;

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

    public static void Registrar(String codigoEscuela, String nombreEscuela) {
        String consulta = "Insert into Escuela (codigoEscuela, nombreEscuela) VALUES ('" + codigoEscuela + "','" + nombreEscuela + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta);
    }
}

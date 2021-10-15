package Controlador;

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
    
    public static void Registrar(int numeroBloque, String codigoCurso, String nombreCurso, int creditos, int horasLectivas) {
        String consulta1 = "Insert into Curso (codigoCurso, nombreCurso, creditos, horasLectivas) values ('" + codigoCurso + "','" + nombreCurso + "',"+creditos +","+horasLectivas+");";
        Modelo.ConexionSQL.consultaRegistar(consulta1);
        String consulta2 = "Insert into Bloque_Curso (numeroBloque, codigoCurso) values (" + numeroBloque + ",'" +codigoCurso + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta2);
    }
}

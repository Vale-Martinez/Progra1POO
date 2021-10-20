package Controlador;

import Vistas.Menu;
import java.sql.Date;

/**
 * Clase controlador de la vista registar requisitos y correquisitos de un curso
 *
 * @author valem
 * @author nathb
 */
public class ConRegistroReqCo {

    static Vistas.Menu menu = new Menu();

    /**
     * llama a la ventana anterior
     */
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroReqCo.setVisible(false);
    }

    /**
     * registra un requisito de un curso en la base de datos
     *
     * @param codigoCurso csigo del curso al que se le desea asignar el
     * requisito
     * @param codigoCursoReq codigo del curso que sera requisito
     */
    public static void RegistrarReq(String codigoCurso, String codigoCursoReq) {
        String consulta1 = "Insert into Curso_Requisito(codigoCurso, codigoCursoReq ) values ('" + codigoCurso + "','" + codigoCursoReq + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta1);
    }

    /**
     * registra un requisito de un curso en la base de datos
     *
     * @param codigoCurso csigo del curso al que se le desea asignar el
     * requisito
     * @param codigoCursoCo codigo del curso que sera correquisito
     */
    public static void RegistrarCo(String codigoCurso, String codigoCursoCo) {
        String consulta1 = "Insert into Curso_Correqisito(codigoCurso, codigoCursoCO) values ('" + codigoCurso + "','" + codigoCursoCo + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta1);
        String consulta2 = "Insert into Curso_Correqisito(codigoCurso, codigoCursoCO) values ('" + codigoCursoCo + "','" + codigoCurso + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta2);
    }
}

package Controlador;

import Vistas.Menu;
import java.sql.Date;

/**
 *
 * @author valem
 */
public class ConRegistroReqCo {

   static Vistas.Menu menu = new Menu();
    
    //llama a la ventana anterior 
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroReqCo.setVisible(false);
    }
    
    public static void RegistrarReq(String codigoCurso, String codigoCursoReq) {
        String consulta1 = "Insert into Curso_Requisito(codigoCurso, codigoCursoReq ) values ('" + codigoCurso + "','" + codigoCursoReq + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta1);
    }
    
    public static void RegistrarCo(String codigoCurso, String codigoCursoCo) {
        String consulta1 = "Insert into Curso_Correqisito(codigoCurso, codigoCursoCO) values ('" + codigoCurso + "','" + codigoCursoCo + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta1);
        String consulta2 = "Insert into Curso_Correqisito(codigoCurso, codigoCursoCO) values ('" + codigoCursoCo + "','" + codigoCurso + "');";
        Modelo.ConexionSQL.consultaRegistar(consulta2);
    }
}

package Controlador;

import Vistas.Menu;

/**
 *
 * @author valem
 */
public class ConEliminarCursoReq {

    static Vistas.Menu menu = new Menu();
//llama a la ventana anterior 

    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroCurso.setVisible(false);
    }

    public static void Eliminar(String codCurso, String codCursoReq) {
        String consulta1 = "delete from  Curso_Requisito where codigoCurso =  '" + codCurso + "' AND codigoCursoReq = '" + codCursoReq + "'";
        Modelo.ConexionSQL.consultaEliminiar(consulta1);
    }
}

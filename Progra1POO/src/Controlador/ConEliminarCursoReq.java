package Controlador;

import Vistas.Menu;

/**
 * Clase controlador de la vista eliminar un req de un curso
 *
 * @author valem
 * @author nathb
 */
public class ConEliminarCursoReq {

    static Vistas.Menu menu = new Menu();

    /**
     * llama a la ventana anterior
     */
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroCurso.setVisible(false);
    }

    /**
     * elimina un requisito de un curso
     *
     * @param codCurso cosigo del curso
     * @param codCursoReq codigo del curso que es requisito que se quiere
     * eliminar
     *
     */
    public static void Eliminar(String codCurso, String codCursoReq) {
        String consulta1 = "delete from  Curso_Requisito where codigoCurso =  '" + codCurso + "' AND codigoCursoReq = '" + codCursoReq + "'";
        Modelo.ConexionSQL.consultaEliminiar(consulta1);
    }
}

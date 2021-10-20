package Controlador;

import Vistas.Menu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author valem
 */
public class ConEliminarCurso {

    static Vistas.Menu menu = new Menu();
//llama a la ventana anterior 

    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.registroCurso.setVisible(false);
    }

    public static void Eliminar(String codCurso) {
        try {
            String consulta1 = "SELECT numPlan FROM dbo.PlanEstudio_Curso WHERE codigoCurso = '" + codCurso + "'";
            ResultSet res = Modelo.ConexionSQL.consulta(consulta1);
            if (!res.next()) {
                String consulta2 = "DELETE FROM  Curso WHERE codigoCurso =  '"+codCurso+"'";
                Modelo.ConexionSQL.consultaEliminiar(consulta2);
            } else {
              JOptionPane.showMessageDialog(null, "No se ha podido eliminar el curso, puesto que este eprtenece a un plan de estudio");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConEliminarCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

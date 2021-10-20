package Controlador;

import Vistas.Menu;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase controlador de la vista consultar correquisto de un curso
 *
 * @author valem
 * @author nathb
 */
public class ConConsultaCursoCo {

    static Vistas.Menu menu = new Menu();

    /**
     * llama a la ventana anterior
     */
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.consultaPlan.setVisible(false);
    }

    /**
     * realiza y muestra la consulta de ub correquisito de un curso
     *
     * @param codCurso codigo del curso del cual se desean cosultar los
     * correquisitos
     */
    public static void ConsultarCo(String codCurso) {
        try {
            DefaultTableModel model = (DefaultTableModel) Vistas.ConsultaCursoCo.tblConsultaCurso.getModel();
            model.setRowCount(0);
            String consulta = "Select distinct curco.codigoCursoCO AS 'Correquerimiento', Curso.nombreCurso AS 'Nombre curso'\n"
                    + "from Curso cur\n"
                    + "inner join Curso_Correqisito curco\n"
                    + "ON (Cur.codigoCurso= curco.codigoCurso)\n"
                    + "join Curso  \n"
                    + "ON (Curso.codigoCurso = curco.codigoCursoCO)"
                    + "WHERE cur.codigoCurso ='" + codCurso + "' ";
            ResultSet res = Modelo.ConexionSQL.consulta(consulta);
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                model.addRow(v);
                Vistas.ConsultaCursoCo.tblConsultaCurso.setModel(model);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error conexion", JOptionPane.ERROR_MESSAGE);
        }

    }
}

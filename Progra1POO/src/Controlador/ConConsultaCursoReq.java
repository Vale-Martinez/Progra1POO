package Controlador;

import Vistas.Menu;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author valem
 */
public class ConConsultaCursoReq {

    static Vistas.Menu menu = new Menu();

    //llama a la ventana anterior 
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.consultaPlan.setVisible(false);
    }

    public static void ConsultarReq(String codCurso) {
        try {
            DefaultTableModel model = (DefaultTableModel) Vistas.ConsultaCursoReq.tblConsultaCurso.getModel();
            model.setRowCount(0);
            String consulta = "Select distinct curreq.codigoCursoReq AS 'Requerimiento', Curso.nombreCurso AS 'Nombre curso'\n"
                    + "from Curso cur\n"
                    + "inner join Curso_Requisito curreq\n"
                    + "ON (Cur.codigoCurso= curreq.codigoCurso)\n"
                    + "join Curso  \n"
                    + "ON (Curso.codigoCurso = curreq.codigoCursoReq)"
                    + "WHERE cur.codigoCurso ='" + codCurso + "' ";
            ResultSet res = Modelo.ConexionSQL.consulta(consulta);
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                model.addRow(v);
                Vistas.ConsultaCursoReq.tblConsultaCurso.setModel(model);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error conexion", JOptionPane.ERROR_MESSAGE);
        }

    }
}

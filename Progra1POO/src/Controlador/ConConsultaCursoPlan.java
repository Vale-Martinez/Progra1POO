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
public class ConConsultaCursoPlan {

    static Vistas.Menu menu = new Menu();

    //llama a la ventana anterior 
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.consultaPlan.setVisible(false);
    }

    public static void ConsultarCurso(String codCurso) {
        try {
            DefaultTableModel model = (DefaultTableModel) Vistas.ConsultaCursoPlan.tblConsultaCurso.getModel();
            model.setRowCount(0);
            String consulta = "Select distinct PlanEstudio.numPlan, PlanEstudio.fechaVigencia, Escuela.codigoEscuela\n"
                    + "from Escuela inner join Escuela_PlanEstudio \n"
                    + "ON (Escuela.codigoEscuela = Escuela_PlanEstudio.codigoEscuela)\n"
                    + "inner join PlanEstudio \n"
                    + "ON (Escuela_PlanEstudio.numPlan = PlanEstudio.numPlan)\n"
                    + "inner join PlanEstudio_Curso \n"
                    + "ON (Escuela_PlanEstudio.numPlan = PlanEstudio_Curso.numPlan)\n"
                    + "inner join Curso cur\n"
                    + "ON (PlanEstudio_Curso.codigoCurso = Cur.codigoCurso)"
                    + "WHERE cur.codigoCurso ='" + codCurso + "' ";
            ResultSet res = Modelo.ConexionSQL.consulta(consulta);
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getDate(2));
                v.add(res.getString(3));
                model.addRow(v);
               Vistas.ConsultaCursoPlan.tblConsultaCurso.setModel(model);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error conexion", JOptionPane.ERROR_MESSAGE);
        }

    }
}

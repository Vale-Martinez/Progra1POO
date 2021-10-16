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
public class ConConsultaPlan {

    static Vistas.Menu menu = new Menu();

    //llama a la ventana anterior 
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.consultaPlan.setVisible(false);
    }

    public static void ConsultarPlan(int numPlan, String CodigoEsc) {
        try {
            DefaultTableModel model = (DefaultTableModel) Vistas.ConsultaPlan.tblConsultaPlan.getModel();
            model.setRowCount(0);
            String consulta = "Select distinct Cur.codigoCurso,cur.nombreCurso,cur.bloque ,cur.horasLectivas,cur.creditos\n"
                    + "from Escuela inner join Escuela_PlanEstudio \n"
                    + "ON (Escuela.codigoEscuela = Escuela_PlanEstudio.codigoEscuela)\n"
                    + "inner join PlanEstudio_Curso \n"
                    + "ON (Escuela_PlanEstudio.numPlan = PlanEstudio_Curso.numPlan)\n"
                    + "inner join Curso cur\n"
                    + "ON (PlanEstudio_Curso.codigoCurso = Cur.codigoCurso)"
                    + "WHERE Escuela_PlanEstudio.numPlan =" + numPlan+" "
                    + "AND escuela.codigoEscuela ='"+ CodigoEsc+"';";
            ResultSet res = Modelo.ConexionSQL.consulta(consulta);
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getInt(3));
                v.add(res.getInt(4));
                v.add(res.getInt(5));
                model.addRow(v);
                Vistas.ConsultaPlan.tblConsultaPlan.setModel(model);
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error conexion", JOptionPane.ERROR_MESSAGE);
        }

    }
}

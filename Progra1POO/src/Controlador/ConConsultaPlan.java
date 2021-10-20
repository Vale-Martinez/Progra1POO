package Controlador;

import Vistas.EnvioPDF;
import Vistas.Menu;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase controlador de la vista consultar correquisto de un plan
 *
 * @author valem
 * @author nathb
 */
public class ConConsultaPlan {

    static Vistas.Menu menu = new Menu();
    static Vistas.EnvioPDF envioPDF = new EnvioPDF();

    static int numPlanC, totalCreditosC, totalCursosC;
    static String codigoEscC;

    /**
     * llama a la ventana anterior
     */
    public static void Regresar() {
        menu.setVisible(true);
        Controlador.ConMenu.consultaPlan.setVisible(false);
    }

    /**
     * realiza y muestra la consulta de un plan
     *
     * @param numPlan numero del plan que se desea consultar
     * @param codigoEsc codigo de la escuela a la que pertenece
     */
    public static void ConsultarPlan(int numPlan, String codigoEsc) {
        try {
            numPlanC = numPlan;
            codigoEscC = codigoEsc;

            DefaultTableModel model = (DefaultTableModel) Vistas.ConsultaPlan.tblConsultaPlan.getModel();
            model.setRowCount(0);
            String consulta = "Select distinct Cur.codigoCurso,cur.nombreCurso,cur.bloque ,cur.horasLectivas,cur.creditos\n"
                    + "from Escuela inner join Escuela_PlanEstudio \n"
                    + "ON (Escuela.codigoEscuela = Escuela_PlanEstudio.codigoEscuela)\n"
                    + "inner join PlanEstudio_Curso \n"
                    + "ON (Escuela_PlanEstudio.numPlan = PlanEstudio_Curso.numPlan)\n"
                    + "inner join Curso cur\n"
                    + "ON (PlanEstudio_Curso.codigoCurso = Cur.codigoCurso)"
                    + "WHERE Escuela_PlanEstudio.numPlan =" + numPlan + " "
                    + "AND escuela.codigoEscuela ='" + codigoEsc + "';";
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

            String consulta2 = "Select distinct count (Cur.codigoCurso) as totalCursos, sum (cur.creditos) as totalCreditos\n"
                    + "from Escuela inner join Escuela_PlanEstudio \n"
                    + "ON (Escuela.codigoEscuela = Escuela_PlanEstudio.codigoEscuela)\n"
                    + "inner join PlanEstudio_Curso \n"
                    + "ON (Escuela_PlanEstudio.numPlan = PlanEstudio_Curso.numPlan)\n"
                    + "inner join Curso cur\n"
                    + "ON (PlanEstudio_Curso.codigoCurso = Cur.codigoCurso)"
                    + "WHERE Escuela_PlanEstudio.numPlan =" + numPlan + " "
                    + "AND escuela.codigoEscuela ='" + codigoEsc + "';";
            ResultSet res2 = Modelo.ConexionSQL.consulta(consulta2);
            while (res2.next()) {
                Vector v = new Vector();
                v.add(res2.getInt(1));
                v.add(res2.getInt(2));
                Vistas.ConsultaPlan.LblTotalCursos.setText(v.get(0).toString());
                totalCursosC = Integer.parseInt(v.get(0).toString());
                Vistas.ConsultaPlan.LblTotalCreditos.setText(v.get(1).toString());
                totalCreditosC = Integer.parseInt(v.get(1).toString());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error conexion", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * abrela la vista de enviar el PDF
     */
    public static void AbrirEnviarPDF() {
        envioPDF.setVisible(true);
    }

    //crea el pdf para la factura
    private static String Crearpdf() throws SQLException {

        //crea la direccion donde se va a guardar el pdf y como se va a llamar y su contenido 
        String nombreDoc = "Plan " + numPlanC;
        String Path = "C:\\Users\\valem\\Desktop\\TEC\\2021\\POO proyectos\\Progra 1\\" + nombreDoc;
        String encabezado = "Plan de estudios = " + numPlanC + "\n"
                + "Codigo Escuela a cargo = " + codigoEscC + "\nTotal de cursos = " + totalCursosC + "\n"
                + "Total de creditos = " + totalCreditosC + "\n ";

        String cursos = "[Codigo Curso, Nombre Curso, Bloque, Horas Lectivas, Creditos] \n";

        String consulta = "Select distinct Cur.codigoCurso,cur.nombreCurso,cur.bloque ,cur.horasLectivas,cur.creditos\n"
                + "from Escuela inner join Escuela_PlanEstudio \n"
                + "ON (Escuela.codigoEscuela = Escuela_PlanEstudio.codigoEscuela)\n"
                + "inner join PlanEstudio_Curso \n"
                + "ON (Escuela_PlanEstudio.numPlan = PlanEstudio_Curso.numPlan)\n"
                + "inner join Curso cur\n"
                + "ON (PlanEstudio_Curso.codigoCurso = Cur.codigoCurso)"
                + "WHERE Escuela_PlanEstudio.numPlan =" + numPlanC + " "
                + "AND escuela.codigoEscuela ='" + codigoEscC + "';";
        ResultSet res = Modelo.ConexionSQL.consulta(consulta);
        while (res.next()) {
            Vector v = new Vector();
            v.add(res.getString(1));
            v.add(res.getString(2));
            v.add(res.getInt(3));
            v.add(res.getInt(4));
            v.add(res.getInt(5));
            cursos += v.toString() + "\n";
        }
        String contenido = encabezado + cursos;
        //Crea el documento pdf 
        try {
            FileOutputStream archivo = new FileOutputStream(Path + ".pdf");
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            doc.add(new Paragraph(contenido));
            doc.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }

        return Path + ".pdf";
    }

    //funcion que manda el correo 
    private static boolean EnviarCorreo(String destinatario, String direccionArchivo) {
        // Correo desde donde se va a mandar 
        String username = "trabajoa.ATI@gmail.com";
        String password = "nbt123nbt";

        // Autenticación 
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        // Crear el email
        Message msg = new MimeMessage(session);
        try {
            msg.setFrom(new InternetAddress("no-reply@gmail.com"));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            // Título para el correo
            msg.setSubject("Gestor de Planes de Estudio");

            Multipart emailContent = new MimeMultipart();

            // Crea el texto del mensaje
            MimeBodyPart text = new MimeBodyPart();
            text.setText("A continuación se adjunta la infomación del plan de estudios solicitados.");

            // Carga el archivo adjunto
            MimeBodyPart attachment = new MimeBodyPart();
            attachment.attachFile(direccionArchivo);

            // Agrega las partes al contenido
            emailContent.addBodyPart(text);
            emailContent.addBodyPart(attachment);

            // Agrega el contenido al mensaje
            msg.setContent(emailContent);

            Transport.send(msg);
            System.out.println("Sent message");
        } catch (MessagingException e) {
            System.out.println("Error al enviar el correo.");
            return false;
        } catch (IOException e) {
            System.out.println("Error al intentar abrir el archivo");
            return false;
        }
        return true;
    }

    /**
     * realiza el envio de del plan por corre
     *
     * @param Email correo electronico al que se desea enviar
     */
    public static void Envio(String Email) {
        try {
            String PATH = Crearpdf();
            EnviarCorreo(Email, PATH);

        } catch (SQLException ex) {
            Logger.getLogger(ConConsultaPlan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

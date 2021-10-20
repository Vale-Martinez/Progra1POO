package Modelo;

import java.util.ArrayList;

/**
 * Clase modelo de los obejtos escuela
 *
 * @author valem
 * @author nathb
 */
public class Escuela {

    private String nombreEscuela;
    private String codigoEscuela;
    private ArrayList<PlanEstudio> planes;

    public ArrayList<PlanEstudio> getPlanes() {
        return planes;
    }

    public void setPlanes(ArrayList<PlanEstudio> planes) {
        this.planes = planes;
    }

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }

    public String getCodigoEscuela() {
        return codigoEscuela;
    }

    public void setCodigoEscuela(String codigoEscuela) {
        this.codigoEscuela = codigoEscuela;
    }

    /**
     * constructor de la clase
     *
     * @param codigoEscuela codigo que se le desea asignar a la escuela
     * @param nombreEscuela nombre de la escuela
     */
    public Escuela(String codigoEscuela, String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
        this.codigoEscuela = codigoEscuela;
        this.planes = null;
    }

    /**
     * Agrega un plan a una escuela
     *
     * @param plan plan de estudios a agregar
     */
    public void AgregarPlan(PlanEstudio plan) {
        planes.add(plan);
    }

    /**
     * elimina un plan de una escuela
     *
     * @param plan plan de estudios a eliminar
     */
    public void EliminarRequisito(PlanEstudio plan) {
        planes.remove(plan);
    }

}

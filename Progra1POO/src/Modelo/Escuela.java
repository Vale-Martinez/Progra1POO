package Modelo;

import java.util.ArrayList;

/**
 *
 * @author valem
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

    public Escuela(String nombreEscuela, String codigoEscuela) {
        this.nombreEscuela = nombreEscuela;
        this.codigoEscuela = codigoEscuela;
        this.planes = null;
    }

    
    
    
}

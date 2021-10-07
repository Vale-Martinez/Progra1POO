package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author valem
 */
public class PlanEstudio {

    private int numPlan;
    private LocalDate fechaVigencia;
    private ArrayList<Bloque> bloques;

    public int getNumPlan() {
        return numPlan;
    }

    public void setNumPlan(int numPlan) {
        this.numPlan = numPlan;
    }

    public LocalDate getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(LocalDate fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public ArrayList<Bloque> getBloques() {
        return bloques;
    }

    public void setBloques(ArrayList<Bloque> bloques) {
        this.bloques = bloques;
    }

    public PlanEstudio(int numPlan, LocalDate fechaVigencia) {
        this.numPlan = numPlan;
        this.fechaVigencia = fechaVigencia;
        this.bloques = null;
    }

    
    
    
}

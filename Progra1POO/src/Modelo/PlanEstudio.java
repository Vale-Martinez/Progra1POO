package Modelo;

import java.sql.Date;

/**
 * Clase modelo de los obejtos plan de estudio
 *
 * @author valem
 * @author nathb
 */
public class PlanEstudio {

    private int numPlan;
    private Date fechaVigencia;

    public int getNumPlan() {
        return numPlan;
    }

    public void setNumPlan(int numPlan) {
        this.numPlan = numPlan;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    /**
     * Constructor de la clase
     *
     * @param numPlan numero de plan
     * @param fechaVigencia fecha de vigencia del plan
     */
    public PlanEstudio(int numPlan, Date fechaVigencia) {
        this.numPlan = numPlan;
        this.fechaVigencia = fechaVigencia;
    }

}

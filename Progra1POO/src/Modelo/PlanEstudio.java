package Modelo;

import java.sql.Date;



/**
 *
 * @author valem
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


    public PlanEstudio(int numPlan, Date fechaVigencia) {
        this.numPlan = numPlan;
        this.fechaVigencia = fechaVigencia;
    }

    
    
    
}

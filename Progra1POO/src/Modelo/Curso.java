package Modelo;

import java.util.ArrayList;

/**
 *
 * @author valem
 */
public class Curso {

    private String nombreCurso;
    private String codigoCurso;
    private int bloque;
    private int creditosCurso;
    private int horasLectivas;
    private ArrayList<Curso> requisitos;
    private ArrayList<Curso> correquisito;

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public int getCreditosCurso() {
        return creditosCurso;
    }

    public void setCreditosCurso(int creditosCurso) {
        this.creditosCurso = creditosCurso;
    }

    public int getHorasLectivas() {
        return horasLectivas;
    }

    public void setHorasLectivas(int horasLectivas) {
        this.horasLectivas = horasLectivas;
    }

    public ArrayList<Curso> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(ArrayList<Curso> requisitos) {
        this.requisitos = requisitos;
    }

    public ArrayList<Curso> getCorrequisito() {
        return correquisito;
    }

    public void setCorrequisito(ArrayList<Curso> correquisito) {
        this.correquisito = correquisito;
    }

    public Curso(String nombreCurso, String codigoCurso, int bloque, int creditosCurso, int horasLectivas) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.bloque = bloque;
        this.creditosCurso = creditosCurso;
        this.horasLectivas = horasLectivas;
        this.requisitos = null;
        this.correquisito = null;
    }


    
}

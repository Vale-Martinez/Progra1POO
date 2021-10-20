package Modelo;

import java.util.ArrayList;

/**
 * Clase modelo de los obejtos curso
 *
 * @author valem
 * @author nathb
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

    /**
     * Constructor de la clase
     *
     * @param nombreCurso nombr del curso
     * @param codigoCurso codigo del curso esta compuesto por dos letras y
     * cuatro numeros
     * @param bloque numero de bloque al que pertenece
     * @param creditosCurso cantidad de creditos de 0 a 4
     * @param horasLectivas horas lectivas, un valor numero de entre 1 y 5
     */
    public Curso(String nombreCurso, String codigoCurso, int bloque, int creditosCurso, int horasLectivas) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.bloque = bloque;
        this.creditosCurso = creditosCurso;
        this.horasLectivas = horasLectivas;
        this.requisitos = null;
        this.correquisito = null;
    }

    /**
     *Agrega un curso como requisito de otro
     * @param requisito curso que sera requisto
     */
    public void AgregarRequisito(Curso requisito) {
        requisitos.add(requisito);
    }

    /**
     *elimina un curso como requisito de otro
     * @param requisito curso que sera requisto
     */
    public void EliminarRequisito(Curso requisito) {
        requisitos.remove(requisito);
    }
    
    /**
     *Agrega un curso como correquisito de otro
     * @param correquisito curso que sera requisto
     */
    public void AgregarCorrequisito(Curso correquisito) {
        requisitos.add(correquisito);
    }

}

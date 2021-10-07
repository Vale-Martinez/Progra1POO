package Modelo;

import java.util.ArrayList;

/**
 *
 * @author valem
 */
public class Bloque {
private String nombreBloque;
private int numeroBloque;
private String codigoBloque;
private ArrayList<Curso> cursos;

    public String getNombreBloque() {
        return nombreBloque;
    }

    public void setNombreBloque(String nombreBloque) {
        this.nombreBloque = nombreBloque;
    }

    public int getNumeroBloque() {
        return numeroBloque;
    }

    public void setNumeroBloque(int numeroBloque) {
        this.numeroBloque = numeroBloque;
    }

    public String getCodigoBloque() {
        return codigoBloque;
    }

    public void setCodigoBloque(String codigoBloque) {
        this.codigoBloque = codigoBloque;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public Bloque(String nombreBloque, int numeroBloque, String codigoBloque) {
        this.nombreBloque = nombreBloque;
        this.numeroBloque = numeroBloque;
        this.codigoBloque = codigoBloque;
        this.cursos = null;
    }


}

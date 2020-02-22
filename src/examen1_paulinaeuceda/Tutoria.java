package examen1_paulinaeuceda;

import java.util.ArrayList;

public class Tutoria {

    private int hora, aula, dia;
    private String clase;
    private String mes;
    private int año;
    private String tema;
    private Tutor tutor;
    private ArrayList<Alumno> alumnos=new ArrayList();

    public Tutoria() {
    }

    public Tutoria(int hora, int aula, int dia, String clase, String mes, int año, String tema, Tutor tutor) {
        this.hora = hora;
        this.aula = aula;
        this.dia = dia;
        this.clase = clase;
        this.mes = mes;
        this.año = año;
        this.tema = tema;
        this.tutor = tutor;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    

    @Override
    public String toString() {
        return super.toString();
    }

}

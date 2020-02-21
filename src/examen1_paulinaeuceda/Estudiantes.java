package examen1_paulinaeuceda;

import java.util.ArrayList;

public class Estudiantes extends Alumno{
    private int conocimiento;
    private int enseñanza;
    ArrayList<Examen> Examenes;

    public Estudiantes(int conocimiento, int enseñanza, ArrayList<Examen> Examenes, String nombre, int edad, String carrera, String lugar, int cuenta, String usuario, String contraseña) {
        super(nombre, edad, carrera, lugar, cuenta, usuario, contraseña);
        this.conocimiento = conocimiento;
        this.enseñanza = enseñanza;
        this.Examenes = Examenes;
    }

    public int getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(int conocimiento) {
        this.conocimiento = conocimiento;
    }

    public int getEnseñanza() {
        return enseñanza;
    }

    public void setEnseñanza(int enseñanza) {
        this.enseñanza = enseñanza;
    }

    public ArrayList<Examen> getExamenes() {
        return Examenes;
    }

    public void setExamenes(ArrayList<Examen> Examenes) {
        this.Examenes = Examenes;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "conocimiento=" + conocimiento + ", ense\u00f1anza=" + enseñanza + ", Examenes=" + Examenes + '}';
    }
    
    
}

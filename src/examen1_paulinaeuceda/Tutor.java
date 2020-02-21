package examen1_paulinaeuceda;

import java.util.ArrayList;

public class Tutor extends Alumno{
    private int ganancias;
    private int tutorias;
    private int enseñanza;
    ArrayList<String> clases;

    public Tutor() {
    }

    public Tutor(int ganancias, int tutorias, int enseñanza, ArrayList<String> clases, String nombre, int edad, String carrera, String lugar, int cuenta, String usuario, String contraseña) {
        super(nombre, edad, carrera, lugar, cuenta, usuario, contraseña);
        this.ganancias = ganancias;
        this.tutorias = tutorias;
        this.enseñanza = enseñanza;
        this.clases = clases;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public int getTutorias() {
        return tutorias;
    }

    public void setTutorias(int tutorias) {
        this.tutorias = tutorias;
    }

    public int getEnseñanza() {
        return enseñanza;
    }

    public void setEnseñanza(int enseñanza) {
        this.enseñanza = enseñanza;
    }

    public ArrayList<String> getClases() {
        return clases;
    }

    public void setClases(ArrayList<String> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Tutor{" + "ganancias=" + ganancias + ", tutorias=" + tutorias + ", ense\u00f1anza=" + enseñanza + ", clases=" + clases + '}';
    }
    
    
}

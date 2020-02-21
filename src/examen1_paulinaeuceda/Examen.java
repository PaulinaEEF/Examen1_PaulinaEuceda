package examen1_paulinaeuceda;

public class Examen {
    private String clase;
    private int conocimiento;
    private String tema;
    private int puntaje;

    public Examen(String clase, int conocimiento, String tema, int puntaje) {
        this.clase = clase;
        this.conocimiento = conocimiento;
        this.tema = tema;
        this.puntaje = puntaje;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(int conocimiento) {
        this.conocimiento = conocimiento;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Examen{" + "clase=" + clase + ", conocimiento=" + conocimiento + ", tema=" + tema + ", puntaje=" + puntaje + '}';
    }
    
    
}

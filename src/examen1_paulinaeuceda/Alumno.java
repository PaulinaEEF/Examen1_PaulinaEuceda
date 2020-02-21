package examen1_paulinaeuceda;

public class Alumno{
    private String nombre;
    private int edad;
    private String carrera;
    private String lugar;
    private int cuenta;
    private String usuario;
    private String contraseña;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, String carrera, String lugar, int cuenta, String usuario, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.lugar = lugar;
        this.cuenta = cuenta;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + ", lugar=" + lugar + ", cuenta=" + cuenta + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
    
    
}

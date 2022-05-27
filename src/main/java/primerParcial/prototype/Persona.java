package primerParcial.prototype;

public class Persona {
    private String nombre;
    private String apellido;
    private int ci;

    public Persona(String nombre,String apellido, int ci){
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}

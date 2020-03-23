package Clases;

public class Paciente {
    
    private final long cedula;
    private final String primernombre;
    private final String primerapellido;
    private String correo;
    private int edad;
    private long telefono;

    public Paciente(long cedula, String primernombre, String primerapellido, String correo, int edad, long telefono) {
        this.cedula = cedula;
        this.primernombre = primernombre;
        this.primerapellido = primerapellido;
        this.correo = correo;
        this.edad = edad;
        this.telefono = telefono;
    }

    public long getCedula() {
        return cedula;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

   
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

   

}

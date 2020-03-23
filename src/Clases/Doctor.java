package Clases;

public class Doctor {

    private final long cedula;
    private final String primernombre;
    private final String primerapellido;
    private long telefono;
    private String correo;
    private int tipomedico;
    private long idarea;
    private String nombredelarea;
    private int posdelarea;

    public Doctor(long cedula, String primernombre, String primerapellido, long telefono, String correo, int tipomedico, long idarea, String nombredelarea, int posdelarea) {
        this.cedula = cedula;
        this.primernombre = primernombre;
        this.primerapellido = primerapellido;
        this.telefono = telefono;
        this.correo = correo;
        this.tipomedico = tipomedico;
        this.idarea = idarea;
        this.nombredelarea = nombredelarea;
        this.posdelarea = posdelarea;
    }

    public long getIdarea() {
        return idarea;
    }

    public void setIdarea(long idarea) {
        this.idarea = idarea;
    }

    public String getNombredelarea() {
        return nombredelarea;
    }

    public void setNombredelarea(String nombredelarea) {
        this.nombredelarea = nombredelarea;
    }

    public int getPosdelarea() {
        return posdelarea;
    }

    public void setPosdelarea(int posdelarea) {
        this.posdelarea = posdelarea;
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

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTipomedico() {
        return tipomedico;
    }

    public void setTipomedico(int tipomedico) {
        this.tipomedico = tipomedico;
    }

}

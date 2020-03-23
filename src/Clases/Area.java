package Clases;

public class Area {

    private final int id;
    private String nombredelarea;
    private String descdelarea;

    public Area(int id, String nombredelarea, String descdelarea) {
        this.id = id;
        this.nombredelarea = nombredelarea;
        this.descdelarea = descdelarea;
    }

    public int getId() {
        return id;
    }

    public String getNombredelarea() {
        return nombredelarea;
    }

    public void setNombredelarea(String nombredelarea) {
        this.nombredelarea = nombredelarea;
    }

    public String getDescdelarea() {
        return descdelarea;
    }

    public void setDescdelarea(String descdelarea) {
        this.descdelarea = descdelarea;
    }

}

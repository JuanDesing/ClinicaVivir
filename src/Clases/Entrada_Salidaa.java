/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author SENA
 */
public class Entrada_Salidaa {

    private final String nombre;
    private final Long cedula;
    private java.util.Date fecha_ingreso;
    private java.util.Date fecha_salida;
    private String estado_paciente;
    private int posicionestado_paciente;
    private String doctasig;
    private int posdoctasig;
    private String tipodedoct;
    private float apagar;

    public Entrada_Salidaa(String nombre, Long cedula, Date fecha_ingreso, Date fecha_salida, String estado_paciente, int posicionestado_paciente, String doctasig, int posdoctasig, String tipodedoct, float apagar) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.estado_paciente = estado_paciente;
        this.posicionestado_paciente = posicionestado_paciente;
        this.doctasig = doctasig;
        this.posdoctasig = posdoctasig;
        this.tipodedoct = tipodedoct;
        this.apagar = apagar;
    }

    public String getTipodedoct() {
        return tipodedoct;
    }

    public void setTipodedoct(String tipodedoct) {
        this.tipodedoct = tipodedoct;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getCedula() {
        return cedula;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getEstado_paciente() {
        return estado_paciente;
    }

    public void setEstado_paciente(String estado_paciente) {
        this.estado_paciente = estado_paciente;
    }

    public int getPosicionestado_paciente() {
        return posicionestado_paciente;
    }

    public void setPosicionestado_paciente(int posicionestado_paciente) {
        this.posicionestado_paciente = posicionestado_paciente;
    }

    public String getDoctasig() {
        return doctasig;
    }

    public void setDoctasig(String doctasig) {
        this.doctasig = doctasig;
    }

    public int getPosdoctasig() {
        return posdoctasig;
    }

    public void setPosdoctasig(int posdoctasig) {
        this.posdoctasig = posdoctasig;
    }

    public float getApagar() {
        return apagar;
    }

    public void setApagar(float apagar) {
        this.apagar = apagar;
    }

}

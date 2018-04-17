/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

import java.io.Serializable;

/**
 *
 * @author T-102
 */
public class Alumno  implements Serializable
{
    private String nombre;
    private String apP;
    private String apM;
    private Long nocuenta;
    private Float calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApP() {
        return apP;
    }

    public void setApP(String apP) {
        this.apP = apP;
    }

    public String getApM() {
        return apM;
    }

    public void setApM(String apM) {
        this.apM = apM;
    }

    public Long getNocuenta() {
        return nocuenta;
    }

    public void setNocuenta(Long nocuenta) {
        this.nocuenta = nocuenta;
    }

    public Float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Float calificacion) {
        this.calificacion = calificacion;
    }

    public Alumno() {
    }

    public Alumno(String nombre, String apP, String apM, Long nocuenta, Float calificacion) {
        this.nombre = nombre;
        this.apP = apP;
        this.apM = apM;
        this.nocuenta = nocuenta;
        this.calificacion = calificacion;
    }
    
    
    
}

package com.gestor.notas.modelo;


import jakarta.persistence.*;

@Entity
@Table (name = "tarea")
public class tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ida;

    @Column (name = "catedratico" )
    private String catedratico;

    @Column (name = "grado" )
    private String grado;

    @Column (name = "seccion" )
    private String seccion;

    @Column (name = "descripcion" )
    private String descripcion;

    @Column (name = "puntuacion" )
    private int puntuacion;

    @Column (name = "fecha_entrega" )
    private String fecha_entrega;

    public tarea () {}

    public tarea(int ida, String catedratico, String grado, String seccion, String descripcion, int puntuacion, String fecha_entrega) {
        this.ida = ida;
        this.catedratico = catedratico;
        this.grado = grado;
        this.seccion = seccion;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
        this.fecha_entrega = fecha_entrega;
    }

    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }

    public String getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(String catedratico) {
        this.catedratico = catedratico;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
}

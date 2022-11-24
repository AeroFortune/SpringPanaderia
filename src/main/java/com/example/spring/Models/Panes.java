package com.example.spring.Models;

public class Panes {
    private String nombre;
    private String fotoUrl;
    private String descripcion;

    public Panes(String nombre, String fotoUrl, String descripcion) {
        this.nombre = nombre;
        this.fotoUrl = fotoUrl;
        this.descripcion = descripcion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFotoUrl() {
        return fotoUrl;
    }
    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

}

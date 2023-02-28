package com.iesam.sevillafc.domain.models;

public class Equipo {
    private String id;
    private String nombre;
    private String categoria;
    private Integer jugadores;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getJugadores() {
        return jugadores;
    }

    public void setJugadores(Integer jugadores) {
        this.jugadores = jugadores;
    }
}

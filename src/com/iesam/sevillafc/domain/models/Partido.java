package com.iesam.sevillafc.domain.models;

public class Partido {
    private String id;
    private Equipo eLocal;
    private Equipo eVisitante;
    private Arbitro arbitro;
    private String fechaPartido;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Equipo geteLocal() {
        return eLocal;
    }

    public void seteLocal(Equipo eLocal) {
        this.eLocal = eLocal;
    }

    public Equipo geteVisitante() {
        return eVisitante;
    }

    public void seteVisitante(Equipo eVisitante) {
        this.eVisitante = eVisitante;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }
}

package com.iesam.sevillafc.domain;

import com.iesam.sevillafc.domain.models.Equipo;

import java.util.List;

public interface EquipoRepository {
    public void save(Equipo equipo);

    public Equipo findById(String equipoId);

    public List<Equipo> getAll();
}

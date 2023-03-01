package com.iesam.sevillafc.domain;

import com.iesam.sevillafc.domain.models.Partido;

import java.util.List;

public interface PartidoRepository {

    public void save(Partido partido);

    public Partido findById(String partidoId);

    public void delete(String partidoId);

    public List<Partido> getAll();
}

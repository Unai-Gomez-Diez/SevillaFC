package com.iesam.sevillafc.domain;

import com.iesam.sevillafc.domain.models.Arbitro;

import java.util.List;

public interface ArbitroRepository {

    public void save(Arbitro arbitro);

    public Arbitro findById(String arbitroId);

    public void delete(String arbitroId);
}

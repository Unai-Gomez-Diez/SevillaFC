package com.iesam.sevillafc.domain.usecase;

import com.iesam.sevillafc.data.EquipoDataRepository;
import com.iesam.sevillafc.domain.EquipoRepository;
import com.iesam.sevillafc.domain.models.Equipo;
import com.iesam.sevillafc.domain.models.Jugador;

import java.util.List;

public class GetEquipoUseCase {

    private EquipoRepository equipoRepository;

    public GetEquipoUseCase(EquipoRepository equipoRepository){
        this.equipoRepository=equipoRepository;
    }

    public Equipo execute(String jugadorId){
        return this.equipoRepository.findById(jugadorId);
    }

}

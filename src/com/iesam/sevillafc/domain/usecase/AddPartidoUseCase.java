package com.iesam.sevillafc.domain.usecase;

import com.iesam.sevillafc.domain.PartidoRepository;
import com.iesam.sevillafc.domain.models.Partido;

public class AddPartidoUseCase {

    private PartidoRepository partidoRepository;

    public void AddPartidoUseCase(PartidoRepository partidoRepository){
        this.partidoRepository=partidoRepository;
    }

    public void execute(Partido partido){
        partidoRepository.save(partido);
    }
}

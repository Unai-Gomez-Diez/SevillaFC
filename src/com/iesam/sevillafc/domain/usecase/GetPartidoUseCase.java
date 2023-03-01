package com.iesam.sevillafc.domain.usecase;

import com.iesam.sevillafc.domain.PartidoRepository;
import com.iesam.sevillafc.domain.models.Partido;

public class GetPartidoUseCase {

    private PartidoRepository partidoRepository;

    public GetPartidoUseCase(PartidoRepository partidoRepository){
        this.partidoRepository=partidoRepository;
    }

    public Partido execute(String partidoId){
        return partidoRepository.findById(partidoId);
    }

}

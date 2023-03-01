package com.iesam.sevillafc.domain.usecase;

import com.iesam.sevillafc.data.PartidoDataRepository;
import com.iesam.sevillafc.domain.PartidoRepository;
import com.iesam.sevillafc.domain.models.Partido;

import java.util.List;

public class GetPartidosUseCase {
    private PartidoRepository partidoRepository;

    public GetPartidosUseCase(PartidoRepository partidoRepository){
        this.partidoRepository=partidoRepository;
    }

    public List<Partido> execute(){
        return this.partidoRepository.getAll();
    }
}

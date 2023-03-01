package com.iesam.sevillafc.presentation;

import com.iesam.sevillafc.data.PartidoDataRepository;
import com.iesam.sevillafc.data.local.PartidoFileLocalDataSource;
import com.iesam.sevillafc.domain.models.Partido;
import com.iesam.sevillafc.domain.usecase.GetPartidosUseCase;

import java.util.List;

public class PrintPartidoView {
    public void print(){
        GetPartidosUseCase getPartidosUseCase = new GetPartidosUseCase(new PartidoDataRepository(PartidoFileLocalDataSource.getInstance()));
        List<Partido> partidos = getPartidosUseCase.execute();
        for(Partido partido : partidos){
            System.out.println(partido.toString());
        }
    }
}

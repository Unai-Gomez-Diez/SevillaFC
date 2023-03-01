package com.iesam.sevillafc.presentation;

import com.iesam.sevillafc.data.ArbitroDataRepository;
import com.iesam.sevillafc.data.EquipoDataRepository;
import com.iesam.sevillafc.data.PartidoDataRepository;
import com.iesam.sevillafc.data.local.ArbitroFileLocalDataSource;
import com.iesam.sevillafc.data.local.EquipoFileLocalDataSource;
import com.iesam.sevillafc.data.local.PartidoFileLocalDataSource;
import com.iesam.sevillafc.domain.models.Arbitro;
import com.iesam.sevillafc.domain.models.Equipo;
import com.iesam.sevillafc.domain.models.Partido;
import com.iesam.sevillafc.domain.usecase.AddPartidoUseCase;
import com.iesam.sevillafc.domain.usecase.GetArbitroUseCase;
import com.iesam.sevillafc.domain.usecase.GetEquipoUseCase;

public class NewPartidoForm {
    private Equipo findEquipo(String equipoId){
        GetEquipoUseCase getEquipoUseCase = new GetEquipoUseCase(new EquipoDataRepository(EquipoFileLocalDataSource.getInstance()));
        return getEquipoUseCase.execute(equipoId);
    }

    private Arbitro findArbitro(String arbitroId){
        GetArbitroUseCase getArbitroUseCase = new GetArbitroUseCase(new ArbitroDataRepository(ArbitroFileLocalDataSource.getInstance()));
        return getArbitroUseCase.execute(arbitroId);
    }

    private void savePartido(Partido partido){
        AddPartidoUseCase addPartidoUseCase = new AddPartidoUseCase((new PartidoDataRepository(PartidoFileLocalDataSource.getInstance())));
        addPartidoUseCase.execute(partido);
    }

    public void buildNewPartido(){
        Partido partido = new Partido();
        partido.setId("1");
        partido.seteLocal(findEquipo("1"));
        partido.seteVisitante(findEquipo("2"));
        partido.setArbitro(findArbitro("1"));

        savePartido(partido);
    }
}

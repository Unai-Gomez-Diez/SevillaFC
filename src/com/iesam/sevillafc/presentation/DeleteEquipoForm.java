package com.iesam.sevillafc.presentation;

import com.iesam.sevillafc.data.ArbitroDataRepository;
import com.iesam.sevillafc.data.EquipoDataRepository;
import com.iesam.sevillafc.data.local.ArbitroFileLocalDataSource;
import com.iesam.sevillafc.data.local.EquipoFileLocalDataSource;
import com.iesam.sevillafc.domain.EquipoRepository;
import com.iesam.sevillafc.domain.models.Equipo;
import com.iesam.sevillafc.domain.usecase.DeleteArbitroUseCase;
import com.iesam.sevillafc.domain.usecase.DeleteEquipoUseCase;

public class DeleteEquipoForm {
    public void deleteEquipo(String equipoId){
        DeleteEquipoUseCase deleteEquipoUseCase = new DeleteEquipoUseCase(new EquipoDataRepository(EquipoFileLocalDataSource.getInstance().getInstance()));
        deleteEquipoUseCase.execute(equipoId);
    }
}

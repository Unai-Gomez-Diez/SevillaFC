package com.iesam.sevillafc.presentation;

import com.iesam.sevillafc.data.EquipoDataRepository;
import com.iesam.sevillafc.data.local.EquipoFileLocalDataSource;
import com.iesam.sevillafc.domain.models.Equipo;
import com.iesam.sevillafc.domain.usecase.AddArbitroUseCase;
import com.iesam.sevillafc.domain.usecase.AddEquipoUseCase;

public class NewEquipoForm {
    private Equipo buildNewEquipo(){
        Equipo equipo = new Equipo();
        equipo.setId("1");
        equipo.setNombre("Porcinos");
        equipo.setCategoria("Infantil");
        equipo.setJugadores(18);

        return equipo;
    }

    private void saveNewEquipo(Equipo equipo){
        AddEquipoUseCase addEquipoUseCase = new AddEquipoUseCase(new EquipoDataRepository(EquipoFileLocalDataSource.getInstance()));
        addEquipoUseCase.execute(equipo);
    }

    public void createNewEquipo(){
        Equipo equipo = buildNewEquipo();
        saveNewEquipo(equipo);
    }

}

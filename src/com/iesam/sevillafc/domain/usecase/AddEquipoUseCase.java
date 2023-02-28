package com.iesam.sevillafc.domain.usecase;

import com.iesam.sevillafc.domain.EquipoRepository;
import com.iesam.sevillafc.domain.models.Equipo;

public class AddEquipoUseCase {

    private EquipoRepository equipoRepository;

    public void AddEquipoUseCase(EquipoRepository equipoRepository){
        this.equipoRepository=equipoRepository;
    }

    public void execute(Equipo equipo){
        equipoRepository.save(equipo);
    }

}

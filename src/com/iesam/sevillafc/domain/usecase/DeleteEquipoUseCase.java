package com.iesam.sevillafc.domain.usecase;

import com.iesam.sevillafc.domain.EquipoRepository;

public class DeleteEquipoUseCase {

    private EquipoRepository equipoRepository;

    public DeleteEquipoUseCase(EquipoRepository equipoRepository){
        this.equipoRepository=equipoRepository;
    }

    public void execute(String equipoId){
        equipoRepository.delete(equipoId);
    }
}

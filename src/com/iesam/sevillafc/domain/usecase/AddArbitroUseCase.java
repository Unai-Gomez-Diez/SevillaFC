package com.iesam.sevillafc.domain.usecase;

import com.iesam.sevillafc.domain.ArbitroRepository;
import com.iesam.sevillafc.domain.models.Arbitro;

public class AddArbitroUseCase {
    private ArbitroRepository arbitroRepository;

    public void AddArbitroUseCase(ArbitroRepository arbitroRepository){
        this.arbitroRepository=arbitroRepository;
    }

    public void execute(Arbitro arbitro){
        this.arbitroRepository.save(arbitro);
    }
}

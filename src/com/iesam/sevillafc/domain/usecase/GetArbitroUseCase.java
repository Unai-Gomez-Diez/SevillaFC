package com.iesam.sevillafc.domain.usecase;

import com.iesam.sevillafc.domain.ArbitroRepository;
import com.iesam.sevillafc.domain.models.Arbitro;

public class GetArbitroUseCase {
    private ArbitroRepository arbitroRepository;

    public void GetArbitroUseCase(ArbitroRepository arbitroRepository){
        this.arbitroRepository=arbitroRepository;
    }

    public Arbitro execute(String arbitroId){
        return this.arbitroRepository.findById(arbitroId);
    }
}

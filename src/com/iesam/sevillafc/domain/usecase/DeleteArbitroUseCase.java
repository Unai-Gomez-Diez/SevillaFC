package com.iesam.sevillafc.domain.usecase;

import com.iesam.sevillafc.data.ArbitroDataRepository;
import com.iesam.sevillafc.domain.ArbitroRepository;
import com.iesam.sevillafc.domain.models.Arbitro;

public class DeleteArbitroUseCase {

    private ArbitroRepository arbitroRepository;


    public DeleteArbitroUseCase(ArbitroRepository arbitroRepository){
        this.arbitroRepository=arbitroRepository;
    }

    public void execute(String arbitroId){
        this.arbitroRepository.delete(arbitroId);

    }
}

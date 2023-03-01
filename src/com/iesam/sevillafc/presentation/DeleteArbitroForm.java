package com.iesam.sevillafc.presentation;

import com.iesam.sevillafc.data.ArbitroDataRepository;
import com.iesam.sevillafc.data.local.ArbitroFileLocalDataSource;
import com.iesam.sevillafc.domain.usecase.DeleteArbitroUseCase;

public class DeleteArbitroForm {
    public void deleteArbitro(String arbitroId){
        DeleteArbitroUseCase deleteArbitroUseCase = new DeleteArbitroUseCase(new ArbitroDataRepository(ArbitroFileLocalDataSource.getInstance()));
        deleteArbitroUseCase.execute(arbitroId);
    }
}

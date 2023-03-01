package com.iesam.sevillafc.presentation;

import com.iesam.sevillafc.data.ArbitroDataRepository;
import com.iesam.sevillafc.data.local.ArbitroFileLocalDataSource;
import com.iesam.sevillafc.domain.models.Arbitro;
import com.iesam.sevillafc.domain.usecase.AddArbitroUseCase;

public class NewArbitroForm {
    private Arbitro buildArbitro(){
        Arbitro arbitro = new Arbitro();
        arbitro.setId("1");
        arbitro.setNombre("Pepe");
        arbitro.setApellidos("Nose");
        arbitro.setCategoria("Primera");
        arbitro.setFechaNacimiento("07/06/08");

        return arbitro;
    }

    private void saveArbitro(Arbitro arbitro){
        AddArbitroUseCase addArbitroUseCase = new AddArbitroUseCase(new ArbitroDataRepository(ArbitroFileLocalDataSource.getInstance()));
        addArbitroUseCase.execute(arbitro);

    }

    public void createNewArbitro(){
        Arbitro arbitro = buildArbitro();
        saveArbitro(arbitro);
    }
}

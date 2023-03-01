package com.iesam.sevillafc.presentation;

import com.iesam.sevillafc.domain.usecase.DeleteArbitroUseCase;

public class MenuView {


    public void init(){
        createNewArbitro();
        createNewEquipo();
        createNewPartido();
        showPartido();

    }

    private void createNewArbitro(){
        NewArbitroForm newArbitroForm = new NewArbitroForm();
        newArbitroForm.createNewArbitro();
    }
    private void deleteArbitro(){
        DeleteArbitroForm deleteArbitroForm = new DeleteArbitroForm();
        deleteArbitroForm.deleteArbitro("1");

    }
    private void createNewEquipo(){
        NewEquipoForm newEquipoForm = new NewEquipoForm();
        newEquipoForm.createNewEquipo();
    }
    private void createNewPartido(){
        NewPartidoForm newPartidoForm = new NewPartidoForm();
        newPartidoForm.buildNewPartido();
    }
    private void showPartido(){
        PrintPartidoView printPartidoView = new PrintPartidoView();
        printPartidoView.print();
    }

}

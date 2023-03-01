package com.iesam.sevillafc.data;

import com.iesam.sevillafc.data.local.EquipoFileLocalDataSource;
import com.iesam.sevillafc.domain.EquipoRepository;
import com.iesam.sevillafc.domain.models.Equipo;

import java.util.List;

public class EquipoDataRepository implements EquipoRepository {

    private EquipoFileLocalDataSource localDataSource = EquipoFileLocalDataSource.getInstance();

    public EquipoDataRepository(EquipoFileLocalDataSource localDataSource){
        this.localDataSource=localDataSource;
    }

    @Override
    public void save(Equipo equipo) {
        this.localDataSource.save(equipo);
    }

    @Override
    public Equipo findById(String equipoId) {
        return this.localDataSource.findById(equipoId);
    }

    @Override
    public void delete(String equipoId) {
        this.localDataSource.delete(equipoId);
    }


}

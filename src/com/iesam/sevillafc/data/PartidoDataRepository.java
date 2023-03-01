package com.iesam.sevillafc.data;

import com.iesam.sevillafc.data.local.PartidoFileLocalDataSource;
import com.iesam.sevillafc.domain.PartidoRepository;
import com.iesam.sevillafc.domain.models.Partido;

import java.util.List;

public class PartidoDataRepository implements PartidoRepository {

    private PartidoFileLocalDataSource localDataSource= PartidoFileLocalDataSource.getInstance();

    public PartidoDataRepository(PartidoFileLocalDataSource localDataSource){
        this.localDataSource=localDataSource;
    }

    @Override
    public void save(Partido partido) {
        this.localDataSource.save(partido);
    }

    @Override
    public Partido findById(String partidoId) {
        return this.localDataSource.findById(partidoId);
    }

    @Override
    public void delete(String partidoId) {
    this.localDataSource.delete(partidoId);
    }

    @Override
    public List<Partido> getAll() {
        return this.localDataSource.findAll();
    }


}

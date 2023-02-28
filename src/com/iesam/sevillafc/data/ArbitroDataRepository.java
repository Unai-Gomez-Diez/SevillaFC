package com.iesam.sevillafc.data;

import com.iesam.sevillafc.data.local.ArbitroFileLocalDataSource;
import com.iesam.sevillafc.domain.ArbitroRepository;
import com.iesam.sevillafc.domain.models.Arbitro;

import java.util.List;

public class ArbitroDataRepository implements ArbitroRepository {

    private ArbitroFileLocalDataSource localDataSource = ArbitroFileLocalDataSource.getInstance();

    public ArbitroDataRepository(ArbitroFileLocalDataSource localDataSource){
        this.localDataSource=localDataSource;
    }

    @Override
    public void save(Arbitro arbitro) {
        this.localDataSource.save(arbitro);
    }

    @Override
    public Arbitro findById(String arbitroId) {
        return this.localDataSource.findById(arbitroId);
    }

    @Override
    public List<Arbitro> getAll() {
        return this.localDataSource.findAll();
    }
}

package com.iesam.sevillafc.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.sevillafc.domain.models.Arbitro;
import com.iesam.sevillafc.domain.models.Equipo;
import com.iesam.sevillafc.domain.models.Partido;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PartidoFileLocalDataSource {
    private static PartidoFileLocalDataSource instance = null;

    private String nameFile = "partido.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Partido>>() {
    }.getType();

    private PartidoFileLocalDataSource() {
    }

    public void save(Partido model) {
        List<Partido> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Partido> models) {
        saveToFile(models);
    }

    private void saveToFile(List<Partido> models) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(models));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }


    public Partido findById(String id) {
        List<Partido> models = findAll();
        for (Partido model : models) {
            if (Objects.equals(model.getId(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<Partido> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }

    public void delete(String partidoId) {
        List<Partido> newPartidosList = new ArrayList<>();
        List<Partido> partidos = findAll();
        for (Partido partido : partidos) {
            if (partido.getId() != partidoId) {
                newPartidosList.add(partido);
            }
        }
        saveList(newPartidosList);
    }

    public static PartidoFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new PartidoFileLocalDataSource();
        }
        return instance;
    }
}

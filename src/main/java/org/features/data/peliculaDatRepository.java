package org.features.data;

import org.features.domain.pelicula;
import org.features.domain.peliculaRepository;

import java.util.ArrayList;

public class peliculaDatRepository implements peliculaRepository {

    peliculaMemLocalDataSource peliculaMemLocalDataSource;

    @Override
    public ArrayList<pelicula> verListado() {
        return peliculaMemLocalDataSource.findAll();
    }

    @Override
    public void añadir(pelicula pelicula) {

    }

    @Override
    public void borrar() {

    }


}

package org.features.data;

import org.features.domain.Pelicula;
import org.features.domain.peliculaRepository;

import java.util.ArrayList;

public class PeliculaDatRepository implements peliculaRepository {

    PeliculaMemLocalDataSource peliculaMemLocalDataSource;

    @Override
    public ArrayList<Pelicula> verListado() {
        return peliculaMemLocalDataSource.findAll();
    }
}

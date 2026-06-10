package org.features.data; //cambiar por la ruta correcta

import org.features.domain.pelicula;

import java.util.ArrayList;
import java.util.Objects;

public class peliculaMemLocalDataSource {

    private ArrayList<pelicula> storage = new ArrayList<>();

    public ArrayList<pelicula> findAll() {
        return storage;
    }

    public void save(pelicula pelicula) {
        storage.add(pelicula);
    }

    public void delete(String pelicula) {
        storage.removeIf(pelicula -> Objects.equals(pelicula.getId(), pelicula));
    }
}

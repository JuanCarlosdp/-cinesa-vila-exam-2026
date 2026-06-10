package org.features.data; //cambiar por la ruta correcta

import org.features.domain.Pelicula;

import java.util.ArrayList;
import java.util.Objects;

public class PeliculaMemLocalDataSource {

    private ArrayList<Pelicula> storage = new ArrayList<>();

    public ArrayList<Pelicula> findAll() {
        return storage;
    }

    public void save(Pelicula pelicula) {
        storage.add(pelicula);
    }

    public void delete(String pelicula) {
        storage.removeIf(pelicula -> Objects.equals(pelicula.getId(), pelicula));
    }
}

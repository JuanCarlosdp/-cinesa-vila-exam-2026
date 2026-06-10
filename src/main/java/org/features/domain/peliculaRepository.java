package org.features.domain;

import java.util.ArrayList;

public interface peliculaRepository {
    ArrayList<Pelicula> verListado();
    void add (Pelicula pelicula);
}

package org.features.domain;

import java.util.ArrayList;

public interface peliculaRepository {
    ArrayList<pelicula> verListado();
    void añadir(pelicula pelicula);
    void borrar ();
}

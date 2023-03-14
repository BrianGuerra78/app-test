package org.bguerra.appmockito.ejemplos.repositories;

import org.bguerra.appmockito.ejemplos.models.Examen;

import java.util.List;

public interface ExamenRepository {
    Examen guardar(Examen examen);

    List<Examen> findAll();
}

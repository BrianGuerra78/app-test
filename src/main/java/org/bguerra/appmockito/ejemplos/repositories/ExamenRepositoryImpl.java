package org.bguerra.appmockito.ejemplos.repositories;

import org.bguerra.appmockito.ejemplos.models.Examen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExamenRepositoryImpl implements ExamenRepository {
    @Override
    public Examen guardar(Examen examen) {
        return null;
    }

    @Override
    public List<Examen> findAll() {
      /*  return Arrays.asList(new Examen(5L, "Matematicas"),new Examen(6L,"Lenguaje"),
                new Examen(7L,"Historia"));*/
        return Collections.emptyList();

    }
}

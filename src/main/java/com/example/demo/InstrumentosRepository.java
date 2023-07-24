package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "instrumentos", path = "instrumentos")
public interface InstrumentosRepository extends PagingAndSortingRepository<Instrumentos, Integer>,CrudRepository<Instrumentos, Integer> {
    
   List<Instrumentos> findByNombre(@Param("nombre") String nombre);

}

// InstrumentosRepository extends PagingAndSortingRepository<Curso, Integer>,
//  List<Curso> findByNombre(@Param("nombre") String nombre);
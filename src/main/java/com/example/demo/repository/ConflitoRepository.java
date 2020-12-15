package com.example.demo.repository;


import com.example.demo.DTO.Conflito;
import com.example.demo.DTO.GruposArmadosTraficantesDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ConflitoRepository extends CrudRepository<Conflito, Long> {
    @Query(value = "SELECT * from conflito " +
            "order by NUM_FERIDOS desc " +
            "LIMIT 5;", nativeQuery = true)
    List<Conflito> findByGruposArmadosTraficantes();
}

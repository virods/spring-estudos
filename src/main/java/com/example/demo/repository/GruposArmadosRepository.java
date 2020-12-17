package com.example.demo.repository;

import com.example.demo.DTO.GruposArmados;
import com.example.demo.DTO.GruposArmadosTraficantesDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface GruposArmadosRepository extends CrudRepository<GruposArmados, Long> {
    @Override
    <S extends GruposArmados> S save(S s);
}

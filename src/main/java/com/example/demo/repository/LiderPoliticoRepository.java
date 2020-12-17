package com.example.demo.repository;

import com.example.demo.DTO.GruposArmados;
import com.example.demo.DTO.LiderPolitico;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LiderPoliticoRepository extends CrudRepository<LiderPolitico, Long> {
    <S extends LiderPolitico> S save(S s);
    List<LiderPolitico> findAll();
}

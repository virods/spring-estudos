package com.example.demo.repository;

import com.example.demo.DTO.Traficante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TraficanteRepository extends CrudRepository<Traficante, Long> {
    List<Traficante> findAll();
    List<Traficante> findByNome(String nome);
    @Transactional
    void deleteByNome(String nome);

    @Query("SELECT e FROM Traficante e WHERE e.cap_destrutiva >= :cap_destrutiva")
    public List<Traficante> listItemsWithPriceOver(@Param("cap_destrutiva") float cap_destrutiva);
}

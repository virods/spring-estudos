package com.example.demo.repository;


import com.example.demo.DTO.GruposArmados;
import com.example.demo.DTO.GruposArmadosTraficantesDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface GrupoArmadoRepository  extends CrudRepository<GruposArmadosTraficantesDTO, Long> {

    @Query(value = "SELECT T.NOME, G.COD_GRUPO_ARM, T.NOME_ARMA " +
            "FROM grupos_armados G " +
            "INNER JOIN traficante T " +
            "INNER JOIN fornece F " +
            "ON T.NOME= F.fk_Traficante_NOME and F.fk_Grupos_Armados_COD_GRUPO_ARM = G.COD_GRUPO_ARM " +
            "WHERE T.NOME_ARMA LIKE :nome_arma", nativeQuery = true)
    List<GruposArmadosTraficantesDTO> findByGruposArmadosTraficantes(@Param(value="nome_arma") String nome_arma);
}

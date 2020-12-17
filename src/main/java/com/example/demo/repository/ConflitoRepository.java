package com.example.demo.repository;


import com.example.demo.DTO.ConflitoOrdem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ConflitoRepository extends CrudRepository<ConflitoOrdem, Long> {
    @Query(value = "SELECT c.NOME as Nome_Conflito, sum(g.NUM_BAIXAS) as Mortes, c.Conflito_TIPO as conflito_TIPO\n" +
            "FROM innodb.participam_grupos_armados_conflito_organizacoes_mediadoras a\n" +
            "join conflito c\n" +
            "join grupos_armados g\n" +
            "on a.fk_Conflito_COD_NUM = c.COD_NUM and a.fk_Grupos_Armados_COD_GRUPO_ARM = g.COD_GRUPO_ARM\n" +
            "group by c.nome\n" +
            "order by Mortes desc limit 5;"
            , nativeQuery = true)
    List<ConflitoOrdem> findByGruposArmadosTraficantes();
}

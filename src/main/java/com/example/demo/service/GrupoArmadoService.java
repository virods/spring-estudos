package com.example.demo.service;

import com.example.demo.DTO.GruposArmados;
import com.example.demo.DTO.LiderPolitico;
import com.example.demo.repository.GruposArmadosRepository;
import com.example.demo.repository.LiderPoliticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrupoArmadoService {

    GruposArmadosRepository gruposArmadosRepository;
    LiderPoliticoRepository liderPoliticoRepository;
    int cod_lider;

    @Autowired
    private GrupoArmadoService(GruposArmadosRepository gruposArmadosRepository, LiderPoliticoRepository liderPoliticoRepository) {
        this.gruposArmadosRepository = gruposArmadosRepository;
        this.liderPoliticoRepository = liderPoliticoRepository;
    }

    public void adicionaGrupoArmado(String dat_incorp,
                                    String dat_saida,
                                    String nom_grupo_arm,
                                    Integer num_divisao,
                                    Integer num_baixas,
                                    String nome_lider){

        this.cod_lider = liderPoliticoRepository.findAll().size() + 1;
        String descricao_textual = "Apoiado por " + nom_grupo_arm;
        liderPoliticoRepository.save(new LiderPolitico(descricao_textual, cod_lider,nome_lider, cod_lider));
        gruposArmadosRepository.save(new GruposArmados(dat_incorp, dat_saida,cod_lider, nom_grupo_arm, num_divisao, this.cod_lider,num_baixas, nome_lider));

    }


}

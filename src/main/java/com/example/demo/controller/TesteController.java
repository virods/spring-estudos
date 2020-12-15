package com.example.demo.controller;

import com.example.demo.DTO.Conflito;
import com.example.demo.DTO.GruposArmadosTraficantesDTO;
import com.example.demo.repository.ConflitoRepository;
import com.example.demo.repository.GrupoArmadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TesteController {
    @Autowired
    private GrupoArmadoRepository grupoArmadoRepository;
    @Autowired
    private ConflitoRepository conflitoRepository;


    @RequestMapping(value = "/grupos_armados", method = RequestMethod.GET)
    public List<GruposArmadosTraficantesDTO> retornaGruposArmados(
            @RequestParam String nome_arma) throws Exception {
        System.out.println("LOG                                                   Procurando grupos armados");
        return grupoArmadoRepository.findByGruposArmadosTraficantes(nome_arma);
    }

    @RequestMapping(value = "/conflitos", method = RequestMethod.GET)
    public List<Conflito> retornaTop5Conflitos() throws Exception {
        System.out.println("LOG                                                   Procurando grupos armados");
        return conflitoRepository.findByGruposArmadosTraficantes();
    }
}

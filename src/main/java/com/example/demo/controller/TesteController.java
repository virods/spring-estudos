package com.example.demo.controller;

import com.example.demo.DTO.ConflitoOrdem;
import com.example.demo.DTO.GruposArmados;
import com.example.demo.DTO.GruposArmadosTraficantesDTO;
import com.example.demo.repository.ConflitoRepository;
import com.example.demo.repository.GrupoArmadoRepository;

import com.example.demo.repository.GruposArmadosRepository;
import com.example.demo.service.GrupoArmadoService;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;
@RestController
public class TesteController {
    @Autowired
    private GrupoArmadoRepository grupoArmadoRepository;
    @Autowired
    private ConflitoRepository conflitoRepository;
    @Autowired
    private GruposArmadosRepository gruposArmadosRepository;
    @Autowired
    private GrupoArmadoService grupoArmadoService;

    // API enunciado 1
    @RequestMapping(value = "/grupos_armados", method = RequestMethod.GET)
    public List<GruposArmadosTraficantesDTO> retornaGruposArmados(
            @RequestParam String nome_arma) throws Exception {
        System.out.println("LOG                                                   Procurando grupos armados");
        return grupoArmadoRepository.findByGruposArmadosTraficantes(nome_arma);
    }
    // API enunciado 2
    @RequestMapping(value = "/conflitos", method = RequestMethod.GET)
    public List<ConflitoOrdem> retornaTop5Conflitos() throws Exception {
        System.out.println("LOG                                                   Procurando grupos armados");
        return conflitoRepository.findByGruposArmadosTraficantes();
    }

    @RequestMapping(value = "/salvar/grupos", method = RequestMethod.POST)
    public HttpStatus salvarGrupoArmado(
            @RequestParam
            String dat_incorp,
            @RequestParam
            String dat_saida,
            @RequestParam
            String nom_grupo_arm,
            @RequestParam
            Integer num_divisao,
            @RequestParam
            Integer num_baixas,
            @RequestParam
            String nome_lider
    ) throws Exception {
        System.out.println("LOG                                                   Procurando grupos armados");
        grupoArmadoService.adicionaGrupoArmado(dat_incorp, dat_saida,
                 nom_grupo_arm, num_divisao, num_baixas, nome_lider);
        return HttpStatus.CREATED;
    }
}

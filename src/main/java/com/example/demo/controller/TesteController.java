package com.example.demo.controller;

import com.example.demo.DTO.Traficante;
import com.example.demo.repository.TraficanteRepository;
import com.example.demo.service.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TesteController {
    @Autowired
    private TesteService testeService;
    @Autowired
    private TraficanteRepository traficanteRepository;

    @RequestMapping(value = "/traficantes", method = RequestMethod.GET)
   public List<Traficante> retornaTraficantes(
           @RequestParam(value = "nome", defaultValue = "") String nome) throws Exception
    {
        return traficanteRepository.findByNome(nome);
   }
    @RequestMapping(value = "/todos_traficantes", method = RequestMethod.GET)
    public List<Traficante> retornaTodosTraficantes() throws Exception
    {
        return traficanteRepository.findAll();
    }

    @RequestMapping(value = "/traficantes", method = RequestMethod.DELETE)
    public void deletaTraficantes(
            @RequestParam(value = "nome", defaultValue = "") String nome) throws Exception
    {
        traficanteRepository.deleteByNome(nome);
    }
}

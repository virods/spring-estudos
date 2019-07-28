package com.example.demo.controller;

import com.example.demo.service.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TesteController {
    @Autowired
    private TesteService testeService;

    @RequestMapping(value = "/dobra", method = RequestMethod.GET)
   public ResponseEntity<String> retornaNumeroDobrado(
           @RequestParam(value = "numero a ser dobrado", defaultValue = "0") Integer numero) throws Exception
    {
       return ResponseEntity.status(HttpStatus.OK)
                .body("O resultado é " + numero * 2);
   }
}

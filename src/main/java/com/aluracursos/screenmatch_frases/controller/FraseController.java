package com.aluracursos.screenmatch_frases.controller;

import com.aluracursos.screenmatch_frases.dto.FrasesDTO;
import com.aluracursos.screenmatch_frases.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    FrasesService servicio;
    @GetMapping("/series/frases")
    public FrasesDTO obtenerFrasesAleatoria(){
            return servicio.obtenerFrasesAleatoria();

    }
}

package com.aluracursos.screenmatch_frases.service;

import com.aluracursos.screenmatch_frases.dto.FrasesDTO;
import com.aluracursos.screenmatch_frases.model.Frase;
import com.aluracursos.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrasesService {

    @Autowired
    private FraseRepository repository;

    public FrasesDTO obtenerFrasesAleatoria(){
       Frase frase = repository.obtenerFrasesAleatoria();
       return new FrasesDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());

    }

}

package org.apiuniara.controllers;


import org.apiuniara.models.Aluno;
import org.apiuniara.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlunoController {

    private final static String ENDPOINT = "apiuniara/api/aluno";
    @Autowired
    private AlunoService alunoService;

    @PostMapping(ENDPOINT)
    public Aluno add(@RequestBody Aluno aluno){
        return alunoService.add(aluno);
    }

    @GetMapping(ENDPOINT)
    public List<Aluno> findAll(){
        return  alunoService.findAll();
    }
}

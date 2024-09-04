package org.apiuniara.services;

import org.apiuniara.models.Aluno;
import org.apiuniara.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;
    public Aluno add(Aluno aluno){
        return alunoRepository.add(aluno);
    }
    public List<Aluno> findAll(){
        return alunoRepository.findAll();
    }
}

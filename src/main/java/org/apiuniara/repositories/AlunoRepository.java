package org.apiuniara.repositories;

import org.apiuniara.models.Aluno;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlunoRepository {
    private static List<Aluno> alunos = new ArrayList<Aluno>();
    public Aluno add(Aluno aluno){
        alunos.add(aluno);
        return aluno;
    }
    public List<Aluno> findAll(){
        return alunos;
    }
}

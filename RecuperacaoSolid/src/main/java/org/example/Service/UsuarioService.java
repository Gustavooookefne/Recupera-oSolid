package org.example.Service;

import org.example.Model.Aluno;
import org.example.Model.Professor;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Professor> professores = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();

    public void cadastrarProfessor(Professor prof) {
        professores.add(prof);
    }

    public void cadastrarAluno(Aluno alu) {
        alunos.add(alu);
    }

    public Professor buscarProfessor(int id) {
        return professores.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public Aluno buscarAluno(int id) {
        return alunos.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }
}

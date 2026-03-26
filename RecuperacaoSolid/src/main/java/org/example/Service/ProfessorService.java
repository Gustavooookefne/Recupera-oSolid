package org.example.Service;

import org.example.Model.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorService {
    private List<Professor> professores = new ArrayList<>();

    public void cadastrar(Professor professor) {
        if (professor.getNome() == null || professor.getNome().isEmpty()) {
            throw new RuntimeException("Nome do professor é obrigatório.");
        }
        professores.add(professor);
    }

    public List<Professor> listarTodos() {
        return professores;
    }

    public Professor buscarPorId(int id) {
        for (Professor p : professores) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean eProfessorValido(int id) {
        return buscarPorId(id) != null;
    }
}

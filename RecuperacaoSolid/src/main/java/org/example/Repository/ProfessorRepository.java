package org.example.Repository;

import org.example.Model.Professor;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProfessorRepository {
    private final List<Professor> professores = new ArrayList<>();

    public void salvar(Professor professor) {
        professores.add(professor);
    }

    public List<Professor> buscarTodos() {
        return new ArrayList<>(professores);
    }

    public Optional<Professor> buscarPorId(int id) {
        return professores.stream().filter(p -> p.getId() == id).findFirst();
    }
}

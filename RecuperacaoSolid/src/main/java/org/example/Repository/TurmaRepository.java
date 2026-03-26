package org.example.Repository;

import org.example.Model.Turma;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TurmaRepository {
    private final List<Turma> turmas = new ArrayList<>();

    public void salvar(Turma turma) {
        turmas.add(turma);
    }

    public List<Turma> buscarTodas() {
        return new ArrayList<>(turmas);
    }

    public Optional<Turma> buscarPorId(int id) {
        return turmas.stream()
                .filter(t -> t.getId() == id)
                .findFirst();
    }

    public Optional<Turma> buscarPorNome(String nome) {
        return turmas.stream()
                .filter(t -> t.getNome().equalsIgnoreCase(nome))
                .findFirst();
    }
}

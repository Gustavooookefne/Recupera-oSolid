package org.example.Service;

import org.example.Model.Aluno;
import org.example.Model.Turma;

import java.util.ArrayList;
import java.util.List;

public class TurmaService {
    private List<Turma> turmas = new ArrayList<>();

    public void criarTurma(Turma turma) {
        turmas.add(turma);
    }

    public void adicionarAlunoNaTurma(int turmaId, Aluno aluno) {
        for (Turma t : turmas) {
            if (t.getId() == turmaId) {
                t.getAlunos().add(aluno);
                break;
            }
        }
    }
    public List<Turma> listarTodas() {
        return turmas;
    }
}

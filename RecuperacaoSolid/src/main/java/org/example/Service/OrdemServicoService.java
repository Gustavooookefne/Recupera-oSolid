package org.example.Service;

import org.example.Model.OrdemServico;

import java.util.ArrayList;
import java.util.List;

public class OrdemServicoService {
    private List<OrdemServico> ordens = new ArrayList<>();

    public void abrirOS(OrdemServico os) {
        if (os.getProfessorResponsavel() != null) {
            ordens.add(os);
            System.out.println("OS " + os.getId() + " aberta com sucesso.");
        } else {
            throw new RuntimeException("Erro: Professor responsável é obrigatório.");
        }
    }

    public boolean finalizarOS(int idOS, int idProfessor) {
        for (OrdemServico os : ordens) {
            if (os.getId() == idOS) {
                if (os.getProfessorResponsavel().getId() == idProfessor) {
                    os.setStatus("CONCLUIDA");
                    return true;
                }
            }
        }
        return false;
    }
    public List<OrdemServico> listarOrdens() {
        return ordens;

    }
        public OrdemServico buscarPorId(int id) {
        return ordens.stream().filter(o -> o.getId() == id).findFirst().orElse(null);
    }
}

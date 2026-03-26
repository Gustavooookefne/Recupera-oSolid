package org.example.Repository;

import org.example.Model.OrdemServico;
import java.util.ArrayList;
import java.util.List;

public class OrdemServicoRepository {
    private final List<OrdemServico> ordens = new ArrayList<>();

    public void salvar(OrdemServico os) {
        ordens.add(os);
    }

    public List<OrdemServico> buscarTodas() {
        return new ArrayList<>(ordens);
    }

    public OrdemServico buscarPorId(int id) {
        return ordens.stream()
                .filter(os -> os.getId() == id)
                .findFirst()
                .orElse(null);
    }
}

package org.example.Controller;

import org.example.Dto.OrdemServicoDto.OrdemServicoRequestDto;
import org.example.Dto.OrdemServicoDto.OrdemServicoResponseDto;
import org.example.Service.OrdemServicoService;
import org.example.mapper.OrdemServicoMapper;

public class OrdemServicoController {
    private final OrdemServicoService osService;
    private final OrdemServicoMapper osMapper;

    public OrdemServicoController(OrdemServicoService service) {
        this.osService = service;
        this.osMapper = new OrdemServicoMapper();
    }

    public String abrirOrdem(OrdemServicoRequestDto request) {
        try {
            osService.abrirOS(osMapper.toEntity(request, null));
            return "Sucesso: Ordem de Serviço registrada!";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }

    public String encerrarOrdem(int idOS, int idProfessor) {
        boolean sucesso = osService.finalizarOS(idOS, idProfessor);
        return sucesso ? "OS encerrada com sucesso!" : "Falha: Verifique o ID do professor ou status da OS.";
    }
}

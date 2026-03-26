package org.example.Controller;

import org.example.Dto.TurmaDto.TurmaRequestDto;
import org.example.Dto.TurmaDto.TurmaResponseDto;
import org.example.Service.TurmaService;
import org.example.mapper.TurmaMapper;
import java.util.List;
import java.util.stream.Collectors;

public class TurmaController {
    private final TurmaService turmaService;
    private final TurmaMapper turmaMapper;

    public TurmaController(TurmaService service) {
        this.turmaService = service;
        this.turmaMapper = new TurmaMapper();
    }

    public void criarTurma(TurmaRequestDto request) {
        turmaService.criarTurma(turmaMapper.toEntity(request));
    }

    public List<TurmaResponseDto> listarTodas() {
        return turmaService.listarTodas().stream()
                .map(turmaMapper::toResponseDto)
                .collect(Collectors.toList());
    }
}

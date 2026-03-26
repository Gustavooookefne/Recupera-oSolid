package org.example.Controller;

import org.example.Dto.AlunoDto.AlunoRequestDto;
import org.example.Dto.AlunoDto.AlunoResponseDto;
import org.example.Service.AlunoService;
import org.example.mapper.AlunoMapper;
import java.util.List;
import java.util.stream.Collectors;

public class AlunoController {
    private final AlunoService alunoService;
    private final AlunoMapper alunoMapper;

    public AlunoController(AlunoService service) {
        this.alunoService = service;
        this.alunoMapper = new AlunoMapper();
    }

    public void cadastrar(AlunoRequestDto request) {
        alunoService.cadastrar(alunoMapper.toEntity(request));
    }

    public List<AlunoResponseDto> listarTodos() {
        return alunoService.listarTodos().stream()
                .map(alunoMapper::toResponseDto)
                .collect(Collectors.toList());
    }
}

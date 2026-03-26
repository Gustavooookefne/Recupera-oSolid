package org.example.Controller;

import org.example.Dto.ProfessorDto.ProfessorRequestDto;
import org.example.Dto.ProfessorDto.ProfessorResponseDto;
import org.example.Service.ProfessorService;
import org.example.mapper.ProfessorMapper;
import java.util.List;
import java.util.stream.Collectors;

public class ProfessorController {
    private final ProfessorService professorService;
    private final ProfessorMapper professorMapper;

    public ProfessorController(ProfessorService service) {
        this.professorService = service;
        this.professorMapper = new ProfessorMapper();
    }

    public void cadastrar(ProfessorRequestDto request) {
        professorService.cadastrar(professorMapper.toEntity(request));
    }

    public List<ProfessorResponseDto> listarTodos() {
        return professorService.listarTodos().stream()
                .map(professorMapper::toResponseDto)
                .collect(Collectors.toList());
    }
}

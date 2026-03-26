package org.example.mapper;

import org.example.Dto.ProfessorDto.ProfessorRequestDto;
import org.example.Dto.ProfessorDto.ProfessorResponseDto;
import org.example.Model.Professor;

public class ProfessorMapper {
    public Professor toEntity(ProfessorRequestDto dto) {
        return new Professor(
                dto.nome()
        );
    }

    public ProfessorResponseDto toResponseDto(Professor professor) {
        return new ProfessorResponseDto(
                professor.getId(),
                professor.getNome()
        );
    }
}


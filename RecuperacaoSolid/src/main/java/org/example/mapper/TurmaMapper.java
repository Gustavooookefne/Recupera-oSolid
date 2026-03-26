package org.example.mapper;

import org.example.Dto.TurmaDto.TurmaRequestDto;
import org.example.Dto.TurmaDto.TurmaResponseDto;
import org.example.Model.Turma;

import java.util.stream.Collectors;

public class TurmaMapper {

    private final AlunoMapper alunoMapper = new AlunoMapper();

    public Turma toEntity(TurmaRequestDto dto) {
        return new Turma(
                dto.id(),
                dto.nome()
        );
    }

    public TurmaResponseDto toResponseDto(Turma turma) {
        return new TurmaResponseDto(
                turma.getId(),
                turma.getNome(),
                turma.getAlunos().stream()
                        .map(alunoMapper::toResponseDto)
                        .collect(Collectors.toList()).reversed()
        );
    }
}

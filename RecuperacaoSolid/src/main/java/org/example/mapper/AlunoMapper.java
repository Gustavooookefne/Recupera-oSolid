package org.example.mapper;

import org.example.Dto.AlunoDto.AlunoRequestDto;
import org.example.Dto.AlunoDto.AlunoResponseDto;
import org.example.Model.Aluno;

public class AlunoMapper {

    public Aluno toEntity(AlunoRequestDto dto) {
        return new Aluno(
                dto.nome()
        );
    }


    public AlunoResponseDto toResponseDto(Aluno aluno) {
        return new AlunoResponseDto(
                aluno.getId(),
                aluno.getNome()
        );
    }
}

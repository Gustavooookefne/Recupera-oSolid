package org.example.Dto.TurmaDto;

import org.example.Dto.AlunoDto.AlunoRequestDto;

import java.util.List;

public record TurmaResponseDto (
         int id,
         String nomeTurma,
         List<AlunoRequestDto> listaAlunos
){
}

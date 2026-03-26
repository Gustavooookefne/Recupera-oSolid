package org.example.Dto.TurmaDto;

import java.util.List;

public record TurmaResponseDto (
        int id,
        String nomeTurma,
        List<org.example.Dto.AlunoDto.AlunoResponseDto> listaAlunos
){
}

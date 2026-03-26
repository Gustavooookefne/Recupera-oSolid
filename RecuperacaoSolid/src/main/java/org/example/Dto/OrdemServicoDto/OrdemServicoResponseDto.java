package org.example.Dto.OrdemServicoDto;

import java.util.List;

public record OrdemServicoResponseDto (
        int id,
        String equipamento,
        String defeitoRelatado,
        int professorId,
        List<Integer> alunosIds
){
}

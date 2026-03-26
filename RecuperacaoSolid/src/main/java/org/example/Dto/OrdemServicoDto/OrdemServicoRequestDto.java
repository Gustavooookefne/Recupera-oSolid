package org.example.Dto.OrdemServicoDto;

public record OrdemServicoRequestDto (
        String equipamento,
        String defeitoRelatado,
        int professorId
){

}

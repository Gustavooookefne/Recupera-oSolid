package org.example.mapper;

import org.example.Dto.OrdemServicoDto.OrdemServicoRequestDto;
import org.example.Dto.OrdemServicoDto.OrdemServicoResponseDto;
import org.example.Model.OrdemServico;
import org.example.Model.Professor;

public class OrdemServicoMapper {

    public OrdemServico OrdemServico (OrdemServicoRequestDto dto, Professor professor) {
        return new OrdemServico(
                dto.professorId(),
                dto.equipamento(),
                dto.defeitoRelatado()

        );
    }

    public OrdemServicoResponseDto OrdemServicoResponseDTO (OrdemServicoResponseDto responseDto) {
        return new OrdemServicoResponseDto(
                responseDto.id(),
                responseDto.equipamento(),
                responseDto.defeitoRelatado(),
                responseDto.professorId(),
                responseDto.alunosIds()
        );

    }
}

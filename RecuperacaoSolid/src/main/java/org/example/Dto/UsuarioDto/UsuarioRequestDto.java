package org.example.Dto.UsuarioDto;

import java.util.List;

public record UsuarioRequestDto (
        String equipamento,
        String defeitoRelatado,
        int professorId
){
}

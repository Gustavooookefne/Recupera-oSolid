package org.example.Dto.UsuarioDto;

import java.util.List;

public record UsuarioResponseDto (
         int id,
         String equipamento,
         String defeitoRelatado,
         int professorId,
         List<Integer> alunosIds
){
}

package org.example.mapper;

import org.example.Dto.UsuarioDto.UsuarioRequestDto;
import org.example.Dto.UsuarioDto.UsuarioResponseDto;
import org.example.Model.Usuario;

public class UsuarioMapper {

    public Usuario toEntity(UsuarioRequestDto dto) {
        return new Usuario(
                dto.id(),
                dto.nome()
        );
    }

    public UsuarioResponseDto toResponseDto(Usuario usuario) {
        return new UsuarioResponseDto(
                usuario.getId(),
                usuario.getNome()
        );
    }
}

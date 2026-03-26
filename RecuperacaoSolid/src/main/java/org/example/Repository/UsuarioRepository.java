package org.example.Repository;

import org.example.Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioRepository {
    // Lista que armazena qualquer tipo de usuário
    private final List<Usuario> usuarios = new ArrayList<>();

    public void salvar(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> buscarTodos() {
        return new ArrayList<>(usuarios);
    }

    public Optional<Usuario> buscarPorId(int id) {
        return usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst();
    }
}

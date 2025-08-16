package com.felipe.cadastro_usuario.business;

import com.felipe.cadastro_usuario.business.exceptions.UsuarioNaoEncontradoException;
import com.felipe.cadastro_usuario.infrastructure.entities.Usuario;
import com.felipe.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUsuario(Usuario usuario){
        repository.saveAndFlush(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email){

        return repository.findByEmail(email).orElseThrow(
                () -> new UsuarioNaoEncontradoException("Email não encontrado: " + email)
        );
    }

    public void deletarUsuarioPorEmail(String email){
        repository.deleteByEmail(email);
    }
}

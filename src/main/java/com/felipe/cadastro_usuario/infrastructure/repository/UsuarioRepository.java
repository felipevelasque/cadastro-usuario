package com.felipe.cadastro_usuario.infrastructure.repository;

import com.felipe.cadastro_usuario.infrastructure.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);

}

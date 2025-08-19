package com.felipe.cadastro_usuario.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UsuarioRequestDTO(@NotBlank @Email String email,
                                @NotBlank @Size(min = 2, max = 80) String nome) {
}

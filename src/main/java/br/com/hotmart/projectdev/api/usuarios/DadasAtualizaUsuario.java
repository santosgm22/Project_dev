package br.com.hotmart.projectdev.api.usuarios;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadasAtualizaUsuario(

        @NotNull
        Long id,
        String nome,
        String cpf) {
}

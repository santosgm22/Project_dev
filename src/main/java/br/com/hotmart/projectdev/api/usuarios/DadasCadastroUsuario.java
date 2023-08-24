package br.com.hotmart.projectdev.api.usuarios;

import br.com.hotmart.projectdev.api.endereco.DadosEndereco;
import br.com.hotmart.projectdev.api.formacao.DadosFormacao;
import jakarta.validation.constraints.NotBlank;

public record DadasCadastroUsuario(

        long id,
        @NotBlank
        String nome,
        @NotBlank
        String cpf) {
}

package br.com.hotmart.projectdev.api.usuarios;

public record DadosListagemUsuario( Long id, String nome, String cpf) {

    public DadosListagemUsuario(Usuario usuario){
        this(usuario.getId(),usuario.getNome(), usuario.getCpf());

    }
}

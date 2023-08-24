package br.com.hotmart.projectdev.api.controller;


import br.com.hotmart.projectdev.api.usuarios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("users")
public class UserController {

    @Autowired
    private UsuarioRepository repository;

    @Transactional
    @PostMapping
    public void cadastrar  (@RequestBody DadasCadastroUsuario dados){

        repository.save(new Usuario(dados));

    }

    @GetMapping
    public Page<DadosListagemUsuario> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){

        return repository.findAll(paginacao).map(DadosListagemUsuario::new);
    }

    @PutMapping
    @Transactional
    public void atualizar (@RequestBody DadasAtualizaUsuario dados){

        var usuario = repository.getReferenceById(dados.id());
        usuario.atualizarInformacoes(dados);

    }

    @DeleteMapping("/{id}")
    @Transactional
    private void excluir (@PathVariable Long id){


    }


}

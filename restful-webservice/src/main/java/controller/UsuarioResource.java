package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import exception.UsuarioNaoEncontradoException;
import usuario.Usuario;
import usuario.UsuarioDaoService;

import java.net.URI;
import java.util.List;

@RestController
public class UsuarioResource {

    private UsuarioDaoService service;

    public UsuarioResource(UsuarioDaoService service) {
        this.service = service;
    }

    @GetMapping("/usuarios")
    public List<Usuario> retornarTodosUsuarios() {
        return service.buscarTodosUsuarios();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario retornarUsuario(@PathVariable int id) {
        Usuario usuario = service.buscarUsuario(id);

        if (usuario == null) {
            throw new UsuarioNaoEncontradoException("id: " + id);
        }
        return usuario;
    }

    @DeleteMapping("/usuarios/{id}")
    public Usuario deletarUsuario(@PathVariable int id) {
        Usuario usuario = service.buscarUsuario(id);

        if (usuario == null) {
            throw new UsuarioNaoEncontradoException("id: " + id);
        }
        return usuario;
    }

    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioSalvo = service.salvar(usuario);
        URI local = ServletUriComponentsBuilder
                .fromCurrentRequest().
                path("/{id}")
                .buildAndExpand(usuarioSalvo.getId())
                .toUri();
        return ResponseEntity.created(local).build();
    }
}
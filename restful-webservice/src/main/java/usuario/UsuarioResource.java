package usuario;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioResource {

    private UsuarioDaoService service;

    public UsuarioResource(UsuarioDaoService service) {
        this.service = service;
    }
}

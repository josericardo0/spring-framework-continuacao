package usuario;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UsuarioDaoService {

    private static List<Usuario> usuarios = new ArrayList<>();
    private static int usuariosContagem = 0;

    static {
        usuarios.add(new Usuario(++usuariosContagem, "Zezinho", LocalDate.now().minusYears(30)));
        usuarios.add(new Usuario(++usuariosContagem, "Alipio", LocalDate.now().minusYears(100)));
        usuarios.add(new Usuario(++usuariosContagem, "Ceceu", LocalDate.now().minusYears(50)));
    }

    public List<Usuario> buscarTodosUsuarios() {
        return usuarios;
    }

    public Usuario salvar(Usuario usuario) {
        usuario.setId(++usuariosContagem);
        usuarios.add(usuario);
        return usuario;
    }

    public Usuario buscarUsuario(int id) {
        Predicate<? super Usuario> predicate = usuario -> usuario.getId().equals(id);
        return usuarios.stream().filter(predicate).findFirst().get();
    }
}

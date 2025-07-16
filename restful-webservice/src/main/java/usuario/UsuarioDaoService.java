package usuario;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UsuarioDaoService {

    private static List<Usuario> usuarios = new ArrayList<>();

    static {
        usuarios.add(new Usuario(1, "Zezinho", LocalDate.now().minusYears(30)));
        usuarios.add(new Usuario(2, "Alipio", LocalDate.now().minusYears(100)));
        usuarios.add(new Usuario(3, "Ceceu", LocalDate.now().minusYears(50)));
    }

    public List<Usuario> buscarTodosUsuarios() {
        return usuarios;
    }

//    public List<Usuario> buscarUsuario(int id) {
//        Predicate<? super Usuario> predicate = usuario -> usuario.getId().equals(id);
////        return usuarios.stream().filter(predicate).findFirst().get();
//    }
}

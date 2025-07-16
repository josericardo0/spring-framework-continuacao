package controller;

import olamundo.OlaMundoBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {

    @GetMapping(path = "/ola-mundo")
    public String olaMundo() {
        return "Olá mundo";
    }

    @GetMapping(path = "/ola-mundo-bean")
    public OlaMundoBean olaMundoBean() {
        return new OlaMundoBean("Ola Mundo");
    }

    @GetMapping(path = "/ola-mundo/variavel/{nome}")
    public OlaMundoBean olaMundoVariavel(@PathVariable String nome) {
        return new OlaMundoBean(String.format("Olá mundo, %s", nome));
    }

}

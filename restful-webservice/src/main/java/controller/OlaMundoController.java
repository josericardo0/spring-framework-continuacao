package controller;

import olamundo.OlaMundoBean;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class OlaMundoController {

    private MessageSource messageSource;

    public OlaMundoController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

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

    @GetMapping(path = "/ola-mundo-internacional")
    public String olaMundoInternacional() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
    }

}

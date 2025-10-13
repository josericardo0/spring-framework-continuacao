package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import versionamento.Nome;
import versionamento.PessoaV1;
import versionamento.PessoaV2;

@RestController
public class VersionamentoPessoaController {

    @GetMapping("/v1/pessoa")
    public PessoaV1 obterPrimeiraVersaoDePessoa() {
        return new PessoaV1("Irineu");
    }

    @GetMapping("/v2/pessoa")
    public PessoaV2 obterSegundaVersaoDePessoa() {
       return new PessoaV2(new Nome("Serjão", "Berranteiro"));
    }
}

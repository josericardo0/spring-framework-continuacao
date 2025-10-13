package versionamento;

public class PessoaV2 {
    private Nome nome;

    public PessoaV2(Nome nome) {
        super();
        this.nome = nome;
    }

    public Nome getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "PessoaV2{" +
                "nome=" + nome +
                '}';
    }
}

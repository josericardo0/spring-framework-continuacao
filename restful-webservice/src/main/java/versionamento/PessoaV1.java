package versionamento;

public class PessoaV1 {
    private String nome;

    public PessoaV1(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "PessoaV1 [nome=" + nome + "]";
    }
}

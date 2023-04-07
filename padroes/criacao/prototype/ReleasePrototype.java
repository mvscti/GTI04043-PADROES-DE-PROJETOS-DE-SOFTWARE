package padroes.criacao.prototype;

class ReleasePrototype implements Prototype {
    private String nome = "ReleaseCandidate";
    @Override
    public Prototype clone() {
        return new ReleasePrototype();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void executa() {
        System.out.println(nome + ": realiza o trabalho real");
    }
}
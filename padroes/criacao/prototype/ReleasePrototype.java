package padroes.criacao.prototype;

class ReleasePrototype implements Prototype {
    private String name = "ReleaseCandidate";
    @Override
    public Prototype clone() {
        return new ReleasePrototype();
    }

    @Override
    public String getNome() {
        return name;
    }

    @Override
    public void executa() {
        System.out.println(name + ": realiza o trabalho real");
    }
}
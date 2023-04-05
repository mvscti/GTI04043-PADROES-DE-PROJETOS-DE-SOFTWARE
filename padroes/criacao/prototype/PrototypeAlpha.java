package padroes.criacao.prototype;

public class PrototypeAlpha implements Prototype{
    private String name = "AlphaVersion";

    @Override
    public Prototype clone() {
        return new PrototypeAlpha();
    }

    @Override
    public String getNome() {
        return name;
    }

    @Override
    public void executa() {
        System.out.println(name + ": faz alguma coisa");
    }
}

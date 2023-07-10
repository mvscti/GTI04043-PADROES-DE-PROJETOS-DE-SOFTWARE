package padroes.criacao.prototype;

public class PrototypeBeta implements Prototype{
    private String name = "BetaVersion";

    @Override
    public Prototype clone() {
        return new PrototypeBeta();
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

package padroes.criacao.prototype;

// 5. "Assina" o contrato clone().
// Cada classe chama "new" em si mesma para o cliente.
public class PrototypeAlpha implements Prototype{
    private String nome = "AlphaVersion";

    @Override
    public Prototype clone() {
        return new PrototypeAlpha();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void executa() {
        System.out.println(nome + ": faz alguma coisa");
    }
}

package padroes.comportamentais.strategy;

public class CartaoCredito {
    private int limite;
    private String numero;
    private String data;
    private String cvv;

    public CartaoCredito(String numero, String data, String cvv) {
        this.limite = 100_000;
        this.numero = numero;
        this.data = data;
        this.cvv = cvv;
    }

    public void setLimite(int quantia) {
        this.limite = quantia;
    }

    public int getLimite() {
        return this.limite;
    }
}

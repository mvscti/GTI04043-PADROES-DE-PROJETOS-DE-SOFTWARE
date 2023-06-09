package padroes.comportamentais.strategy;

public interface Strategy {
    boolean pagar(int quantia);
    void coletaDetalhesPagamento();
}
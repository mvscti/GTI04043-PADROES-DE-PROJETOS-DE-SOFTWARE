package padroes.comportamentais.strategy;

public class Venda {
    private int custoTotal = 0;
    private boolean estaFechado = false;

    public void processaVenda(Strategy strategy) {
        strategy.coletaDetalhesPagamento();
        // É aqui que coletamos e armazenamos dados de pagamento do Strategy 
        // (neste nosso exemplo, a inteface Strategy faz referência ao 'Compositor')
    }

    public void setCustoTotal(int custo) {
        this.custoTotal += custo;
    }

    public int getCustoTotal() {
        return custoTotal;
    }

    public boolean estaFechado() {
        return estaFechado;
    }

    public void setFechado() {
        estaFechado = true;
    }
}

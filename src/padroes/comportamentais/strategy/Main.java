package padroes.comportamentais.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
     private static Map<Integer, Integer> precoProdutos = new HashMap<>();
    private static BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
    private static Venda venda = new Venda();
    private static Strategy strategy;

    static {
        precoProdutos.put(1, 2200);
        precoProdutos.put(2, 1850);
        precoProdutos.put(3, 1100);
        precoProdutos.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!venda.estaFechado()) {
            int custo;

            String opcao;
            do {
                System.out.print("Por favor, selecione um produto:" + "\n" +
                        "1 - Placa-Mãe" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - SSD" + "\n" +
                        "4 - Memória" + "\n");
                int opcaoValor = Integer.parseInt(leitor.readLine());
                custo = precoProdutos.get(opcaoValor); //escolhe uma opção do Mapa (procura por chave)
                System.out.print("Total: ");
                int nItens = Integer.parseInt(leitor.readLine());
                venda.setCustoTotal(custo * nItens);
                System.out.print("Deseja continuar selecionando produtos para comprar? S/N: ");
                opcao = leitor.readLine();
            } while (opcao.equalsIgnoreCase("S"));

            if (strategy == null) {
                System.out.println("Por favor, selecione um método de pagamento:" + "\n" +
                        "1 - PayPal" + "\n" +
                        "2 - Cartão de Crédito");
                String meotodoPagamento = leitor.readLine();

                // Cria diferentes estratégias baseadas no valor de entrada do usuário.
                if (meotodoPagamento.equals("1")) {
                    strategy = new PagamentoComPayPal();
                } else {
                    strategy = new PagarComCC();
                }
            }

            //Escolhido o método de pagamento, o algoritmo a ser executado deve ser decidido em tempo de execução (PayPal ou CC)
            venda.processaVenda(strategy);

            System.out.print("Pagar " + venda.getCustoTotal()  + " reais continue comprando? P/C: ");
            String proceder = leitor.readLine();
            if (proceder.equalsIgnoreCase("P")) {
                // Finalmente, strategy manipula o pagamento.
                if (strategy.pagar(venda.getCustoTotal())) {
                    System.out.println("Pagamento realizado com sucesso");
                } else {
                    System.out.println("Falha! Por favor, verifique seus dados.");
                }
                venda.setFechado();
            }
        }
    }
}

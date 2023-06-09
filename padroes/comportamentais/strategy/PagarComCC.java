package padroes.comportamentais.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PagarComCC implements Strategy{
    private final BufferedReader LEITOR = new BufferedReader(new InputStreamReader(System.in));
    private CartaoCredito cartao;

    @Override
    public void coletaDetalhesPagamento() {
        try {
            System.out.print("Entre com o número do cartão de crédito: ");
            String numero = LEITOR.readLine();
            System.out.print("Entre com a data de expiração 'mm/aa': ");
            String data = LEITOR.readLine();
            System.out.print("Entre com o código CVV: ");
            String cvv = LEITOR.readLine();
            cartao = new CartaoCredito(numero, data, cvv);

            // Valida número do cartão de crédito...

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pagar(int quantia) {
        if (temCartao()) {
            System.out.println("Pagando " + quantia + " usando Cartão de Crédito.");
            cartao.setLimite(cartao.getLimite() - quantia);
            return true;
        } else {
            return false;
        }
    }

    private boolean temCartao() {
        return cartao != null; //verifica se existe uma instância de um CartaoCredito
    }
    
}

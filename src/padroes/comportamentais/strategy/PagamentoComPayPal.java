package padroes.comportamentais.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PagamentoComPayPal implements Strategy{
    private static final Map<String, String> BD = new HashMap<>();
    private final BufferedReader LEITOR = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String senha;
    private boolean logado;

    static {
        BD.put("amanda1985", "amanda@ya.com");
        BD.put("qwerty", "john@amazon.eu");
    }

    /**
     * coleta dados do consumidor customer's data.
     */
    @Override
    public void coletaDetalhesPagamento() {
        try {
            while (!logado) {
                System.out.print("Informe o email do usuário: ");
                email = LEITOR.readLine();
                System.out.print("Informe a senha: ");
                senha = LEITOR.readLine();
                if (verifica()) {
                    System.out.println("A verificação ocorreu com sucesso!");
                } else {
                    System.out.println("Email ou senha errados!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verifica() {
        setLogado(email.equals(BD.get(senha)));
        return this.logado;
    }

   
    @Override
    public boolean pagar(int quantia) {
        if (logado) {
            System.out.println("Pagando " + quantia + " usando PayPal.");
            return true;
        } else {
            return false;
        }
    }

    private void setLogado(boolean logado) {
        this.logado = logado;
    }    
}

package padroes.estruturais.bridge;

public class JanelaAviso extends JanelaAbstrata {
 
    public JanelaAviso(Janela j) {
        super(j);
    }
 
    @Override
    public void desenhar() {
        desenharJanela("Janela de Aviso");
        desenharBotao("Ok");
    }
 
}

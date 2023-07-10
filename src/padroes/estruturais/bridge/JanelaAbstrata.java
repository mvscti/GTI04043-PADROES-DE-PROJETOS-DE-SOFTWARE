package padroes.estruturais.bridge;

public abstract class JanelaAbstrata {
 
    protected Janela janela;
 
    public JanelaAbstrata(Janela j) {
        janela = j;
    }
 
    public void desenharJanela(String titulo) {
        janela.desenharJanela(titulo);
    }
 
    public void desenharBotao(String titulo) {
        janela.desenharBotao(titulo);
    }
 
    public abstract void desenhar();
 
}

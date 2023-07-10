package padroes.estruturais.bridge;

public class JanelaDialogo extends JanelaAbstrata {
 
    public JanelaDialogo(Janela j) {
        super(j);
    }
 
    @Override
    public void desenhar() {
        desenharJanela("Janela de Diálogo");
        desenharBotao("Botão Sim");
        desenharBotao("Botão Não");
        desenharBotao("Botão Cancelar");
    }
 
}

package padroes.estruturais.decorator;

import javax.swing.JFrame;


/**
 * Implementação de uma Janela Simples sem "scrollbar"
 */
public class SimpleWindowConcreteComponent extends JFrame implements Window{
    private static final long serialVersionUID = 1L;

    public SimpleWindowConcreteComponent(){
        super("Decorator");
    }

    @Override
    public void draw(){
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public String getDescription(){
        return "Janela Simples";
    }

  
}

package padroes.estruturais.decorator;

import javax.swing.JFrame;


/**
 * Classe abstrata "decorator". Perceba que ela implementa a inteface Window
 */
public abstract class WindowDecorator extends JFrame implements Window{
  
    private static final long serialVersionUID = 1L;

    protected Window decoratedWindow; //a janela sendo "decorada"


    public WindowDecorator(Window decoratedWindow){
        this.decoratedWindow=decoratedWindow;
    }

    @Override
    public void draw(){
        decoratedWindow.draw();
    }

    public JFrame getInstance(){
        return (JFrame) this.decoratedWindow;
    }
    
    
}

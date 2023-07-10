package padroes.estruturais.decorator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;


/**
 * O primeiro decorator concreto, que adiciona a funcionalidade de barra de rolagem horizontal
 */
public class HorizontalScrollBarDecorator extends WindowDecorator{

    private static final long serialVersionUID = 1L;

    public HorizontalScrollBarDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }

    @Override
    public void draw(){
        drawHorizontalScrollBar();
        decoratedWindow.draw();
    }

    private void drawHorizontalScrollBar() {
        JScrollPane scroll= new JScrollPane();
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
        getInstance().getContentPane().add(scroll);
    }

    @Override
    public String getDescription() {
       return decoratedWindow.getDescription()+" incluindo barra de rolagem horizontal";
    }

    
}

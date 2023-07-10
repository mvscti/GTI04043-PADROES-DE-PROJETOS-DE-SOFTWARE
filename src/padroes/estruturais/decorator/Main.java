package padroes.estruturais.decorator;
import javax.swing.JFrame;


public class Main {
    
    public static void main(String args[]){


        Window decoratedWindow=new HorizontalScrollBarDecorator(new SimpleWindowConcreteComponent());
        decoratedWindow.draw();
    }
}

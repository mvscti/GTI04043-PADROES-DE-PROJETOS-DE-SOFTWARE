package padroes.comportamentais.observer;
import java.util.List;
import java.util.ArrayList;


public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void add(Observer o) {
        observers.add(o);
    }

    /**
     * Retorna status de um subject
     * @return status
     */
    public int getState() {
        return state;
    }

    public void setState(int value) {
        this.state = value;
        execute();
    }

    /**
     * Uso como "Trigger" para atualizar observadores deste objeto
     */
    private void execute() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
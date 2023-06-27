package padroes.comportamentais.observer;

public class BinObserver extends Observer {
    public BinObserver(Subject subject) {
        this.subject = subject;
        //adiciona a si mesmo como um observador
        this.subject.add(this);
    }

    /*
     * Comportamento utilizado para quando a "trigger" de atualização deste observador for disparada
    */
    public void update() {
        System.out.print(" " + Integer.toBinaryString(subject.getState()));
    }
}

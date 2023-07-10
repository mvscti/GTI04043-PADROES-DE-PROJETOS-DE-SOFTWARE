package padroes.comportamentais.template_method;

abstract class Generalizacao{
    void encontraSolucao() {
        passoUm();
        passoDois();
        passoTres();
        passoQuatro();
    }
    
    private void passoUm() {
        System.out.println("Generalização.passoUm");
    }
    // Estes métodos são de interesse das subclasses e as mesmas devem implementar
    abstract void passoDois();
    abstract void passoTres();

    void passoQuatro() {
        System.out.println( "Genereralização.passoQuatro" );
    }
}
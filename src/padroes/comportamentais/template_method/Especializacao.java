package padroes.comportamentais.template_method;

abstract class Especializacao extends Generalizacao{
    protected void passoTres() {
        passo3_1();
        passo3_2();
        passo3_3();
    }
    
    private void passo3_1() {
        System.out.println("Especialização.passo3_1");
    }
    
    //Pode ser interesse uma outra subclasse implementar outros passos
    abstract protected void passo3_2();

    private void passo3_3() {
        System.out.println("Especializacao.passo3_3");
    }
}
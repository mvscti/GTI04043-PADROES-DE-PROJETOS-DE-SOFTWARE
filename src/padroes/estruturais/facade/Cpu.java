package padroes.estruturais.facade;
public class Cpu {

    public void start() {
       System.out.println("Inicialização inicial");
    }
    public void execute() {
       System.out.println("executa algo no processador");
    }
    public void load() {
       System.out.println("carrega registrador");
    }
    public void free() {
       System.out.println("libera registradores");
    }
}

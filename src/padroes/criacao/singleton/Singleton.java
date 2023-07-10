package padroes.criacao.singleton;

public final class Singleton {
    static private Singleton instance=null;
    static synchronized public Singleton getInstance()
    {
        if (instance == null)
        instance = new Singleton();
        return instance;
    }

    // Precisa ser declarado para não
    // ser criado automaticamente
    private Singleton(){
        //código do construtor entra aqui
    }

}
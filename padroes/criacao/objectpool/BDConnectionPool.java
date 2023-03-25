
/**
 * Classe que simula um objeto "custoso" a ser criado,
 * como uma conexão remota com um Banco de Dados
 */

package padroes.criacao.objectpool;
import java.util.Random;

class BDConnectionPool extends ObjectPool<Object> {
    private boolean estaAtivo=true;
 
    public BDConnectionPool(){
        super();
    }
 

    /**
     * Cria um objeto. Aqui, simulamos um objeto que pode demorar até 10 segundos para ser criado
     */
    
    public Object cria()
    {
        Random rand = new Random();
        int limiteSuperior = 10000;
        //Faz o código esperar, atraveś de um número aleatório, simulando uma criação custosa (de até 10 segundos)
        try {
            System.out.println("Estabelecendo conexão com Banco de Dados......");
            int tempo=rand.nextInt(limiteSuperior);
            Thread.sleep(tempo);
            System.out.println("Conexão estabelecida em "+(tempo/1000)+" segundos");

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return new Object();

    }

 
    /** Verifica se o objeto ainda está ativo. 
     * Por exemplo, se fosse uma classe de conexão com um Banco de Dados,
     * poderia verificar se esta conexão está ativa ou não, neste método
     */

    public boolean valida(Object o)
    {
        return this.estaAtivo;
    }
}
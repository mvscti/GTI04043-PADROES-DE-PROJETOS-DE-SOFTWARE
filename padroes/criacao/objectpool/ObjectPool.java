package padroes.criacao.objectpool;

import java.util.Queue;
import java.util.LinkedList;

/* Programa que demonstra a utilização o Padrão "Object Pool".
 * Utiliza um tipo genérico. Para saber mais sobre tipos genéricos do Java,
 * leia a documetação em https://docs.oracle.com/javase/tutorial/java/generics/types.html
 * 
 */
abstract class ObjectPool<T>{

    Queue<T> pool;
    ObjectPool(){
        pool = new LinkedList<T>();
    }
 
    /** Métodos abstratos */
    public abstract T cria();
    public abstract boolean valida(T o);
 
 
    synchronized T retira()
    {
        //Não há nenum objeto reutilizável na fila
        if (pool.isEmpty()){
            T objeto;
            objeto=cria();
            pool.add(objeto);
        }
        //retorna o elemento "cabeça" da fila e o remove dela. Para saber mais, leia a documentação
        // em https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
        return pool.poll();
    }
    synchronized void devolve(T t)
    {
        //verifica se o objeto está válido
        if (valida(t)){ 
            pool.add(t);
            System.out.println("Devolvendo o objeto para fila. A fila conta com "+pool.size()+" elementos");
            
        }    
    }
}

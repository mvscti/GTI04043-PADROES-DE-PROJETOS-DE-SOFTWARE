package padroes.criacao.objectpool;
class Cliente {
    public static void main(String args[])
    {
        // Criando um objeto de conexão
        BDConnectionPool pool = new BDConnectionPool();
        //Obtém uma conexão
        Object con = pool.retira();
        // Devolve a conexão
        pool.devolve(con);
    }
}
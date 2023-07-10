package padroes.criacao.prototype;

// 1. O "contrato" clone()
interface Prototype {
    Prototype clone();
    String getNome();
    void executa();
}
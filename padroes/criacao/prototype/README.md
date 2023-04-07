# Prototype
O padrão <strong>prototype</strong> é um padrão de projeto criacional que permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes. Pode ser usado para:

- Evitar criar um novo objeto utilizando a palavra ```new``` (o que diminui o custo de memória).
- Em vez de o cliente implementar um código que utiliza o operador ```new```, este utiliza o método ```clone()```, presente no protótipo e o método de uma fábrica (Factory Method ou Abstratct Factory), que fica encarregada de clonar o novo objeto. 

## Exemplo
Digamos que você tenha um objeto e você queira criar uma cópia dele (uma cópia exata). Primeiro, você tem que criar um novo objeto da mesma classe. Então você terá que ir por todos os campos do objeto original e copiar seus valores para o novo objeto.

Essa abordagem não funciona em todos os casos, pois nem todos os objetos podem ser copiados dessa forma (alguns campos de objeto podem ser privados e não serão visíveis fora do próprio objeto). Há ainda mais um problema nessa abordagem: uma vez que você necessita saber a classe do objeto para criar uma cópia, seu código se torna dependente daquela classe, o que em um projeto de software é prejudicial.

O padrão Prototype especifica o tipo de objeto a ser criado usando uma instância para criar protótipos. Os protótipos de novos produtos geralmente são construídos antes da produção total, mas, neste exemplo, o protótipo é passivo e não participa da própria cópia.  Um exemplo do mundo real onde isso ocorre é com a divisão mitótica de uma célula (resultando em duas células idênticas). Quando uma célula se divide, resultam duas células de genótipo idêntico. Em outras palavras, a célula se clona.

![exemplo_prototype](https://raw.githubusercontent.com/mvscti/GTI04043-PADROES-DE-PROJETOS-DE-SOFTWARE/main/padroes/criacao/prototype/prototype_example1.png)

O padrão Prototype delega o processo de clonagem para o próprio objeto que está sendo clonado. O padrão declara uma interface comum para todos os objetos que suportam clonagem. Essa interface permite que você clone um objeto sem acoplar seu código à classe daquele objeto. Geralmente, tal interface contém apenas um único método ```clonar```.

A implementação do método ```clonar``` é muito parecida em todas as classes. <strong>O método cria um objeto da classe atual e carrega todos os valores de campo para do antigo objeto para o novo</strong>. É possível até mesmo copiar campos privados. 

Um objeto que suporta clonagem é chamado de um protótipo. Quando seus objetos têm dúzias de campos e centenas de possíveis configurações, cloná-los pode servir como uma alternativa à subclasses.

 ## Forma de implementar
```java
// 1. O "contrato" clone()
interface Prototype {
    Prototype clone();
    String getNome();
    void executa();
}

public class PrototypeFactory {
    // 2. "registro" de objetos protótipos
    private static List<Prototype> prototypes = new ArrayList<>();

    // Adiciona um recurso para o atributo Prototype
    public static void addPrototype(Prototype p) {
        prototypes.add(p);
    }

    public static Prototype createPrototype(String nome) {
        // 4. O "construtor virtual"
        for (Prototype p : prototypes) {
            if (p.getNome().equals(nome)) {
                return p.clone();
            }
        }
        System.out.println(nome + ": não existe");
        return null;
    }    
}
// 5. "Assina" o contrato clone().
// Cada classe chama "new" em si mesma para o cliente.
public class PrototypeAlpha implements Prototype{
    private String nome = "AlphaVersion";

    @Override
    public Prototype clone() {
        return new PrototypeAlpha();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void executa() {
        System.out.println(nome + ": faz alguma coisa");
    }
}


public class PrototypeBeta implements Prototype{
    private String nome = "BetaVersion";

    @Override
    public Prototype clone() {
        return new PrototypeBeta();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void executa() {
        System.out.println(nome + ": faz alguma coisa");
    }
}

class ReleasePrototype implements Prototype {
    private String nome = "ReleaseCandidate";
    @Override
    public Prototype clone() {
        return new ReleasePrototype();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void executa() {
        System.out.println(nome + ": faz o trabalho real");
    }
}


public class Main {
    public static void main(String[] args) {
        String[] opcoes={"AlphaVersion","BetaVersion"};
        if (opcoes.length > 0) {
            inciaPrototipos();
            List<Prototype> prototypes = new ArrayList<>();
            // 6. Cliente não usa o operador 'new'
            for (String protoName : opcoes) {
                Prototype prototype = PrototypeFactory.createPrototype(protoName);
                if (prototype != null) {
                    prototypes.add(prototype);
                }
            }
            for (Prototype p : prototypes) {
                p.executa();
            }
        } else {
            System.out.println("Informe os nomes dos protótipos");
        }
    }

    // 3. Popular o "registro"
    public static void inciaPrototipos() {
        PrototypeFactory.addPrototype(new PrototypeAlpha());
        PrototypeFactory.addPrototype(new PrototypeBeta());
        PrototypeFactory.addPrototype(new ReleasePrototype());
    }    
}

```
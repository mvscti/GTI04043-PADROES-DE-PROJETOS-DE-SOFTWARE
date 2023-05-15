# Proxy
Fornece um substituto para um objeto de modo que as interações não sejam feitas diretamente com o
objeto e sim com o substituto. O objeto proxy possui a mesma interface do objeto original e também possui uma referência ao objeto real, de modo que pode encaminhar as solicitações ao mesmo.

<img src="https://refactoring.guru/images/patterns/content/proxy/proxy.png?id=efece4647fb11e3f7539291796327666" />

## Problema
Suponha que você tenha um conjunto de objetos que consume uma grande quantidade de recursos do sistema (como por exemplo, um objeto que se conecta em uma base de dados remota. Cada cliente tem o seu) e este objeto é importante, mas você não o utiliza a todo momento.
![cliente_sem_proxy](https://refactoring.guru/images/patterns/diagrams/proxy/problem-en.png?id=b36e65189e939de5dc809636c1946a43)

O padrão proxy poderia ajudar, fornecendo um proxy (ou seja, um representante) para que todo cliente se conecte a ele. O objeto proxy tem a mesma interface que o objeto ao qual ele representa:

![cliente_com_proxy](https://refactoring.guru/images/patterns/diagrams/proxy/solution-en.png?id=ab36b8b03fabf92c7dd10ad87507b78c)

<strong>Uma informação importante</strong>: este exemplo pode lhe confundir em relação ao padrão criacional ```object pool``` ou o padrão ```facade```, mas há diferenças substanciais: normalmente, o proxy é uma espécie de "centralizador" das requisições de objetos de mesma instância, o que não ocorre com os outros padrões mencionados. No exemplo mostrado anteriormente, o proxy é um proxy de apenas objetos clientes. Uma "fachada", além de esconder implementações internas de um código (não é este o objetivo de um proxy), pode servir a diversos outros objetos, de diversas outras instâncias. Ou seja, um proxy representa um objeto real, a "fachada", por sua vez, pode representar diversos objetos reais.


## Exemplos de uso
- proxy remota: Objeto real encontra-se em uma máquina remota e o proxy encobre as dificuldades inerentes ao acesso remoto

- proxy virtual: Pode ser muito caro manter o objeto na memória de modo que a proxy representa o objeto que é criado apenas quando existe necessidade real.

- cache proxy: Múltiplos clientes locais podem dividir resultados de uma operação cara

- firewall proxy: Proteger clientes locais do lado externo da rede.

- counting proxy: Conta o número de acesso ao objeto. Útil para gerência de memória.
## Solução

![diagrama_classes](https://sourcemaking.com/files/v2/content/patterns/Proxy1.png)

### Exemplo com o mundo real
Um cartão de crédito é um proxy para uma conta bancária, que é um proxy para dinheiro físico. Ambos implementam a mesma interface: podem ser usados ​​para fazer um pagamento. Isso  pe interessante para o consumidor porque não há necessidade de carregar muito dinheiro em espécie. Isos também é vantajoso para o dono de uma loja, pois a receita de uma transação é adicionada eletronicamente à conta bancária da loja, sem o risco de perder o depósito ou ser roubado no caminho para o banco.

![pagamento_proxy](https://sourcemaking.com/files/v2/content/patterns/Proxy_example1.png)

O código do exemplo deste repositório demonstra o uso de um cache proxy de um objeto que exibe uma imagem. Antes de executar os fontes, analise o diagrama de classes do exemplo:

![diagrama_classes_exemplo](https://edirlei.com/aulas/poo/POO_Aula_13_GOF_Proxy_Flyweight_2015_files/img_05.png)


# Object Pool
O padrão <strong>object pool</strong> (também conhecido como pool de recursos) é usado ​​para gerenciar o cache de objetos. Ou seja, ele gerencia o reúso de objetos quando a criação deles é cara (ou quando apenas um pequeno número de objetos pode ser criado).

 Um cliente com acesso a um pool de objetos pode evitar a criação de um novo objeto, solicitando ao pool um que já tenha sido instanciado. Geralmente, o pool será um pool crescente, ou seja, o próprio pool criará novos objetos se o pool estiver vazio, ou podemos ter um pool que restringe o número de objetos criados. 
## Exemplo
O object pool é semelhante a um almoxarifado de um escritório. Quando um novo (a) funcionário (a) é contratado (a), o (a) gerente (a) do escritório deve preparar um espaço de trabalho para ele (a). Ele (a) calcula se há ou não um equipamento sobressalente no depósito do escritório. Se sim, ele (a) usa. Caso contrário, ele (a) faz um pedido para comprar novos equipamentos. No caso de um (a) funcionário (a) ser demitido (a), seu equipamento é transferido para o depósito, onde poderá ser levado quando for necessário um novo local de trabalho.

![exemplo_object_pool](https://sourcemaking.com/files/v2/content/patterns/Object_pool_example1.png)

 ## Casos de Uso
 Suponha que um programa acesse um Banco de Dados utilizando uma rede. A ideia é que cada
parte do programa que precise de acesso a esse BD crie uma conexão e a utize. Isso pode se tornar um problema, porque criar conexões pode ser um processo lento, a rede pode limitar o número de conexões simultâneas, etc. Abaixo, podemos destacar alguns dos casos onde este padrão pode ser aplicado:

* O número de instâncias que se pode criar é limitado.
* Criar novas instâncias é um processo muito caro.
* Criação de novas instâncias pode ser evitada utilizando-se reúso de objetos que já foram criados (e seriam descartados).
* O número de instâncias utilizadas simultaneamente é baixo.

O diagrama de classes abaixo demonstra como funciona este padrão:

![diagrama_classe](https://raw.githubusercontent.com/mvscti/GTI04043-PADROES-DE-PROJETOS-DE-SOFTWARE/main/padroes/criacao/objectpool/object_pool.gif)

* Reusable: objeto que se deseja “reaproveitar”
* Cliente: utiliza os objetos “reaproveitáveis”.

## Forma de implementar
 1. Criar uma classe ```ObjectPool```, com uma coleção de objetos que pode ser reaproveitável
 2. Criar métodos de ```retirar``` e ```obter``` objetos desta coleção
 3. <strong>Garanta</strong> que sua classe ```ObjectPool``` seja um singleton!
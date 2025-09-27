# Singleton
Em algum momento de um projeto de software orientado a objetos pode ser necessária a garantia de que determinados objetos tenham apenas uma única instância. Por exemplo, essa única instância pode compartilhar algo com outros objetos, ou guardar informações contextuais que devem ficar disponíveis a qualquer outro objeto, e a qualquer momento (um sistema operacional, por exemplo). Outro exemplo, é quando uma instância controla um recurso compartilhado e deve prover um acesso ordenado a recurso, como conexão a banco de dados, <i>logger</i>, <i>driver</i> de dispositivos,
etc. 

Uma forma elegante e segura de fazer isso é utilizando o padrão conhecido como **singleton**. Neste padrão, há a garantia de que uma classe desejada terá apenas uma única instância. O diagrama de classes abaixo demonstra isso:

![diagrama_classe](https://raw.githubusercontent.com/mvscti/GTI04043-PADROES-DE-PROJETOS-DE-SOFTWARE/main/src/padroes/criacao/singleton/singleton.png)

## Forma de implementar
 Criar uma classe para "armazenar" uma instância (como membro estático) e outro para retornar esta instância. Dependendo da linguagem de programação que você esteja trabalhando, crie um construtor do tipo privado, para impedir que outras classes possam instanciar um objeto do nosso singleton (esse exemplo se aplica para Java, dentre outras linguagens). O método que retornará a única referência desta classe sempre será chamado para nos retornar a única instância dela.

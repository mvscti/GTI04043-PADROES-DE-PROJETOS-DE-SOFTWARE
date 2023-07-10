# Facade
Padrão estrutural que fornece uma interface simplificada para uma biblioteca, um framework, ou qualquer conjunto complexo de classes. Ou seja, oculta toda a complexidade de uma ou mais classes através de uma Facade (fachada). Desta forma, o uso deste padrão permite com que partes de um sistema possam ser omitidas e acessadas por terceiros, intermediadas pela facade.


![facade](https://refactoring.guru/images/patterns/content/facade/facade.png?id=1f4be17305b6316fbd548edf1937ac3b)

Os padrões Adapter e Decorator se assemelham ao padrão facade, porém existem diferenças fundamentais entre os três.

## Exemplos de uso
- Uma ```API REST``` é uma facade, pois encapsula partes de uma aplicação e permite com que os utilizadores da API interajam com a aplicação (de forma planejada, por quem desenvolve a API), sem ter o conhecimento de detalhes de implementação da aplicação.
- Um ```controller``` no padrão ```MVC``` também é considerado uma facade, pois intermedia a comunicação entre as camadas visão e modelo.

## Solução
O cliente utiliza algum método/função oferecido pela fachada, sendo que esta, por sua vez, gerencia operações mais complexas da aplicação, como acesso a outras classes e bibiotecas.


![diagrama_classes](https://refactoring.guru/images/patterns/diagrams/facade/example.png?id=2249d134e3ff83819dfc19032f02eced)

Normalmente, a fachada oferece respostas ou mecanismos "fáceis" para coisas "difíceis", como por exemplo: "ligar um computador" (conforme os exemplos neste repositório). Este processo envolve operações de manipulação de CPU, Discos de Armazenamento e Memória. O padrão fornece um método ```ligarComputador()``` e neste método, toda a complexidade do hardware ficaria omitida a quem chamasse o método.
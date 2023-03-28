# Factory Method
O padrão <strong>Factory Method</strong> (método de fábrica) define uma interface para criar um objeto, mas deixa as subclasses decidirem que classe instanciar. O Factory Method permite adiar a instanciação para as subclasses. Neste padrão, um construtor "virtual" deve ser definido, pois o operador ```new``` pode ser prejudicial.

 
## Exemplo
Imagine uma fábrica de brinquedos de plástico, onde o fabricante processa pó de moldagem de plástico e injeta o plástico em moldes, com as formas desejadas. A classe do brinquedo (carrinho, personagem, etc.) é determinada pelo molde, como pode ser visto no diagrama de classes abaixo:

![exemplo_factory_method](https://sourcemaking.com/files/v2/content/patterns/Factory_Method_example1.png)

Neste caso, podemos criar (instanciar) o qualqer brinquedo (objeto) apenas tendo como base o molde (interface).

 ## Casos de Uso
* Uma classe não pode antecipar as classes dos objetos
que devem ser criados.
* Uma classe quer que suas subclasses especifiquem os
objetos que devem ser criados.
* Necessidade de delegar responsabilidade para classes
auxiliares.

## Estrutura
Uma definição bem comum do  método de fábrica é: um método ```static``` de uma classe, que retorna um objeto do tipo dessa classe. Mas, ao contrário de um construtor, o objeto real que ele retorna pode ser uma instância de uma subclasse. Ao contrário de um construtor, um objeto existente pode ser reutilizado, em vez de um novo objeto ser criado. Ao contrário de um construtor, os factory methods podem ter nomes diferentes e mais descritivos (por exemplo, ```Color.make_RGB_color(float vermelho, float verde, float azul)``` e ```Color.make_HSB_color(float tonalidade, float saturação, float brilho)```.

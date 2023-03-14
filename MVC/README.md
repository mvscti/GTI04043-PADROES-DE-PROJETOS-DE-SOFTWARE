# Padrão MVC - (Model-View-Controller)
Este é um padrão de arquitetura de software, amplamente utilizado em projetos. Da sigla, em inglẽs, (M)odel, (V)iew e (C)ontroller, é empregado quando se deseja separar os dados da aplicação do layout (view), fazendo com que as respostas sejam mais rápidas e dinâmicas.

## Model
O Modelo representa uma ou mais entidades do mundo real. Por exemplo, uma pessoa, um automóvel, uma impressora, dentre outros. Uma fácil associação é com o  modelo conceitual de Banco de Dados, onde cada entidade representa alguma entidade do mundo real (de um domínio específico). Num projeto de software orientado a objetos, todas as classes que fazem parte do modelo são aquelas que representam as entidades de um modelo conceitual de Banco de Dados, por exemplo. Mais tecnicamente, uma classe modelo pode representar um objeto persistente, ou seja, representa alguma entidade do mundo real e pode ser armazenada em memória secundária, como em um Banco de Dados (se relacional, pode representar uma tabela do Banco de Dados). 

## Controller
Responsável por intermediar as requisições de dados das classes modelo e o layout (gráfico ou não). Ou seja, as classes controladoras processam eventos(salvar dados, criar novos dados, listas dados, etc) e despacham para as classes modelo.

## View
A visão trata-se do "fronte" de uma aplicação, podendo ser gráfica ou não. Essa camada é responsável por apresentar as informações de forma visual ao usuário. Em seu desenvolvimento, devem ser aplicados apenas recursos ligados a aparência, como mensagens, botões ou telas. 

Uma importante observação é que a boa parte das aplicações atuais são desenvolvidos em frameworks (e não em uma linguagem de programação "nativa") e boa parte destes frameworks são projetados para que as aplicações sejam desenvolidas no padrão MVC.

### Exemplo de uma aplicação
Há um exemplo simples de uma aplicação, em Python, desenvolvida no padrão MVC. Há um arquivo (`db.txt`), que simula o nosso banco de dados de pessoas, a classe Pessoa (no arquivo `model.py`), representa todas as pessoas do nosso pequeno banco de dados. A dinâmic da aplicação pode ser vsta no diagrama de sequência abaixo:
![diagrama_sequencia](https://raw.githubusercontent.com/mvscti/GTI04043-PADROES-DE-PROJETOS-DE-SOFTWARE/main/MVC/mvc_modelo.png)


Para executar a aplicação:
* `python3 controller.py`


#Créditos: https://sourcemaking.com/design_patterns/factory_method/python/1

"""
Define uma inerface para criar um objeto, mas permite cm que as subclasses
decidam qual classe instanciar.
"""

import abc


class Creator(metaclass=abc.ABCMeta):
    """
    Declare o método da fábrica, que retorna um objeto do tipo 'Produto'.
    O criador também pode definir uma implementação padrão do método da fábrica
    que retorna um objeto padrão do tipo 'ConcreteProduct'. Chame
    o método da fábrica para criar um objeto 'Produto'.
    """

    def __init__(self):
        self.product = self._factory_method()

    @abc.abstractmethod
    def _factory_method(self):
        pass

    def faz_algo(self):
        self.product.interface()


class ConcreteCreator1(Creator):
    """
    Sobrescreve o método da fábrica para retornar uma instance de um
    'ConcreteProduct1'.
    """
    def _factory_method(self):
        return ConcreteProduct1()



class ConcreteCreator2(Creator):
    """
    Sobrescreve o método da fábrica para retornar uma instance de um
    'ConcreteProduct1'.
    """

    def _factory_method(self):
        return ConcreteProduct2()


class Product(metaclass=abc.ABCMeta):
    """
    Define a interface de objetos que a fábrica cria
    """

    @abc.abstractmethod
    def interface(self):
        pass


class ConcreteProduct1(Product):
    """
    Implementa a interface 'Produto'
    """

    def interface(self):
        pass


class ConcreteProduct2(Product):
    """
    Implementa a interface 'Produto'
    """

    def interface(self):
        pass


def main():
    concrete_creator = ConcreteCreator1()
    concrete_creator.product.interface()
    concrete_creator.faz_algo()


if __name__ == "__main__":
    main()

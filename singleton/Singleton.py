#Singleton em Python, baseado no livro da 'Gangue dos Quatro'
#Créditos: https://python-patterns.guide/gang-of-four/singleton/
class Singleton(object):
    _instance = None

    def __init__(self):
        raise RuntimeError('Chame por instance()')

    @classmethod
    def instance(cls):
        if cls._instance is None:
            print('Criando nova instância')
            cls._instance = cls.__new__(cls)
            # Códigos adicionais entram aqui.
        return cls._instance
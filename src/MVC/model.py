import json

class Pessoa(object):
    def __init__(self, nome = None, sobrenome = None):
        self.nome = nome
        self.sobrenome = sobrenome
    #retorna o nome de uma Pessoa
    def getName(self):
        return ("%s %s" % (self.nome,self.sobrenome))

    @classmethod
    #retorna todas as pessoas armazenadas em db.txt como uma lista de objetos do tipo Pessoa
    def getAll(self):
        database = open('db.txt', 'r')
        result = []
        json_list = json.loads(database.read())
        for item in json_list['0']:
            pessoa = Pessoa(item['nome'], item['sobrenome'])
            result.append(pessoa.getName())
        return result

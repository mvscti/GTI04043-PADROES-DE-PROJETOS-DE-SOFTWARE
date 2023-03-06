from model import Pessoa
import view

def showAll():
    #obtém uma lista de todos os objetos do tipo 'Pessoa'
    pessoa_em_db = Pessoa.getAll()
    #chama a view
    return view.showAllView(pessoa_em_db)

def start():
    view.startView()
    entrada = input()
    if entrada == 's':
        return showAll()
    else:
        return view.endView()

if __name__ == "__main__":
    #iniciando a função controlador
    start()

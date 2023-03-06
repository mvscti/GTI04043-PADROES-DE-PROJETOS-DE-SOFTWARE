from model import Pessoa


def showAllView(list):
    print(f'Há {len(list)} usuário(s) no banco de dados')
    for item in list:
        print(item)
def startView():
    print('MVC - um exemplo simples')
    print('Deseja ver todo mundo cadastrado? [s/n]')

def endView():
    print('Tchau!')

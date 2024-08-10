import random

def criarListaAleatoria(tamanho):
    lista = []
    for i in range(tamanho):
        lista.append(random.randint(1, 90))

    return lista

tamanhoLista = int(input("Digite o tamanho para a lista: "))
listaAleatoria = criarListaAleatoria(tamanhoLista)

for i in range(len(listaAleatoria)):
    if listaAleatoria[i] % 3 == 0:
        print('Número múltiplo de 3: ', listaAleatoria[i])
    elif listaAleatoria[i] % 2 == 0:
        print('Número par: ', listaAleatoria[i])
    else:
        print('Número ímpar: ', listaAleatoria[i])

print(listaAleatoria)

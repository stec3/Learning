def filtra_nomi(nomi) :
    risultato = []
    for nome in nomi:
        if nome[0] == "A":
            risultato.append(nome)
    return risultato

nomi = ["Alice", "Bob", "Anna", "anastasia", "Stefano"]
print(filtra_nomi(nomi))
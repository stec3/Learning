def filtra_pari(numeri) :
    risultato = []
    for n in numeri:
        if n % 2 == 0:
            risultato.append(n)
    return risultato
    
miei_numeri = [1, 2, 3, 4, 5, 6, 7, 8]
print(filtra_pari(miei_numeri))
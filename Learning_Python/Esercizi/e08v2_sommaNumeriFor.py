## chiedo all'utente di inserire 10 numero e li sommo
print("Inserire 10 numeri dei quali si vuole ottenere la somma totale.")
somma = 0
for i in range(10):
    numero = float(input(f"Inserire il {i+1}° numero: "))
    somma += numero
    print(f"La somma provvisoria è: {somma}")
print(f"La somma totale è: {somma}")
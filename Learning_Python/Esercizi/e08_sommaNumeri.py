## chiedo all'utente 5 numeri e spiego quale sarà il risultato
print("Inserire 5 numeri dei quali si vuole ottenere la somma totale.")
 
## chiedo il primo numero e lo salvo in una variabile
numero1 = float(input("Inserire il primo numero: "))

## chiedo il secondo numero, lo salvo in una variabile e inizio a dare la somma provvisoria
numero2 = float(input("Inserire il secondo numero: "))
print (f"La somma provvisoria è: {numero1 + numero2}")

## chiedo il terzo numero, lo salvo in una variabile e continuo a dare la somma provvisoria
numero3 = float(input("Inserire il terzo numero: "))
print (f"La somma provvisoria è: {numero1 + numero2 + numero3}")

## chiedo il quarto numero, lo salvo in una variabile e continuo a dare la somma provvisoria
numero4 = float(input("Inserire il quarto numero: "))
print (f"La somma provvisoria è: {numero1 + numero2 + numero3 + numero4}")

## chiedo il quinto numero, lo salvo in una variabile e do la somma finale
numero5 = float(input("Inserire il quinto numero: "))
print (f"La somma totale è: {numero1 + numero2 + numero3 + numero4 + numero5}")
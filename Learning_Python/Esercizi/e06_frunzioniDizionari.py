def descrivi_sensore(sensore):
    print(f"Sensore: {sensore['tipo']}")
    print(f"Valore: {sensore['valore']}")
    print(f"Posizione: {sensore['posizione']}")

s1 = {"tipo": "temperature", "valore": 23.5, "posizione": "Piano 1"}
s2 = {"tipo": "umidità", "valore": 65.2, "posizione": "Piano 3"}

descrivi_sensore(s1)
descrivi_sensore(s2)
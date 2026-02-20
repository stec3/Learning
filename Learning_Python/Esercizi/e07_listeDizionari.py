sensori = [
    {"id": 1, "tipo": "temperatura", "valore": 23.5, "posizione": "Piano 1"},
    {"id": 2, "tipo": "umidità", "valore": 65.2},
    {"id": 3, "tipo": "temperature", "valore": 19.1},
]

for s in sensori:
    print(f"Sensore {s['id']}: {s['tipo']} = {s['valore']}")
edificio = {
    "nome": "Torre Lotta",
    "piano": 3,
    "sensore": {
        "tipo": "umidità",
        "valore": 65.2
    }
}

print(edificio["nome"])
print(edificio[("sensore")]["tipo"])
print(edificio[("sensore")]["valore"])

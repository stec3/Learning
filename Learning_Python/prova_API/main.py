from fastapi import FastAPI

app = FastAPI()

@app.get('/')
def leggi_root():
    return {'messaggio': 'Benvenuto nella mia API!'}

@app.get('/sensori')
def leggi_sensori():
    sensori = [
        {'id': 1, 'tipo': 'temperatura', 'valore': 23.5},
        {'id': 2, 'tipo': 'umidità', 'valore': 65.2},
    ]
    return sensori

@app.get('/sensori/{id}')
def leggi_sensore(id: int):
    sensori = [
        {'id': 1, 'tipo': 'temperatura', 'valore': 23.5},
        {'id': 2, 'tipo': 'umidità', 'valore': 65.2},
    ]
    for s in sensori:
        if s['id'] == id:
            return s
    return {'errore': 'sensore non trovato'}
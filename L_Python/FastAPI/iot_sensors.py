from fastapi import FastAPI, HTTPException
from pydantic import BaseModel
from datetime import datetime
from typing import Optional

app = FastAPI()

# Modello del sensore
class SensorReading(BaseModel):
    sensor_id: str
    location: str
    temperature: float
    humidity: Optional[float] = None

# Database in memoria
readings = []

# GET - tutte le letture
@app.get("/sensors")
def get_all_readings():
    return readings

# GET - letture per location
@app.get("/sensors/{location}")
def get_by_location(location: str):
    result = [r for r in readings if r["location"] == location]
    if not result:
        raise HTTPException(status_code=404, detail="Nessun sensore trovato")
    return result

# POST - il sensore manda un nuovo dato
@app.post("/sensors")
def add_reading(data: SensorReading):
    reading = {
        "sensor_id": data.sensor_id,
        "location": data.location,
        "temperature": data.temperature,
        "humidity": data.humidity,
        "timestamp": datetime.now().isoformat()
    }
    readings.append(reading)
    return {"message": "Dato salvato!", "data": reading}

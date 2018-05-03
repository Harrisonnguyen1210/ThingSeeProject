package com.example.android.thingseeproject;

/**
 * Created by Hung on 18/04/2018.
 */

public class SensorValue {
    double temp;
    double lux;
    double hum;
    double pressure;
    double impact;
    double latitude;
    double longitude;
    double energy;
    double speed;

    public SensorValue() {
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
         this.temp = temp;
    }

    public double getLux() {
        return lux;
    }

    public void setLux(double lux) {
        this.lux = lux;
    }

    public double getHum() {
        return hum;
    }

    public void setHum(double hum) {
        this.hum = hum;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getImpact() {
        return impact;
    }

    public void setImpact(double impact) {
        this.impact = impact;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

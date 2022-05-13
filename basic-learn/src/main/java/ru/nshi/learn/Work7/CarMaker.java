package ru.nshi.learn.Work7;

import java.util.ArrayList;
public class CarMaker
{
    private String carMakerName;
    public ArrayList<Car> cars = new ArrayList<Car>();
    public CarMaker(String carMakerName) {
        this.carMakerName = carMakerName;
    }
    public ArrayList<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return carMakerName;
    }

    public String getCarMakerName(){return carMakerName;}

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
    public void setCarMakerName(String carMakerName) {
        this.carMakerName = carMakerName;
    }
}

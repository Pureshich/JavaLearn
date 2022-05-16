package ru.nshi.learn.Work7;

import java.util.HashSet;
import java.util.Set;
public class Car
{
    private String carModel;
    private CarMaker carMaker;
    private String modelYear;
    private String color;
    static Set<CarMaker> makersSet = new HashSet<CarMaker>();
    @Override
    public String toString() {
        return this.carModel + ", "
            + this.carMaker.toString() + ", "
            + this.modelYear + ", "
            + this.color;
    }
    public static Car stringToCar(String row) {
        String[] values = row.split(",");
        Car car = new Car();
        car.setCarModel(values[0]);
        car.setCarMaker(new CarMaker(values[1]));
        car.setModelYear(values[2]);
        car.setColor(values[3]);
        makersSet.add(new CarMaker(values[1]));
        car.carMaker = makersSet.stream()
            .filter( Cmaker -> Cmaker.getCarMakerName().equals(values[1]) )
            .findAny().get();
        car.carMaker.getCars().add(car);
        return car;


    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setCarMaker(CarMaker carMaker) {
        this.carMaker = carMaker;
    }
    public  String getColor(){return color;}
    public CarMaker getCarMaker()
    {
        return carMaker;
    }
    public String info()
    {
        return carModel+" "+color;
    }
}

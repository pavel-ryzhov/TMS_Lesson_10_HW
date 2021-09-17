package task4;

import task4.car.Car;

import java.util.HashMap;

public class Garage {
    private HashMap<Car, Integer> cars = new HashMap<>();

    public void addCar(Car car){
        if (cars.containsKey(car)){
            cars.put(car, cars.get(car) + 1);
        }else {
            cars.put(car, 1);
        }
    }
    public void removeCar(Car car){
        if (!cars.containsKey(car))return;
        if (cars.get(car) == 1){
            cars.remove(car);
        }else {
            cars.put(car, cars.get(car) - 1);
        }
    }
    public int getAmountOfCars(Car car){
        return cars.getOrDefault(car, 0);
    }
}

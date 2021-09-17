package task4;

import task4.car.Bus;
import task4.car.CargoCar;
import task4.car.ElectricCar;
import task4.car.RightSteelingWheelCar;

/**
 * Создать абстрактный класс Car, представляющий собой автомобиль.
 * 	Добавить в него поля: марка, модель, год выпуска + несколько своих.
 * 	Создать 4 класса, являющихся наследниками Car.
 * 	Переопределить во всех 3-х классах методы equals(), hashCode() и toString()
 * 	Создать класс Garage, хранящий в себе HashMap автомобилей,
 * 	в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.
 * 	Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного вида автомобилей.
 * 	Продемонстрировать работу гаража.
 */
public class Main {
    public static void main(String[] args) {
        CargoCar cargoCar1 = new CargoCar(75, 10, 10, "man", "3c", 2015, "red", 1000);
        CargoCar cargoCar2 = new CargoCar(75, 10, 10, "man", "3c", 2015, "red", 1000);
        ElectricCar electricCar1 = new ElectricCar(75, "tesla", "3d", 2015, "red", 200);
        ElectricCar electricCar2 = new ElectricCar(75, "tesla", "3d", 2015, "red", 200);
        Bus bus = new Bus(75, 10, 12, "maz", "674387", 2015, "blue", 400);
        RightSteelingWheelCar rightSteelingWheelCar = new RightSteelingWheelCar("toyota", "8923", 2014, "grey", 200);

        Garage garage = new Garage();

        garage.addCar(cargoCar1);
        garage.addCar(cargoCar2);
        garage.addCar(electricCar1);
        garage.addCar(electricCar2);
        garage.addCar(bus);
        garage.addCar(rightSteelingWheelCar);

        garage.removeCar(electricCar1);

        System.out.println(cargoCar1 + ": " + garage.getAmountOfCars(cargoCar1));
        System.out.println(electricCar1 + ": " + garage.getAmountOfCars(electricCar1));
        System.out.println(bus + ": " + garage.getAmountOfCars(bus));
        System.out.println(rightSteelingWheelCar + ": " + garage.getAmountOfCars(rightSteelingWheelCar));
    }
}

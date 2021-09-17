package task4.car;

import java.util.Objects;

public class ElectricCar extends Car{
    private int batteryCapacity;

    public ElectricCar(int batteryCapacity, String brand, String model, int yearOfIssue, String color, int power) {
        this.batteryCapacity = batteryCapacity;
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.color = color;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectricCar that = (ElectricCar) o;
        return batteryCapacity == that.batteryCapacity && super.equals(that);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity);
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                "Car=" + super.toString() +
                '}';
    }
}

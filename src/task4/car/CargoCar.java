package task4.car;

import java.util.Objects;

public class CargoCar extends Car{
    private int maxCargoWeight;
    private int length;
    private int height;

    public CargoCar(int maxCargoWeight, int length, int height, String brand, String model, int yearOfIssue, String color, int power) {
        this.maxCargoWeight = maxCargoWeight;
        this.length = length;
        this.height = height;
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
        CargoCar cargoCar = (CargoCar) o;
        return maxCargoWeight == cargoCar.maxCargoWeight && length == cargoCar.length && height == cargoCar.height && super.equals(cargoCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxCargoWeight, length, height);
    }

    @Override
    public String toString() {
        return "CargoCar{" +
                "maxCargoWeight=" + maxCargoWeight +
                ", length=" + length +
                ", height=" + height +
                ", Car=" + super.toString() +
                '}';
    }
}
